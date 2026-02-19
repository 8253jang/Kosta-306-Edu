package ex0219.exam02;

public class MainApp {

	public static void main(String[] args) {
		//상품생성
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("삼성tv");
		
		Tv tv = p1.getKind();
		//////////////////////////////////////////////
		//제네릭타입은 기본형은 안된다!
		Product<Vedio, Integer> p2 = new Product<>();
		p2.setKind(new Vedio());
		p2.setModel(100);//Autoboxing
		
		Vedio v = p2.getKind();
		int it = p2.getModel(); //언박싱
		

	}

}
