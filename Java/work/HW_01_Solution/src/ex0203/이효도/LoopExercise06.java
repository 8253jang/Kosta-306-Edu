package ex0203.이효도;



public class LoopExercise06 {

	public static void main(String[] args) {
		/* int sum=1;
		 for (int x = 1; x <= 10; x++) {
	            for (int y = 1; y <= 10; y++) {
	                System.out.print(sum++ +" ");
            	}
	            System.out.println();
		 }*/
		////////////////////////////////////////////
		
		for (int x = 0; x < 100; x+=10) {//10행  x++ => x=x+1   -> x+=1  / x+=10 는 x= x+10;
            for (int y = 1; y <= 10; y++) {//10열
                System.out.print((y+x) +" ");
        	}
            System.out.println();
	 }
	}
}
