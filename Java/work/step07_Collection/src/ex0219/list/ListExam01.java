package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam01 extends ArrayList<Integer>{
	public ListExam01() {
		super(5);//int형 인수 받는 부모생성자
		
		//추가
		super.add(10);
		this.add(5);
		add(20);
		super.add(10);
		super.add(7);
		this.add(5);
		
		//list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + super.size());
		
		//저장된 정보를 출력하기 
		for(int i =0 ; i< size() ; i++) {
			int no = super.get(i);
			System.out.println("no = "+ no);
		}
		
		System.out.println("-----------개선된 for ---");
		for (int no : this) {
			System.out.println("no = "+ no);
		}
		
		//////////////////////////////////////
		//제거
		/*int i = this.remove(9);// 3번째 제거
		System.out.println("제거 후 = " + i );//제거된 객체 값!*/
		
		/*boolean b = this.remove((Object)20);
		System.out.println("b = "+ b);
		
		
		System.out.println("-----------제거 후 개선된 for ---");
		for (int no : this) {
			System.out.println("no = "+ no);
		}*/
		
		
		
		System.out.println("---정렬하기 -----");
		System.out.println("정렬전 : " + this);//this.toString()
		
		Collections.sort(this);//기본 올림차순 정렬
		
		//내림차순으로 정렬
		//Collections.sort(this, Collections.reverseOrder());
		
		System.out.println("정렬후 : " + this);//this.toString()
		
	}

	public static void main(String[] args) {
		 new ListExam01();

	}

}





