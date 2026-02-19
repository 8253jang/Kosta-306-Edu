package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExam03 extends ArrayList<Emp> {
	
	//초기치 사원정보 5명 추가
	public ListExam03() {
		//저장하기
		super.add(new Emp(20, "희정", 28, "서울"));
		this.add(new Emp(10, "나영", 35, "대구"));
		
		add(new Emp(50, "미미", 22, "제주도"));
		add(new Emp(40, "삼순", 27, "서울"));
		add(new Emp(30, "삼식", 30, "대구"));
		
	}
	
	/**
	 *저장된 모든 사원정보 리턴
	 * */
	public List<Emp> selectAll(){
		return this;
	}
	
	
	/**
	 *  사원번호에 해당하는 사원정보 리턴
	 * */
     public Emp selectByEmpno(int empno) {
    	 for(Emp e : this) {
    		 if(e.getEmpno() == empno) {
    			 return e;
    		 }
    	 }
    	 
    	 return null;
     }
	
	
	  /**
	   * 주소를 인수로 전달받아 동일한 주소인 모든 사원정보 리턴
	   * */
     public List<Emp> selectByAddr(String addr){
    	  List<Emp> findList = new ArrayList<Emp>();
    	  for(Emp e : this) {
     		 if(e.getAddr().equals(addr)) {
     			 //찾았다 -> 추가해
     			findList.add(e);
     		 }
     	 }
    	  
    	  
    	  return findList;
     }
     
	
	  /**
        사원번호를 기준으로 정렬한 정보 리턴
       */
      public List<Emp> sortByEmpno( ){
    	  //정렬한 대상을 관리할 List를 선언
    	  List<Emp> shallowCopy = new ArrayList<Emp>(this);
    	  
    	  //sort는 반드시 Comparable를 구현한 객체어야 사용가능
    	 // Collections.sort(shallowCopy);
    	  
    	  return shallowCopy;
      }
	
	  /**
	   * 나이를 기준으로 정렬한 정보를 리턴
	   * */
      public List<Emp> sortByAge(){
    	  //정렬한 대상을 관리할 List를 선언
    	  List<Emp> shallowCopy = new ArrayList<Emp>(this);
    	  
    	  //Collections.sort(shallowCopy, new Test());
    	  
    	  //익명타입
    	  /*Collections.sort(shallowCopy, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {		
				return o1.getAge() - o2.getAge();
			}
		});*/
    	  
    	  
    	  //람다식 변경
    	  Collections.sort(shallowCopy, (e1, e2)-> e1.getAge() - e2.getAge());
    	  
    	  
    	  
    	  return shallowCopy;
      }
      
	
	public static void main(String[] args) {
		ListExam03 e = new ListExam03();
		
		System.out.println("1. 전체검색...");
		List<Emp> list = e.selectAll();
		for(Emp emp : list) {
			System.out.println(emp); //emp.toString()
		}
		///////////////////////////////////////////
		 System.out.println("\n2. 사원번호 검색...");
		 Emp emp = e.selectByEmpno(50);
         System.out.println(emp);
         
         //////////////////////////////////////////
         System.out.println("\n3. 주소로  검색...");
          list = e.selectByAddr("제주도");
          if(list.size()==0) {
        	  System.out.println("주소에 해당하는 사원이 없습니다.");
          }else {
        	  System.out.println( list );
          }
          
          //////////////////////////
          System.out.println("\n4. 사원번호 정렬  검색...");
         list  = e.sortByEmpno();
         for(Emp em:list) {
        	 System.out.println(em);
         }
         
         System.out.println("1. 전체검색...");
 		 list = e.selectAll();
 		for(Emp emp2 : list) {
 			System.out.println(emp2); //emp.toString()
 		}
 		////////////////////////////////////////////////
 		 System.out.println("\n5.나이 정렬  검색...");
         list  = e.sortByAge();
         for(Emp em:list) {
        	 System.out.println(em);
         }
         
	}

}
/////////////////////////////////////////////
class Test implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		//return e1.getAge() - e2.getAge();//음수 or 0 or 양수
		return e2.getAge() - e1.getAge();
	
	}
	
}















