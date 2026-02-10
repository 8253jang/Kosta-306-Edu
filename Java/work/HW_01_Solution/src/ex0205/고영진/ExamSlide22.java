package ex0205.고영진;

/*
 *  작성일: 2026-02-05
 *	작성자: 고영진
 */
public class ExamSlide22 {
	
	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();
		lottoMachine.saveLottoNums();
		lottoMachine.printLotto();
		lottoMachine.sortLottoNums();
		lottoMachine.printLotto();
	}
}

class LottoMachine{
	int[] lotto = new int[6];
	
	public void printLotto() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
	
	public void saveLottoNums() {
		for (int i = 0; i < lotto.length; i++) {
			int pickedLottoNumber = getRandomLottoNumber();
			// 중복이면 계속 추출			
			while (isDuplicated(lotto, pickedLottoNumber)) {
				System.out.println("중복된수! " + pickedLottoNumber);
				pickedLottoNumber = getRandomLottoNumber();
			}
			lotto[i] = pickedLottoNumber;
		}
	}
	private boolean isDuplicated(int[] lotto, int pickedLottoNumber) {
		// 순회해서 중복체크		
		for (int lottoNumer : lotto) {
			if (pickedLottoNumber == lottoNumer) {
				System.out.println("중복된수가 있습니다. " + lottoNumer + ", " + pickedLottoNumber);
				return true;
			}
		}
		return false;
	}
	
	public void sortLottoNums() {
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}							
		}
	}
	
	private int getRandomLottoNumber() {
		return (int) (Math.random() * 45) + 1;
	}
	
}