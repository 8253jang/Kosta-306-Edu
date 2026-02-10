package ex0205.김미연;
/**
 * 주제: 배열 길이 출력
 * 작성일: 26.02.05
 * 작성자: 김미연
 * */
public class Exercise01 {

	public static void main(String[] args) {
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		System.out.println(array.length); // 행의 갯수
		System.out.println(array[2].length); // 2행의 열의 갯수
	}

}
