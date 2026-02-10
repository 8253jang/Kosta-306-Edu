package ex0203.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		//키보드 입력 받기 
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("1.성적구하기       2. 종료 ---");
			 System.out.print("메뉴는 > ");
			 String choice = sc.nextLine();
			 switch(choice) {
				 case "1" : 
					 System.out.print("국어점수는 ? ");
						// int kor = sc.nextInt();
						 
						 // int 숫자 = Integer.parseInt(문자열);
						 int kor = Integer.parseInt( sc.nextLine()) ; //String -> int형으로 형변환 
						 
						 System.out.print("영어점수는 ? ");
						 int eng = Integer.parseInt(sc.nextLine());
						 
						 System.out.print("이름은 ? ");
						 //String name = sc.next(); //한 단어(word)만 읽기
						 
						 //sc.nextLine();
						 
						 String name = sc.nextLine(); //한줄 읽기 
						 
						 int sum = kor + eng;
						 System.out.println(name+"님 총점은 "+ sum);
				  break;
				 case "2" :
					 System.out.println("프로그램을 종료합니다.");
					 System.exit(0);//프로그램 종료
				  break;
				  default : System.out.println("숫자는 1 ~ 2만 입력해");
			 }
		 }
		 
	

	}

}
