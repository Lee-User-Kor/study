package collection;

import java.util.List;
import java.util.ArrayList;

public class Ex01 {
	// 다수의 데이터를 효울적으로 관리하기 위해서, 자바에서 기본적으로 준비한 자료구조 클래스의 모음
	// List, Set, Map
	
	public static void main(String[] args) {
		// List : 순번에 의해 여러 데이터를 관리하고, 데이터의 중복을 허용하는 형태 (배열과 다소 유사하다)
		
//		List list = new List();				// Cannot instantiate the type List
//		List al = new ArrayList();			// 다형성에 의해 객체를 상위 클래스의 참조변수로 받을 수 있다
											// ArrayList만의 고유기능은 호출할 수 없다
		
		ArrayList al = new ArrayList();		// LIST를 구현하는(상속받는) ARRAYLIST 클래스
		int[] arr = new int[5];				// 리스트와 비교하기 위한 배열
		
		// 1) 배열의 길이는 고정이지만, 리스트의 길이는 가변이다
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("리스트의 크기 : " + al.size());		// size() 메서드를 통해서 받아온다
		System.out.println();
		// 리스트는 요소를 추가할 때 마다 길이가 자동으로 증가하고, 요소를 제거하면 길이가 감소한다
		// 배열과 달리 빈칸때문에 null 체크를 할 필요가 줄어든다
		
		// 2) 리스트에 요소를 추가할 때는 add() 메서드를 활용한다
		al.add(10);
		al.add(20);							// 인덱스를 지정하지 않으면, 리스트의 맨 마지막에 요소를 추가한다
		al.add("ITBANK");					// 컬렉션은 내부 요소 (element)의 자료형을 지정하지 않으면 Object로 처리한다
		al.add(20);							// 리스트는 내부 요소의 중복을 허용하므로, 같은 값이 여러개 들어갈 수 있다
		al.add(2, "마지막에 넣은 요소");			// 인덱스를 지정하면 지정한 위치에 값을 넣고, 기존의 값을 뒤로 한칸씩 밀어낸다
		
		arr[0] = 2;
		arr[1] = 7;							// 배열은 인덱스를 지정하여 값을 넣어야 한다
//		arr[2] = "ITBANK";					// 배열은 지정한 자료형 외의 데이터를 처리할 수 없다
		
		// 3) 배열 출력
		System.out.print("arr : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// 4) 리스트 출력
		System.out.print("al : ");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		
		// 5) 리스트의 다른 메서드들
		System.out.println(al.contains("ITBANK"));		// 제시한 요소를 리스트가 포함하는지 boolean으로 반환
		System.out.println(al.indexOf(20));				// 제시한 요소가 위치하는 인덱스를 int로 반환
		System.out.println(al.size());
		
		Object[] arr2 = new Object[al.size()];
		al.toArray(arr2);
		System.out.println("arr2[0] : " + arr2[0]);
		
		al.remove(0);									// 지정한 인덱스의 값 하나를 제거
		al.remove("ITBANK");							// 지정한 객체를 찾아서 제거
		
		al.clear();										// 리스트 내부의 모든 요소를 제거
		System.out.println(al.size());
	}
}
