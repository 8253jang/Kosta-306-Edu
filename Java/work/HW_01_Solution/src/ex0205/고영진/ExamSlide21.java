package ex0205.고영진;

/*
 *  작성일: 2026-02-05
 *	작성자: 고영진
 */
public class ExamSlide21 {
	public static void main(String[] args) {
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		// 선택정렬
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
