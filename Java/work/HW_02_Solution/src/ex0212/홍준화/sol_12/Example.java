package ex0212.홍준화.sol_12;

public class Example {
    public static void action(A a) {
        a.method1();
        if(a instanceof C c) {
        	//C c = (C)a;
        	c.method2();  
        	//C와 A는 상속 관계이므로 객체타입 확인을 위해 instanceof를 사용한다  a instanceof C
        	// 하지만 이렇게만 사용하면 오류가 남. 이유는 A가 부모라 더 크기 때문에 다운 캐스팅을 해줘야함?? 
        }
    }
        
    public static void main(String[] args) {
    	action(new A());
        action(new B());
        action(new C());
    }
}
