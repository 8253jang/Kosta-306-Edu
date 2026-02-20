package ex0220.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {
	//Map<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> map = new TreeMap<Integer, String>();
	
    public MapExam() {
    	//map에추가
    	map.put(20, "희정");
    	map.put(10, "나영");
    	map.put(40, "미미");
    	map.put(20, "효리");
    	map.put(10, "삼순");
    	
    	System.out.println("저장된 개수 = " + map.size());
    	System.out.println("map = " + map.toString()); //map.toString()
    	
        //map에 들어있는 key, value를 꺼내기 (key와 value의 한쌍 = Entry)
    	
    	//모든  key의 정보를 가져온다.
    	Set<Integer> keySet = map.keySet();//모든 key정보를 Set에 저장
    	Iterator<Integer> it = keySet.iterator();//key를 꺼낼수 있는 준비
    	
    	while(it.hasNext()) {//요소가 있다면(꺼낼게 있다면)
    		int key = it.next();//요스를 꺼낸다.
    		String value = map.get(key);//꺼낸 key에 해당하는 value를 조회
    		System.out.println(key +"와 "+ value);
    	}
    	
    	System.out.println("----개선된 for 문 사용 ----");
    	for(Integer key : map.keySet()) {
    		String value = map.get(key);//꺼낸 key에 해당하는 value를 조회
    		System.out.println(key +"와 "+ value);
    	}
    	
    	System.out.println("--- Entry 형태로 조회하기 ----");
    	Set<Entry<Integer, String>> set = map.entrySet();
    	
    	for(Entry<Integer, String> e : set) {
    		System.out.println(e.getKey() +" = "+ e.getValue());
    	}
    	
    	//삭제
    	map.remove(20);
    	
    	System.out.println("삭제 후 = " + map);
    
    }
	public static void main(String[] args) {
		new MapExam();

	}

}









