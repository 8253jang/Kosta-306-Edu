package ex0213.shop;

public class ShoppingMall {

	public void enter(int age)throws NoKidsException {
		if(age < 18) {
			//발생할 객체 생성
			/*NoKidsException e = new NoKidsException();
			throw e; //throw 발생시킬객체;*/
			//try {
			//Unhandled exception type NoKidsException
			  throw new NoKidsException(age+"살은 더 커서 오세요.");
			//}catch (NoKidsException  e) {
				// TODO: handle exception
			//}
			
		}else {
			System.out.println(age+"살 님 환영해요");
		}
		
	}
}
