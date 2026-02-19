package ex0213.이동혁.interfaceSealed;

public class ImplClass implements InterfaceC {

    @Override
    public void methodC() {
        System.out.println("methodC 실행");
    }

    @Override
    public void methodB() {
        System.out.println("methodB 실행");
    }

    @Override
    public void methodA() {
        System.out.println("methodA 실행");
    }
}
