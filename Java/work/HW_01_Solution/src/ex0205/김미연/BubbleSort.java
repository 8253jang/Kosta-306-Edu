package ex0205.김미연;
/**
 * 주제: 정렬 알고리즘(버블)
 * 작성일: 2026.02.05
 * 작성자: 김미연
 * */
public class BubbleSort {

	public static void main(String[] args) {
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		int len = arr.length;
		int temp;
		
		//버블 정렬: 배열 내의 두 개의 인접한 index를 비교하여
		//더 큰 숫자를 뒤로 보내 정렬하는 방법
		for(int j=0;j<(len-1);j++) {
			for(int i=0;i<(len-1-j);i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		System.out.println("버블 정렬: ");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
