package summary;

public class Human {
	
	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public void give(Cat cat) {
//		String format = "%s(이)가 %s에게 먹이를 주었다";
//		format = String.format(format, this.name, cat.getName());
//		System.out.println(format);
//	}
//	
//	public void give(Dog dog) {
//		String format = "%s(이)가 %s에게 먹이를 주었다";
//		format = String.format(format, this.name, dog.getName());
//		System.out.println(format);
//	}
//	공통점을 Animal에 작성했기 때문에 Animal 클래스 하나로 처리 가능
	
	// 인터페이스도 매개변수의 자료형이 될 수 있다
	public void give(Mate ob) {
		String feed = "먹이";
		String way = "";
		
		if(ob instanceof Cat) feed = "츄르";
		if(ob instanceof Dog) feed = "육포";
		if(ob instanceof Friend) feed = "커피";
		if(ob instanceof Animal) way = "던져 ";
		if(ob instanceof Human) way = "건네 "; 
		// 가장 아래단계의 클래스만 instanceof를 쓰는건 아니다
		
		String format = "%s(이)가 %s에게 %s를 %s주었다";
		format = String.format(format, this.name, ob.getName(), feed, way);
		System.out.println(format);
		// 대상이 Animal이면 feed를 던져 주었다
		// 대상이 Human이면 feed를 건네 주었다
	}
}
