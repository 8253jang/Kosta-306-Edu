package ex0212.홍준화.sol_06;

public class Child extends Parent {
	public int studentNo;

	public Child(String name, int studentNo) {
		super(name);
		//this.name = name;  name은 부모의 필드이기 때문에 this가 아니라 super를 사용한다. 
		this.studentNo = studentNo;
	}
	
}