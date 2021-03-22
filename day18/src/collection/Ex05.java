package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		Random ran = new Random();
		
		
		int count = 0;
		while(hs.size() != 7) {
			int num = ran.nextInt(45) + 1;	// 0에서 45개의 bound + 1 => 1 ~ 45
			hs.add(num);
			count++;
			System.out.println("count : " + count);
		}
		
		for(Integer num : hs) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		// 컬렉션의 생성자 매개변수에 또다른 컬렉션을 넣어서 데이터를 유지하면서 형태를 변경할 수도 있다
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		Collections.sort(list);				// static 속성을 가지는 메서드
											// 이름과 나이를 속성으로 가지는 객체의 리스트라면
											// 이름과 나이 중 어떤 속성을 정렬의 기준으로 삼을 것인가..?
											// Comparable or Comparator와 같은 Interface를 사용
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
	}
}
