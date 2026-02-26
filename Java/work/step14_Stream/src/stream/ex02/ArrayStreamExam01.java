package stream.ex02;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExam01 {
	static int  sum;
	public static void main(String[] args) {
		System.out.println("1.String Array Stream ------------");
		String [] strArr = {"희정","현준","정화","민지","경찬"};
		/*for(String s:strArr) { //자료구조의 Iterator를 이용한 방식
			System.out.println(s);
		}*/
		
		//Stream을 이용해서  출력해보자
		 //1) 람다식
		System.out.println("1) 람다식 ----");
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach((s)->System.out.println(s));
		
		//2) 메소드 참조
		System.out.println("2) 메소드 참조 ----");
		Arrays.stream(strArr).forEach(System.out :: println);
		
		//3) 한번 사용한 Stream을 다시 사용해보자(사용불가x)
		
		
		System.out.println("2.int Array Stream ------------");
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		Arrays.stream(intArr)
		.filter(i-> i%2==0)
		.forEach(System.out ::println);
		
		System.out.println("3.range()  vs rangeClosed() ------------");
		IntStream.range(0, 10).forEach(System.out :: println);
		
		System.out.println("-------------------");
		IntStream.rangeClosed(0, 10).forEach(System.out :: println);
		
		
		
		IntStream.rangeClosed(0, 10)
		.forEach((i)-> sum +=i);
		
		System.out.println("합계 = " + sum);
		
		
		int re = IntStream.rangeClosed(0, 10).sum();
		System.out.println("re = " + re);
		
		

	}

}
/////////////////////////////////////////////////////////

class Test{
	int i;
	
	public  void aa() {
		final int j=10;
		
		class B{
			public static void test() {
				//System.out.println(j);
				
				new Consumer<String>() {
					 @Override
					public void accept(String t) {
						 //j=j+10;
						 System.out.println(j+10);
						// System.out.println(i+10);
						
					}
				};
			}
		}
		
	}
	
	
}




















