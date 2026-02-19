package ex0219.lamda;

public class MainApp {
	public static void main(String[] args) {
		//1. 기존방식 
		/*AInterface ai = new Test();
		ai.aa();*/
		
		//2. AnonymousInner type 으로 작성(익명타입 선언)
		//AInterface ai = new Xxx() {재정의};
	/*	AInterface ai = new AInterface() {
			@Override
			public void aa() {
				System.out.println("AnonymousInner aa 호출됨!!");
				
			}
		};
		
		ai.aa();*/
		
		//3. 람다식
		//AInterface ai = ()->{기능}
		
		/*AInterface ai = ()->{
		  System.out.println("인수와 리턴없는 람다식");
		};
		
		ai.aa();*/
		
		//기능이 한문장일때는 {}를 생략한다.
		/*AInterface ai = ()->System.out.println("인수와 리턴없는 람다식");	
			ai.aa();*/
			
	    //인수가 있는 람다식
		/*BInterface bi = (a)->System.out.println("전달된 a = "+ a);		
		bi.bb(5);*/
		
		//인수와 리턴이 있는경우
		/*CInterface ci = (a, b)-> a*b;
		int re = ci.cc(5, 3);
		System.out.println("re = " + re);*/
		
		
		
		CInterface ci = (a, b)-> {return a*b;};
		int re = ci.cc(5, 3);
		System.out.println("re = " + re);
		

	}

}
//////////////////////////
class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test의 aa 구현메소드입니다.");
		
	}
	
}