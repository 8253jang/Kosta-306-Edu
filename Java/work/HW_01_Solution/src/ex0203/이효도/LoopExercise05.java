package ex0203.이효도;

import java.util.Scanner;

public class LoopExercise05 {

	public static void main(String[] args) {
		//키보드 입력 받기 
		 Scanner sc = new Scanner(System.in);
		 
		 int totalMoney = 0;
		 int inputMoney = 0;
		 int outputMoney = 0;
		 
		 while(true) {
			 System.out.println("-------------------------------------");
			 System.out.println("1.예금 | 2.출금 | 3.잔고 |  4. 종료 ---");
			 System.out.println("-------------------------------------");
			 System.out.print("선택> ");
			 String choice = sc.nextLine();
			 switch(choice) {
				 case "1" : 
						 //int inputMoney = sc.nextInt();
						 // int 숫자 = Integer.parseInt(문자열);
					 
					 	 System.out.println("예금액 입력해라.");
						 inputMoney = Integer.parseInt( sc.nextLine()) ; //String -> int형으로 형변환 
						 
						 totalMoney = totalMoney + inputMoney;
				  break;
				 case "2" :
					 System.out.println("출금액 입력해라.");
					 outputMoney = Integer.parseInt( sc.nextLine()) ; //String -> int형으로 형변환 
					 
					 totalMoney = totalMoney - outputMoney;
				  break;
				 case "3" :
					 System.out.println("남은예금액. ->" + totalMoney);

				  break;
				 case "4" :
					 System.out.println("프로그램을 종료합니다.");
					 System.exit(0);//프로그램 종료
				  break;
				  default : System.out.println("숫자는 1 ~ 4만 입력해");
			 }
		 }
	}

}
