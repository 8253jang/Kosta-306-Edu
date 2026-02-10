package ex0205.고영진;
/**
 *  작성일: 2026-02-05
 *	작성자: 고영진
 */
public class Exam08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int totalLength = 0;
		for (int[] is : array) {
			totalLength += is.length;
			for (int i : is) {
				sum += i;
			}
		}
		double mean = sum/(double) totalLength;
		System.out.printf("총점: %d, 평균: %.2f", sum, mean);
	}
}
