package ex0205.김미연;
/**
 * 주제: 배열 항목의 전체 합과 평균을 구하기
 * 작성일: 26.02.05
 * 작성자: 김미연
 * */
public class Exercise03 {

	public static void main(String[] args) {
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int len = array.length;
		int sum = 0;//총합
		int num = 0;//총 점수개의 개수(인원수)
		
		for(int i=0;i<len;i++) {
			int lenc = array[i].length;
			for(int j=0;j<lenc;j++) {
				sum += array[i][j];
			}
			num += lenc;
		}
		System.out.println("총합: "+sum);
		System.out.println("평균: "+((double)sum/num));

	}

}
