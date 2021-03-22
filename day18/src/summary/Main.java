package summary;

public class Main {
	public static void main(String[] args) {
		
		Human h1 = new Human("이지은");
		Cat c1 = new Cat("나옹이");
		Dog d1 = new Dog("몽실이");
		Friend f1 = new Friend("유인나");
		
		h1.give(c1);
		h1.give(d1);
		h1.give(f1);
		f1.give(c1);
		
	}
}
// 클래스는 자료형이다 (필드, 메서드, 생성자)
// 자바의 메서드는 중복정의가 가능하다  - 오버로딩
// 클래스 간의 공통성을 추출하여 슈퍼클래스로 작성하고
// 상속 관계를 이용할 수 있다 (super())
// Object는 모든 객체 유형을 처리할 수 있으므로 남발하면 안된다
// 서로 다른 슈퍼클래스를 가지는 객체를 묶어서 처리하고 싶으면?
// 인터페이스는 extends 여부에 상관없이 구현할 수 있다
// 인터페이스도 자료형의 역할로 사용할 수 있다