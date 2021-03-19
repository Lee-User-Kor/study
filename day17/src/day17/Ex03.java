package day17;

class Item {
	private String name;
	private int price;
	private String comment;
	
	public Item(String name, int price, String comment) {
		this.name = name;
		this.price = price;
		this.comment = comment;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getComment() {
		return comment;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	@Override
	public String toString() {		// 객체를 문자열 형태로 표현할 때 어떤 형식으로 표현할 지 결정하는 메서드
		return String.format("%s\t/ %,d원\t%s", name, price, comment);
	}
	
	
}


public class Ex03 {
	public static void main(String[] args) {
		Item item1 = new Item("비타500", 1000, "항산화작용 비타민C 500mg 함유");
		Item item2 = new Item("보드마카", 2000, "용도 외에는 사용하지 마십시오");
		Item item3 = new Item("하늘보리", 1600, "100% 국산 보리");
		
		Item[] arr = { item1, item2, item3 };
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%s\t/ %,d원\t%s\n",
					arr[i].getName(), arr[i].getPrice(), arr[i].getComment());
		}
		System.out.println();
		
		for(Item i : arr) {
			System.out.println(i);
		}
	}
}
