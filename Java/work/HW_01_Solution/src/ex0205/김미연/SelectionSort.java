package ex0205.김미연;
/**
 * 주제: 정렬 알고리즘(선택)
 * 작성일: 2026.02.05
 * 작성자: 김미연
 * */
public class SelectionSort {

	public static void main(String[] args) {
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		int len = arr.length;
		int temp;
		
		//선택 정렬: 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 
		//그 위치에 어떤 원소를 넣을지 선택하는 알고리즘
		for(int i=0;i<(len-1);i++) {
			int indexMin = i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[indexMin]) indexMin = j;
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println("선택 정렬: ");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}				
		
	}

}
