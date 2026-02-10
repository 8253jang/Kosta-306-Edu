package ex0205.overloading;

class Test{
	 public void aa(int ... i) {//매개값을 0개이상 허용 / 배열 처럼 사용
		 System.out.println("aa call...");
		 System.out.println("i = " + i );
		 
		 for(int a:i) {
			 System.out.print( a+" ");
		 }
		 
		 System.out.println("\n---------------------");
	 }
	 
	 //The variable argument type int of the method bb must be the last parameter
	 public void bb(int  i , String ... s ) {
		 
	 }
	 
}

///////////////////////////////////////
public class MethodVariableArgsExam {
	public static void main(String[] args) {
		//메소드 호출
		Test t = new Test();
		t.aa(3);
		t.aa(3,4,6);
		t.aa();
		t.aa(2,4,6,7,8,9);
		
		/*t.aa(2.5);
		t.aa("dd", 3, true);*/
		//////////////////////////////////////
		t.bb(4, "aaa","b","c");
		

	}

}



