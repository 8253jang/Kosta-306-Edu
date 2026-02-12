package ex0212.final_abstract;

abstract class Animal{
	int legs;
	
	public abstract void sound();
	public abstract void run();
	
	public void eat() {
		System.out.println("잘 먹는다!");
	}
}
/////////////////////////////////////////////
/*abstract*/ class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}

	@Override
	public void run() {
		System.out.println("잘 뛴다!!");
		
	}
}
///////////////////////////////////////////////////
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
	   System.out.println("잘 뛰고 잘 올라간다.");
	}
}
/////////////////////////////////////////////////////
class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}

	@Override
	public void run() {
		System.out.println("못 뛴다!!!");
		
	}
	
	@Override
	public void eat() {
		System.out.println("모든 것들을 잘 먹는다~");
	}
}
////////////////////////////////////////////////
public class AbstractExam {
	
	public static void test(Animal an) {// Cat or Pig or Dog
		an.eat();
		an.run();
		an.sound();
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		test(animal);
		
		animal = new Pig();
		test(animal);
		
		animal = new Cat();
		test(animal);
		System.out.println("==============");
		
		test(new Pig());

	}

}









