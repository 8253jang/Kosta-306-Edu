package ex0213.이동혁.interfaceInheritance;

public class ExtendsExample {
    public static void main() {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;

        ia.methodA();
//        ia.methodB();

        InterfaceB ib = impl;
        ib.methodB();
//        ib.methodA();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
