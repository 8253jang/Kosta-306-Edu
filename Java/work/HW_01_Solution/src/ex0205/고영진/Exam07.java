package ex0205.고영진;

public class Exam07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int maxValue = Integer.MIN_VALUE;
		for (int i : array) {
			if (maxValue < i) {
				maxValue = i;
			}
		}
		System.out.println(maxValue);
	}
}
