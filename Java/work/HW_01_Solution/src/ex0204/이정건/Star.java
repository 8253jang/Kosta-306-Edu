package ex0204.이정건;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i < j) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
