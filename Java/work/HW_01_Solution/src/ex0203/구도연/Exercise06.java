package ex0203.구도연;

public class Exercise06 {

	public static void main(String[] args) {
		// % 연산을 수행한 결과 값에 10을 더하는 코드
		// NaN 값을 검사하는 코드 작성
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(x == 0.0 || y == 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}

	}

}
