package ex0204.김채영;

import java.util.Scanner;
/**
 *  주제 :
 *  작성일:
 *  작성자 : 
 * 
 * */
public class GradeScore2 {
	static Scanner scanner = new Scanner(System.in);

	static int kor = 0;
	static int eng = 0;
	static int mat = 0;
	static String name;
	
	/**
	 * 평균 구하기
	 * @param : 국어, 영어, 수학
	 * @return : 총점 
	 * */
	private int ScoreTotal(int k, int e, int m) {
		return k + e + m;
	}
	
	private int ScoreAvg(int count, int total) {
		return total/count;
	}
	
	private String Grade(int avg) {
		String scor;
		if(avg >= 90 ) scor = "A";
		else if(avg >= 80  ) scor = "B";
		else if(avg >= 70 ) scor = "C";
		else if(avg >= 60 ) scor = "D";
		else scor = "F";
		
		return scor;
	}
	
	public void PrintScore(String name, int k, int e, int m) {
        System.out.println("성적표> ");
		int total = this.ScoreTotal(k, e, m);
		int avg = this.ScoreAvg(3, total);
		String grade = this.Grade(avg);
		System.out.println("이름: " + name);
		System.out.println("국어: " + k);
		System.out.println("영어: " + e);
		System.out.println("수학: " + m);
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("등급: " + grade);
	}
	
	
	public static void main(String[] args) {
		GradeScore2 gs = new GradeScore2();
		boolean run = true; // 상태 변수
						
		while(run) {
            System.out.println("------------------------------");
            System.out.println("1.성적표 출력 | 2.종료");
            System.out.println("------------------------------");
            System.out.println("선택> ");
            int num = scanner.nextInt();
            if(num==1) {
        		System.out.println("이름을 입력하세요.");
        		name = scanner.next();
        		System.out.println("국어 점수를 입력하세요.");
        		kor = scanner.nextInt();
        		System.out.println("영어 점수를 입력하세요.");
        		eng = scanner.nextInt();
        		System.out.println("수학 점수를 입력하세요.");
        		mat = scanner.nextInt();
        		System.out.println(kor);
            	gs.PrintScore(name, kor, eng, mat);                
                
            }else if(num==2) {
            	run = false;
        		System.out.println("프로그램을 종료합니다.");

            }
      }
	}

}
