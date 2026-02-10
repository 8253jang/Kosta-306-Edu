package ex0205.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	//int [] arr ; //null
	//int [] arr = new int [10];//
	//int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
     
     public void printArrayvalue() {
    	 System.out.println("arr = " + arr);
    	 
    	 int len = arr.length;
    	 System.out.println("배열의 길이 = " + len);
    	 
    	 for(int i=0; i< len ; i++) {
    	  System.out.println("arr["+i+"] = " + arr[i]);
    	 }
    	 
    	 //배열방 값 변경
    	 arr[5] =100;
    	 System.out.println("--변경 후--");
    	 for(int i=0; i< len ; i++) {
       	  System.out.println("arr["+i+"] = " + arr[i]);
       	 }
    	 
    	 System.out.println("---향상된 for문 ----");
    	 for(int i :arr) {
    		 System.out.println(i);
    	 }
    	 
     }
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		/*ArrayValue av =  new ArrayValue();
		av.printArrayvalue();*/
		
		new ArrayValue().printArrayvalue();
		
		System.out.println("--프로그램 종료--");
	}
}


