package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02 {
	//List<Integer> list = new ArrayList<>(5);
	//List<Integer> list = new Vector<Integer>();
	
	List<Integer> list = new LinkedList<Integer>();

	
	public ListExam02() {
		//추가
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(7);
		list.add(5);
		
		//list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + list.size());
		
		//저장된 정보를 출력하기 
		for(int i =0 ; i< list.size() ; i++) {
			int no = list.get(i);
			System.out.println("no = "+ no);
		}
		
		System.out.println("-----------개선된 for ---");
		for (int no : list) {
			System.out.println("no = "+ no);
		}
		
		//////////////////////////////////////
		//제거
		/*int i = list.remove(9);// 3번째 제거
		System.out.println("제거 후 = " + i );//제거된 객체 값!*/
		
		/*boolean b = list.remove((Object)20);
		System.out.println("b = "+ b);
		
		
		System.out.println("-----------제거 후 개선된 for ---");
		for (int no : list) {
			System.out.println("no = "+ no);
		}*/
		
		
		
		System.out.println("---정렬하기 -----");
		System.out.println("정렬전 : " + list);//this.toString()
		
		//Collections.sort(this);//기본 올림차순 정렬
		
		//내림차순으로 정렬
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("정렬후 : " + list);//this.toString()
		
	}

	public static void main(String[] args) {
		 new ListExam02();

	}

}





