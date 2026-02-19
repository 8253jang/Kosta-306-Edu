package ex0213.이동혁.interfaceEx;

public interface RemoteControl {
    // public 추상 메소드

    // 인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 인터페이스에 선언된 모든 추상 메소드는 public abstract가 컴파일 과정에서 자동으로 붙는다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 인스턴스 메소드에는 완전한 실행 코드를 가지게 할 수 있다.
    // 디폴트 메소드는 반드시 구현 객체가 필요한 메소드이다.
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메소드를 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음을 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
