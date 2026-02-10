package ex0204.김채영;

public class Star {

	public static void main(String[] args) {
		//별찍기 1
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		//별찍기 2
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		//별찍기 3
		for(int i = 1; i<=5; i++) {
			for(int j = 4-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		//별찍기 4
		
		for(int i = 1; i<=5; i++) {
			for(int k = 2; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j = 5-i; j>=0; j--) {
				System.out.print("*");
			}
	
			System.out.println();
		}

	}

}
