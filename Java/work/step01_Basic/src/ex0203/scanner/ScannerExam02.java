package ex0203.scanner;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {
		//키보드 입력 받기 
		 Scanner sc = new Scanner(System.in);
		 while(true) {
		    System.out.println("1.이름입력    2.종료");
		    int menu = sc.nextInt();
		    switch(menu) {
		      case 1: 
		    	 System.out.print("이름은?");
		    	 String name = sc.next();
		    	 System.out.println("당신은 이름은 "+ name+"입니다.");
		    	 break;
		      case 2 : 
		    	  System.out.print("종료합니다.~~");
		    	  System.exit(0);//프로그램강제종료
		      default: 
		    	  System.out.print("숫자는 1~ 2만가능해요");
		    }
		 }

	}

}
