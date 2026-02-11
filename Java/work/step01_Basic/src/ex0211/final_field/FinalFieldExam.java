package ex0211.final_field;

public class FinalFieldExam {
	int i; //인스턴스 필드  0
	
	//final 필드는 반드시 명시적  초기화필수(자동초기화안됨)
	//객체를 생성하는 사용자 객체를 생성할때 값을 초기화 할수 있다.
	final int j;//인스턴스 필드
	
	//어떻게 객체를 생성하든 즉 누가 사용하던 항상 동일한 값 
	static final int k; //static필드, 생성자 초기화 안됨
	
	static {
	  k=100;
	  
	}
	
	public FinalFieldExam() {
		j=10;
		
	}
	public FinalFieldExam(int j) {
		this.j=j;
	}
	

	public static void main(String[] args) {
		//static필드 접근
		System.out.println( FinalFieldExam.k );
		
		//FinalFieldExam fe =  new FinalFieldExam();
		FinalFieldExam fe =  new FinalFieldExam(200);
		System.out.println(fe.i);
		System.out.println(fe.j);
		System.out.println(fe.k);
		
		//final은 고정값으로 값변경 불가
		fe.i=20;
		//fe.j=100; //The final field FinalFieldExam.j cannot be assigned
		//fe.k=70; //The final field FinalFieldExam.j cannot be assigned
		
		

	}

}
