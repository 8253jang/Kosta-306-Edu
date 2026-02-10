package ex0205.고영진;

import java.util.Scanner;
/*
 *  작성일: 2026-02-05
 *	작성자: 고영진
 */
public class Exam09 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int studentNum = -1;
		int[] scores = null;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			String cmd = sc.nextLine();
			switch (cmd) {
			case "1" -> {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}
			case "2" -> {
				// 학생수 입력 검증
				if (studentNum < 1) {
					System.out.println("학생수를 먼저 입력해주세요.");
					break;
				} 
				
				for (int i = 0; i < studentNum; i++) {					
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}			
			}
			case "3" -> {
				// 학생수 입력 검증
				if (studentNum < 1) {
					System.out.println("학생수를 먼저 입력해주세요.");
					break;
				} 
				// 점수 입력 검증
				if (scores == null) {
					System.out.println("점수를 먼저 입력해주세요.");
					break;				
				}
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]: %d", i, scores[i]);
					System.out.println();
				}				
			}
			case "4" -> {
				// 학생수 입력 검증
				if (studentNum < 1) {
					System.out.println("학생수를 먼저 입력해주세요.");
					break;
				} 
				// 점수 입력 검증
				if (scores == null) {
					System.out.println("점수를 먼저 입력해주세요.");
					break;				
				}			
				int maxScore = Integer.MIN_VALUE;
				int totalScore = 0;
				for (int score : scores) {
					// 최고점수 구하기
					if (maxScore < score) {
						maxScore = score;
					}
					// 총점 구하기
					totalScore += score;
				}
				// 평균점수
				double meanScore = (double) totalScore/studentNum; 
				System.out.printf("최고 점수: %d", maxScore);
				System.out.println();
				System.out.printf("평균 점수: %.1f", meanScore);
				System.out.println();
			}
			case "5" -> {
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				run = false;
			}
			default -> {
				System.out.println("다시 입력해 주세요.");
			}
			}
		}		
	} 	
}
