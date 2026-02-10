package ex0204.이정건;

import java.util.Scanner;
/**
 * 
 * */
public class GradeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeCalculator gc = new GradeCalculator();
		boolean run = true;
		
		while (run) {
			System.out.println("1. 성적표 구하기  2. 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1 -> {
					System.out.print("이름> ");
					String name = sc.next();
					
					System.out.print("국어> ");
					int kor = sc.nextInt();
					
					System.out.print("영어> ");
					int eng = sc.nextInt();
					
					System.out.print("수학> ");
					int math = sc.nextInt();
					
					gc.printResult(name, kor, eng, math);
					}
				case 2 -> run = false;
				default -> System.out.println("1 또는 2만 입력 가능합니다.");
			}
		}
		
		System.out.println("프로그램 종료.");
		sc.close();
	}

}
////////////////////////////////////////////////////
class GradeCalculator {
	
	public void printResult(String name, int kor, int eng, int math) {
		
		//총점구하기
		int total = this.getTotalScore(kor, eng, math);
		
		
		//평균구하기
		double average = (int) (getAverageScore(total, 3) * 100) / 100.0;
		
		//등급구하기
		char grade = getGrade(average);
		
		//화면에 에쁘게 출력
		System.out.println("----------------");
		System.out.println(name + "님 성적표");
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("등급: " + grade);
		System.out.println("----------------");
	}
	
	/**
	 * 총점 구하기
	 * @param : 국어, 영어, 수학
	 * @return : 총점 
	 * */
	private int getTotalScore(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	private double getAverageScore(int total, int num) {
		return (double) total / num;
	}
	
	private char getGrade(double average) {
		return switch((int)average / 10) {
			case 10, 9 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
		};
	}
	
}
