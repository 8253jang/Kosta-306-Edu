package ex0203.이효도;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreExam {

	public static void main(String[] args) {
		String name="효도" ;
		int kor ,eng,math;
		int totalScore;
		double average;
		char grade;
		
		
		kor = (int)(Math.random() * 56) + 45;
		eng = (int)(Math.random() * 56) + 45;
		math = (int)(Math.random() * 56) + 45;
		
		//총점
		totalScore = kor + eng + math;
		
		//평균
		//average = (double)totalScore/3;
		average =totalScore/3.0;
		
		// 평균 90이상이면 A, 아니면 F
	   /* if(average >= 90) grade='A';
	    else grade='F';*/
		
		//삼항연산자 -> 조건식 ? 참일경우 : 거짓일경우;
		//grade = average >= 90 ? 'A' : 'F';
		
		
		// 등급구하기 
//		if(average >= 90) 
//			grade = 'A';
//		else if(average >= 80){
//			grade = 'B';
//		}else if(average >= 70){
//			grade = 'C';
//		}else if(average >= 60){
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
		
		
		
		grade = switch((int)(average/10)) {
			case 9,10 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default ->'F';
		};
		
		
	//소수점 자리 2자리까지
		System.out.println("전 : " + average);
		
		average = (int)(average*100)/100.0;
				
		System.out.println("흐 : " + average);
		
		System.out.println("이름:," + name + " 국어:" + kor + " 영어:" + eng + " 수학:" + math + " 총점:" + totalScore + " 평균:" + average +" 학점:" + grade);
		
	}

}