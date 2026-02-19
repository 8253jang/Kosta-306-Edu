package ex0213.이동혁.interfaceCasting;

public class CastingExample {
    static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 타입
        Vehicle vehicle = new Bus();
        System.out.println(vehicle);

        // 인터페이스를 통해서 메소드 호출
        vehicle.run();
//        vehicle.checkFare(); Bus에만 존재하기 때문에 Vehicle 타입에서 접근할 수 없음.

        // 강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;

        System.out.println(bus);
        bus.run();
        bus.checkFare();
    }
}
