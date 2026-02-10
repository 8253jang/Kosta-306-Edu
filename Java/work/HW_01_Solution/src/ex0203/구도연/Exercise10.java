package ex0203.구도연;

public class Exercise10 {

	public static void main(String[] args) {
		// 삼각형
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		// 역삼각형
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("************************");
	}
}
