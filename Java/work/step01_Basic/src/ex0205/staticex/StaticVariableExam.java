package ex0205.staticex;

class Test{
   int a;// 전역변수 0
   static int b; //static 전역변수 0  /  공유변수
   
   //non-static메소드에서 static, non-static 접근가능
   public void aa() {
	   System.out.println(a);
	   System.out.println(this.a);
	   
	   System.out.println(b);
	   System.out.println(this.b);
	   System.out.println(Test.b);
	   
	   
	   
   }
   public void bb() {
	   //메소드 호출
	   aa();
	   this.aa();
	   
	   cc();
	   this.cc();
   }
   
   //static메소드에서는 static만 접근, this사용불가
   public static void cc() {
	   //System.out.println(a);
	   //System.out.println(this.a);
	   
	   System.out.println(b);
	   //System.out.println(this.b);
	   System.out.println(Test.b);
	   
   }
   public static void dd() {
	   //aa();
	   //this.aa();
	   
	   cc();
	   Test.cc();
	   
	   //this.cc();
   }
   
}
/////////////////////////////////////
public class StaticVariableExam {
	static {
		System.out.println("난 메인보다 먼저 실행돼요!!");
	}
	
	
	public static void main(String[] args) {
		
		
		//Test.dd();
		
		
		System.out.println("---메인 시작 -----"  );
		//객체를 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = "+ t1);
		System.out.println("t2 = "+ t2);
		System.out.println("t3 = "+ t3);
		
		System.out.println("--non-static 접근 ---");
		
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		//값변경
		t2.a = 100;
		System.out.println("-- 변경 후 접근 ---");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		
        System.out.println("--static 접근 ---");
		
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		//값변경
		//t2.b = 50;
	    Test.b=70;
		System.out.println("-- 변경 후 접근 ---");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);

	}

}








