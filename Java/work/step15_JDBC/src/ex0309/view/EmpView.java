package ex0309.view;

import java.util.List;

import ex0309.db.dao.EmpDAO;
import ex0309.dto.Emp;

public class EmpView {

	public static void main(String[] args) {
		System.out.println("---JDBC 시작하기----------");
		
		EmpDAO dao = new EmpDAO();
		//dao.getSelectNames();
		
		//System.out.println("2. 등록..");
		//dao.insert(new Emp(9003,"삼순", 3500, null));
		
		//dao.preParedinsert(new Emp(9003,"삼순", 3500, null));

		///////////////////////////////
		System.out.println("--전체검색 ---");
		List<Emp> list = dao.selectAll();
		list.forEach(System.out::println);
		
		
		System.out.println("\n--사원번호 검색 ---");
		Emp emp =  dao.selectByEmp(9000);
	    System.out.println("결과 = " + emp);
	    
	    System.out.println("\n--사원번호로 삭제 ---");
	    int re = dao.deleteByEmpno(9000);
	    if(re==1)System.out.println(re+" : 삭제성공");
	    else System.out.println(re+" : 삭제 실패");

	    
	}

}
