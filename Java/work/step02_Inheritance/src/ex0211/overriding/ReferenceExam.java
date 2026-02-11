package ex0211.overriding;

class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){
		this.str= str;
	}
	
	@Override // annotation
	public String toString() {	
		return str  +" = " +super.toString();
	}
}
/////////////////////////////////////////
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			
			
			
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			
			
			ObjectExam oe1 = new ObjectExam("진짜 갈려고?");
			ObjectExam oe2=new ObjectExam("안녕");
			/**
			 * print(Object obj) or println(Object obj) 메소드는
			 * 인수전달된 객체.toString()호출한다.
			 * toString()리턴하는 값을 출력하게된다!
			 * 
			 * Object에 정의된 toString은 객체의 주소(class이름@hashcode)를 문자열로 리턴
			 * Object상속받은 String은 toString을 재정의 -> 자신의 문자열을 리턴
			 * */
			System.out.println(c);// a
			System.out.println(s01);// 장희정
			System.out.println(s02);//Java
			
			System.out.println(s03);//월요일
			
			System.out.println(oe1.toString());//주소값
			System.out.println(oe2);//주소값
			
	}
}
