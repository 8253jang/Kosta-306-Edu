package ex0203.구도연;

public class Exercise04 {

	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기
		// 정확히 소수 자릿수가 나올 수 있도록 출력
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop * lengthBottom) / height;
		
		System.out.println(area);
	}

}
