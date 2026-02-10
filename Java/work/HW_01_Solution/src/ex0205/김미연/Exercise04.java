package ex0205.김미연;

import java.util.Scanner;

/**
 * 주제:학생 점수 분석하는 프로그램(학생수, 점수입력, 점수리스트, 분석, 종료)
 * 작성일: 26.02.05
 * 작성자: 김미연
 */
public class Exercise04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true; 
		int students = 0;
		int [] scores = null;
		
		int len = 0;
		int max = 0;
		int sum = 0;
		
		while(run) {
			System.out.println("\n---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int choice = sc.nextInt();
			switch(choice) { 			
			case 1: 
				System.out.print("학생 수> ");
				students = sc.nextInt();
				scores = new int [students];
				break;
			case 2:
				len = scores.length;
				for(int i=0;i<len;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = sc.nextInt();
				}
				System.out.println();
				break;
			case 3:
			   if(scores!=null) {
				for(int i:scores) {
					int j = 0;
					System.out.println("scores["+j+"]: "+i);
					j++;
				}
			   }else {
				   System.out.println("먼저 1번을 누르세요.");
			   }
				break;
			case 4:
				for(int i=0;i<len;i++) {
					if(max<scores[i]) max=scores[i];
					sum += scores[i];
				}
				double avg = (double)(sum/len);
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1~5까지의 숫자만 입력하세요");
				break;
			}
		}
		
		System.out.println("***다음에 이용해 주세요***");
					
	}

}
