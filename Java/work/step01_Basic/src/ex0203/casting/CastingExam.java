package ex0203.casting;

class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; //int형을 byte에 담을수없다(형변환연산 필요하다)
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1);//Type mismatch: cannot convert from int to byte

		System.out.println("byte b3="+b3);
		
		long lo=56897;
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; 
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=false; 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;// 
		System.out.println("double d="+d);

		float f1=lo; //실수형은 정수형보다 크게 본다.
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		
		c3=(char)(c2+2); // 'A' + 2
		System.out.println("char c3="+c3);
		
		
		//////////////////
		char ch1 = 65;//10진수 A	
		char ch2 = 0x0041; //16진수 A
		char ch3 = '\u0041'; //유니코드 A

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);	
		
		System.out.println("====|| vs | ========");
		//System.out.println(true || test() );
		//System.out.println(true | test() );
		
		System.out.println("====&& vs & ========");
		//System.out.println(false && test() );
		System.out.println(false & test() );
		
	}
	
	//메소드 작성
	public static boolean test() {
		System.out.println("test call");
		return false;
	}

}












