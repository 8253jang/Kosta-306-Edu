package ex0203.구도연;

public class Exercise07 {

	public static void main(String[] args) {
		// while 문과 Math.random() 메소드를 사용해서 두 개의 주사위를 던졌을 때
		// 나오는 눈을 (눈1, 눈2) 형태로 출력
		// 눈의 합이 5가 아니면 -> 계속 주사위를 던짐
		// 눈의 합이 5라면 -> 멈춤
		while(true) {
			// 1~6 범위의 난수 생성
			// (Math.random() * 경우의 수 + 1) 
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
			if((dice1 + dice2) == 5) {
				break;
			}
		}
	}
}
