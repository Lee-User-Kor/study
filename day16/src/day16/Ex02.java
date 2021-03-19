package day16;

class Member {								// static 요소는 서로 다른 객체간에도 값을 공유한다
	private String name;
	private int age;
	private static int memberCount;			// 객체를 생성할 때 마다 1씩 증가시킬 값
											
	// 생성자
	public Member(String name) {
		this.name = name;
		memberCount++;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static int getMemberCount() {	
		return memberCount;
//	Cannot make a static reference to the non-static field memberCount
//	static 요소 getMemberCount() 에서 non-static인 memberCount를 참조 할 수 없습니다
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void setMemberCount(int memberCount) {
		Member.memberCount = memberCount;
	}
	
	
}
public class Ex02 {
	// 자바의 메인함수는 형태가 고정되어 있다. 항상 static이다			<- 객체 생성 없이도 실행 가능해야 한다
	// 메인함수에서 호출하는 함수는 모두 static을 붙여서 작성해야 한다		<- static은 non-static을 참조할 수 없다
	public static void main(String[] args) {
		Member m1 = new Member("염지광");
		System.out.println("m1의 이름 : " + m1.getName());
		System.out.println("현재 생성된 객체의 수 : " + Member.getMemberCount());
		
		Member m2 = new Member("윤재홍");
		System.out.println("m2의 이름 : " + m2.getName());
		System.out.println("현재 생성된 객체의 수 : " + Member.getMemberCount());
		
		
		Member m3 = new Member("천진반");
		System.out.println("m3의 이름 : " + m3.getName());
		System.out.println("현재 생성된 객체의 수 : " + Member.getMemberCount());
		
		System.out.println("m1으로 접근한 총 객체의 수 : " + m1.getMemberCount());
		System.out.println("m2으로 접근한 총 객체의 수 : " + m2.getMemberCount());
		System.out.println("m3으로 접근한 총 객체의 수 : " + m3.getMemberCount());
		
		m3.setMemberCount(100);				// m3객체를 통해서 값을 지정하고
		System.out.println();				// m1객체를 통해서 값을 출력한다
		System.out.println("m1으로 접근한 총 객체의 수 : " + m1.getMemberCount());
//		The static method getMemberCount() from the type Member should be accessed in a static way
//		static 요소는 객체를 통해서 접근할 수도 있으나, 엄밀하게는 클래스에 속한 값이므로, 클래스를 통해서 접근하는 것이 올바르다

	}
}
