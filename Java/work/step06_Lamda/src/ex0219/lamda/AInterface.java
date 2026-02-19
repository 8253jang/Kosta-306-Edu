package ex0219.lamda;

@FunctionalInterface //메소드가 단한개
public interface AInterface {
  void aa();
  default void bb() {}
}
