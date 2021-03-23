package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		
		// 순번이 없다 (index를 통한 접근 불가)
		// 자료의 중복을 허용하지 않는다
		
//		Set<Object> set = new Set<Object>();	// Cannot instantiate the type Set<Object>
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("10");							// boolean 값을 반환하여 추가되었는지 아닌지를 알려준다
		hs.add("20");
		hs.add("ITBANK");
		hs.add("20");
		
//		for(int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));		// index를 통한 접근 메서드가 존재하지 않는다
//		}
		
		for(String str : hs) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {					// 아직 접근하지 않은 다음 값이 존재하면 true
			String data = it.next();
			System.out.println(data);
		}
		
		
		
		
	}
}
