package ex0205.김미연;
/**
 * 주제: 정렬 알고리즘(삽입)
 * 작성일: 2026.02.05
 * 작성자: 김미연
 * */
public class InsertionSort {

	public static void main(String[] args) {
		//삽입 정렬: 기준이 되는 숫자와 그 앞에 있는 숫자를 비교하여 조건에 맞게 정렬하는 방법
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		int len = arr.length;
		int temp;
		
		for(int i=0;i<len;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println("선택 정렬: ");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
