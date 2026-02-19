package ex0213.이동혁.interfaceEx;

public class ServiceExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        // 디폴트 메소드 호출
        service.defaultMethod1();
        service.defaultMethod2();

        // 정적 메소드 호출
        Service.staticMethod1();
        Service.staticMethod2();


    }
}
