package ex0213.이동혁.polymorphism;

public class Car {
    // 필드
    Tire tire1 = new HanKookTire();
    Tire tire2 = new HanKookTire();

    // 메소드
    void run() {
        tire1.roll();
        tire2.roll();
    }
}
