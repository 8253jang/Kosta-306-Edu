package ex0219.exam04;

public class Box<T> {
  private T content;
  
  public void setContent(T content) {
	this.content = content;
  }
  public T getContent() {
	return content;
  }
  
  //제네릭메소드
  public <A, B> T test(A a , B b) {
	  
	  return null;
  }
}





