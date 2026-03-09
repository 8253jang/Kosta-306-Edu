package ex0309.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import ex0309.db.util.DbManager;
import ex0309.dto.Emp;

public class EmpDAO {
   /**
    * 모든 사원의 이름 검색하기
    * */
	public void getSelectNames() {
		Connection con =null;
		Statement st = null;
		ResultSet rs=null;
		
		try {
			//로드 연결 실행 닫기 
			con = DbManager.getConnection();
			
			st = con.createStatement();
			rs = st.executeQuery("select ename , sal from emp");
			while(rs.next()) {
				//열을 조회
			 String ename = rs.getString(1);
			 int sal = rs.getInt(2);
			 
			 System.out.println(ename +" | " + sal);
			}
			
			System.out.println("**조회 완료*****");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
		}
	}
	
	//사원등록
	//insert into emp(empno, ename, sal, hiredate) values(9000,'희정',2500, now())
	public void  insert(Emp emp) {
		Connection con=null;
		Statement st=null;
		String sql="insert into emp(empno, ename, sal, hiredate) "
				+ "values("+ emp.getEmpno() +",'"+emp.getEname()+"',"+emp.getSal()+", now())";
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			
			int re = st.executeUpdate(sql);
			
			System.out.println("re = " + re);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st);
		}
		
	}
	
	/**
      PreparedStatement방식으로 insert하기
    */
	public void  preParedinsert(Emp emp) { //sql Injection공격  
		Connection con=null;
		PreparedStatement ps =null;
		
		String sql="insert into emp(empno, ename, sal, hiredate) values(?,?,?, now())";
		try {
			con = DbManager.getConnection();
			
			ps = con.prepareStatement(sql);
			
			//?의 순서대로 개수만큼   setXxx( ?순서,  값 ) 필요하다
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setInt(3, emp.getSal());
			
			int re = ps.executeUpdate();
			
			System.out.println("re = " + re);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps);
		}
		
	}
	/////////////////////////////////////////////
	/**
       사원 전체 검색하기
       select empno, ename, sal, hiredate from emp
   */
	public List<Emp> selectAll(){
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		String sql="select empno, ename, sal, hiredate from emp order by sal desc";
		List<Emp> list = new ArrayList<Emp>();
		try {
			//로드 연결 실행 닫기 
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			//?가 있다면 ?의 순서대로 개수만큼 setXxx 필요
			
			rs = ps.executeQuery();
			while(rs.next()) {//커서를 앞으로 이동시킨다.
				
				//열을 조회한다.
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				
				Emp emp = new Emp(empno, ename, sal, hiredate);
			    list.add(emp);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		return list;
	}
	
	
	/**
	 * 사원번호에 해당하는 사원정보 검색하기
	 * select empno, ename, sal, hiredate from emp where empno=?
	 * */
	public Emp selectByEmp(int empno) {//9000
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		String sql="select empno, ename, sal, hiredate from emp where empno=?";
		Emp emp=null;
		try {
			//로드 연결 실행 닫기 
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			//?에 값 전달
			ps.setInt(1, empno);
			rs = ps.executeQuery();
			if(rs.next()) {
				 empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				
				emp = new Emp(empno, ename, sal, hiredate);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		return emp;
	}
	
	
	/**
	 * 사원번호에 해당하는 사원 삭제하기 
	 * delete from emp where empno=?
	 * */
	 public int deleteByEmpno(int empno) {
		 Connection con=null;
		PreparedStatement ps =null;
		int result=0;
		String sql="delete from emp where empno=?";
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			//?의 순서대로 개수만큼   setXxx( ?순서,  값 ) 필요하다
			ps.setInt(1, empno);
			
			result = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps);
		}
		return result;
	 }
	
	
}//클래스 끝














