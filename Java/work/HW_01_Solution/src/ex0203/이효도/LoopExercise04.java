package ex0203.이효도;

public class LoopExercise04 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(true) {
			num1 = (int) (Math.random() * 5) + 1;
			num2 = (int) (Math.random() * 5) + 1;
			result = num1 + num2;
			
			System.out.println(num1 + "," + num2);
			
			if(result == 5) {
				break;//이하의 문장을 실행하지 않고 반복문(while)블럭을 탈출한다.
			}
			
		}
		
		
	}

}
