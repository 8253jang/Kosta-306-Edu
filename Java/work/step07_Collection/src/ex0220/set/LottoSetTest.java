package ex0220.set;

import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class LottoSetTest extends TreeSet<Integer> {
	public LottoSetTest() {
		super(Collections.reverseOrder());
		
		Random r = new Random();
		while(super.size() < 6) {
			int no = r.nextInt(45)+1;
			super.add(no);
		}
		
		System.out.println("로또번호 = " + this);
	}
   public static void main(String[] args) {
	  new LottoSetTest();
   }
}
