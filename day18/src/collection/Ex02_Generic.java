package collection;

import java.util.ArrayList;

class Toy {
	private String name;
	private int price;
	
	public Toy(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.printf("%s : %d원\n", name, price);
	}
}

public class Ex02_Generic {
	public static void main(String[] args) {
		// 컬렉션은 내부 자료형을 지정하지 않으면, Object로 취급한다
		
		Toy t1 = new Toy("LEGO", 48000);
		Toy t2 = new Toy("iPad", 620000);
		Toy t3 = new Toy("Nintendo", 999000);
		
		Toy[] arr = new Toy[] { t1, t2, t3 };
		ArrayList list1 = new ArrayList();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		
		for(Toy t : arr) {
			t.show();
		}
		System.out.println("=====================================");
//		for(int i = 0; i < list1.size(); i++) {			// 내부 요소의 타입이 지정되지 않아서, Object로 처리 중
//			System.out.printf("%s : %d원\n", list1.get(i).getName(), list1.get(i).getPrice());
//		}
		// 컬렉션이나 클래스의 내부 타입을 지정하는 문법 : Generic Type	// java 1.5부터 추가된 문법
		ArrayList<Toy> list2 = new ArrayList<Toy>();		// 다른 자료형은 추가 불가능
//		list2.add("TEST");		// The method add(Toy) in the type ArrayList<Toy> is not applicable for the arguments (String)
		
		// ArrayList<Student> list = new Arraylist<Student>();
		list2.add(t1);			// new LiberalStudent();
		list2.add(t2);			// new MechanicEngineeringStudnet();
		list2.add(t3);			// new HistoricStudent();
		
		for(int i = 0; i < list1.size(); i++) {			// 내부 요소의 타입이 지정되지 않아서, Object로 처리 중
			System.out.printf("%s : %d원\n", list2.get(i).getName(), list2.get(i).getPrice());
		}
		System.out.println("=====================================");
		
		for(Toy t : list2) {
			t.show();
		}
		System.out.println("=====================================");
	}
}
