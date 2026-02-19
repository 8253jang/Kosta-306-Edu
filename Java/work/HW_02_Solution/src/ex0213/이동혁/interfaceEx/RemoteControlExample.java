package ex0213.이동혁.interfaceEx;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        RemoteControl.changeBattery();

        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

    }
}
