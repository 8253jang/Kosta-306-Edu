package ex0204.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		//키보드 입력
		Scanner sc = new Scanner(System.in);//ctrl + shift + o
		
		//키보드입력은 숫자, 문자열, 문자열(공백이있는 문자열)
		System.out.println("국어 ? ");
		int kor = sc.nextInt();
		
		System.out.println("영어 ? ");
		int eng = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름 ? ");
		String name= sc.nextLine();
		
		
		System.out.println(name +"님 " + kor + " , " + eng);

	}

}
