package ex0205.array;

class MultiArray{
//정수형 2차원 배열 8*9
	//int [][] arr ;
	//int [][] arr = new int [8][9]; //모두 0
	
	//int [][] arr = new int [8][];//행마다 다른 열..
	
	/*int [][] arr = new int [][] {
		{1, 3, 4},
		{2,4,6,8,10},
		{2}
	};*/
	
	int [][] arr = new int [8][9];
	
     public void array99() {
    	 //각 행의 열을 생성
    	 /*arr[0] = new int[3];
    	 arr[1] = new int [1];*/
    	  
    	 /*System.out.println(arr);//주소
    	 System.out.println(arr[0]);//주소
    	 System.out.println(arr[0][0]);*/
    	 
    	 for(int row=0 ; row < arr.length ; row++) {//8행
    		 for(int col=0; col < arr[row].length ; col++) {//각 행의 열의 길이만큼
    			 //값변경
    			 arr[row][col] = (row+2) * (col+1) ;
    			 System.out.print(arr[row][col]+" ");
    		 }
    		 System.out.println();
    	 }
    	 
    	 System.out.println("---개선된 for ----");
    	//배열에 결과를 꺼내출력
 	    for(int [] row : arr) {
 	    	for(int v : row) {
 	    		System.out.print(v+" ");
 	    	}
 	    	System.out.println();
 	    }
    	 
    	 
     }
}
///////////////////////////////////////
public class MemoryApart{
   public static void main(String[] args) {
	   new MultiArray().array99();
   }
}

