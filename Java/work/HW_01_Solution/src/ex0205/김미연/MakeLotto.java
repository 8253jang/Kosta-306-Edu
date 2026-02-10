package ex0205.김미연;

import java.util.Scanner;

/**
 * 주제: 로또 번호 뽑기
 * 작성일: 2026.02.05
 * 작성자: 김미연
 * */
public class MakeLotto {

	public boolean duplicateCheck(int [] arr, int num, int len) {
		for(int i=0;i<len;i++) {
			if(arr[i]==num) {
				return false;
			}
		}
		return true;
	}
	
	public int [] saveNumber(int[] arr) {		
		
		int array [] = new int [6];
		int len=0;
		for(int i=0;i<6;i++) {
			int nansu = (int)(Math.random()*45+1);
			array[i] = nansu;
			if(this.duplicateCheck(array, nansu, len)) len +=1;
			else i--;
		}
		return array;
	}
	
	public int [] decsendingSort(int [] array) {
		int temp;
		
		for(int i=0;i<6;i++) {
			for(int j=i;j>0;j--) {
				if(array[j]>array[j-1]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int [] lotto = new int [6];
		
		MakeLotto ml = new MakeLotto();
	
		//중복 없는 값들 저장
		lotto = ml.saveNumber(lotto);
		//내림차순 정렬
		lotto = ml.decsendingSort(lotto);
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	
}
