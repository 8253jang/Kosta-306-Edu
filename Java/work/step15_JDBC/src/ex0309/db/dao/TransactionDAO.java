package ex0309.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex0309.db.util.DbManager;



public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		
		//로드 연결 실행 닫기
		Connection con=null;
		
		try {
			con = DbManager.getConnection();
			
			//auto commit을 해지한다.
			con.setAutoCommit(false);
			
			// 출금=인출 하기
			int result = this.withdraw(con, outputAccount, money);
			if(result==0)throw new SQLException("출금계좌 오류로 계좌이체 실패하셨습니다.");
			
			// 입금하기
			result = this.deposit(con, inputAccount, money);
			if(result==0)throw new SQLException("입금계좌 오류로 계좌이체 실패하셨습니다.");
			
			//잔액확인한다.
			if( this.balanceCheck(con, inputAccount) ) {
			   throw new SQLException("입금계좌 총 금액 초과로 계좌이체 실패하였습니다.");	
			}
			
			//모든 성공
			System.out.println("계좌 이체 완료되었습니다.");
			
		}catch(SQLException e) {
			//e.printStackTrace();
			System.out.println( e.getMessage() );
			try {
		      con.rollback();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
			
		}finally {
			try {
			 con.commit();// 저장완료
			}catch (Exception e) {
				e.printStackTrace();
			}
			 DbManager.dbClose(con, null);
		}	
	}
	
	/**
	 * 출금하기
	 * update bank set balance=balane-인출금액 where account = 출금계좌번호;
	 * */
	public int withdraw(Connection con , String outputAccount,  int money)throws SQLException{
		PreparedStatement ps=null;
		String sql="update bank set balance=balance-? where account = ?";
		int result=0;
		try {
		  ps = con.prepareStatement(sql);
		  ps.setInt(1, money);
		  ps.setString(2, outputAccount);
		  
		  result = ps.executeUpdate();
		  
		}finally {
			DbManager.dbClose(null, ps);
		}
		
		return result;
	}
	
	/**
	 * 입금하기 
	 * update bank set balance=balance+인출금액 where account =입금계좌번호;
	 * */
     public int deposit(Connection con , String inputAccount,  int money)throws SQLException{
    	 PreparedStatement ps=null;
 		String sql="update bank set balance=balance+? where account = ?";
 		int result=0;
 		try {
 		  ps = con.prepareStatement(sql);
 		  ps.setInt(1, money);
 		  ps.setString(2, inputAccount);
 		  
 		  result = ps.executeUpdate();
 		  
 		}finally {
 			DbManager.dbClose(null, ps);
 		}
 		
 		return result;
	}
	
	/**
	 * 잔액확인하기 
	 *  입금계좌의 총 금액이 1000원을 초과하면 true, 아니면 false를 리턴한다.
	 * */
     public boolean balanceCheck(Connection con , String inputAccount)throws SQLException {
    	 PreparedStatement ps=null;
    	 ResultSet rs=null;
  		String sql="select balance from bank where account=?";
  		boolean result=false;
  		try {
  		  ps = con.prepareStatement(sql);
  		  ps.setString(1, inputAccount);
  		  
  		  rs = ps.executeQuery();
  		  if(rs.next()) {
  			  int balnace = rs.getInt(1);
  			  if(balnace > 1000) result=true;
  		  }
  		  
  		}finally {
  			DbManager.dbClose(null, ps , rs);
  		}
  		
  		return result;
     }
     
     
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
		//dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		System.out.println("--2. 입금계좌 오류----");
		dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		//dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		//dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











