package ex0213.shop;

import java.util.Random;

public class MainApp {

	public static void main(String[] args)/*throws NoKidsException*/{
		System.out.println("***ShoppingMall OPEN *****");
		ShoppingMall mall = new ShoppingMall();

		//난수발생 전용 클래스 
		Random r = new Random();
		for(int i=0; i <10 ; i++) {
			int age = r.nextInt(55)+1;//1 ~55
			try {
			 mall.enter(age);
			}catch (NoKidsException e) {
				System.out.println(e.getMessage());
			}
		  System.out.println();
		   
		}
		
		
		
		System.out.println("***ShoppingMall CLOSE *****");
		
		
		//예외발생 개수 
		System.out.println("예외 개수 = " + NoKidsException.count);

	}

}




