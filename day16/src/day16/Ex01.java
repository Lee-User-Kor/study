package day16;

class Human {
	static int numberOfEyes = 2;
	// 하나의 클래스를 이용하여, 여러 객체를 생성할 수 있다
	// static 요소는 객체가 아니라, 클래스에 소속된 요소이다
	// 서로 다른 객체들이 하나의 클래스에 근거하여 값을 [공유]하게 된다
}


public class Ex01 {
	public static void main(String[] args) {
//		Human h1 = new Human();
		System.out.println(Human.numberOfEyes);
		
		// static : 고정적이다
		
		// 일반적인 클래스의 멤버 요소는, 객체를 생성하고나서, 객체를 통해서 접근할 수 있다
		// static 요소는 객체를 생성하지 않아도, 클래스 자체를 통해서 값이나 기능에 접근할 수 있다
		
		// 클래스에 직접 소속되는 값이므로, 객체를 생성하지 않아도 된다
		// 메서드도 동일한 방법으로, 객체를 생성하지 않고서도, 클래스를 통해서 함수를 호출할 수 있다
	}

}
