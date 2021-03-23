package collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// Map : key와 value를 맵핑하여 저장하는 구조, index 대신 key를 활용한다
		
		// <key, value>
//		Map<String, Integer> map = new Map<String, Integer>();		// Cannot instantiate
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
//		제네릭 타입에는 primitive를 작성할 수 없다(객체가 아니므로)
		
		map.put("year", 2021);
		map.put("month", 3);
		map.put("dayOfMonth", 22);
		map.put("dayOfWeek", 1);			// 0, 1, 2, 3, 4, 5, 6 == 일, 월, 화, 수, 목, 금, 토
		
		System.out.println("map.size() : " + map.size());
		
		System.out.println("map.get(\"year\") : " + map.get("year"));	// 일치하는 key가 있으면 => value
		System.out.println("map.get(\"year\") : " + map.get("Year"));	// 일치하는 key가 없으면 => null
		System.out.println();
		
		// 모든 value를 출력하기 (1) : key에 대한 연관성을 찾을 수 없다
		Collection<Integer> values = map.values();
		for(Integer num : values) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		// 모든 value를 출력하기 (2)
		Set<String> keySet = map.keySet();	// key의 묶음을 가져와서
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 모든 value를 출력하기 (3)
		Enumeration<String> keys = map.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("\n");
	}
}
