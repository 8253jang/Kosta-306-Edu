package ex0211.constructor;
/**
 * 싱글톤 클래스 작성법
 * 1) private 생성자 작성
 * 2) 자기자신을 생성하는 static 맴버필드
 * 3) 맴버필드를 리턴하는 메소드 제공
 * */
class Test{
	
	private static Test t = new Test();
	
	//외부에서 객체를 직접생성하지 못하도록 막음
	private Test() {}
	
	/**
	 * 현재 객체를 직접 생성해서 리턴해주는 메소드 제공!!
	 * */
	public static Test getInstance() {
		//return new Test();
		return t;
	}
}
////////////////////////////////////////////////

public class PrivateConstructorExam {
	public static void main(String[] args) {
		 //new Test();//The constructor Test() is not visible
		
		Test t1 =  Test.getInstance();
		Test t2 =  Test.getInstance();
		
		System.out.println("t1 = "+ t1);
		System.out.println("t2 = "+ t2);
		System.out.println("------------------");
		Test obj1 = Test.getInstance();
		Test obj2 = Test.getInstance();
		if(obj1 == obj2) {
		System.out.println("같은 ShopService 객체입니다.");
		} else {
		System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
