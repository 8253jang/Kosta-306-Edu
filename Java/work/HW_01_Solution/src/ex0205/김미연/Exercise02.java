package ex0205.김미연;
/**
 * 주제: 배열 항목에서 최댓값 출력
 * 작성일: 26.02.05
 * 작성자: 김미연
 * */
public class Exercise02 {
	public static void main(String[] args) {
		int array [] = {1,5,3,10,8,2,30,22};
		int len = array.length;
		
		int max=array[0];
		
		for(int i=1;i<len;i++) {
			if(max < array[i]) max = array[i]; 
		}
		System.out.println(max);
	}
}
