package abstractClass;

abstract class PrintMessage {
	
	protected String prompt = "[root@itbank ~]#";
	
	public abstract void show(String message);
}

public class Ex02 {
	public static void main(String[] args) {
		// 추상클래스는 객체를 생성할 수 없다
		
		PrintMessage ob = new PrintMessage() {			// 생성자 내부에서 클래스의 형식을 새롭게 정의한다
			@Override
			public void show(String message) {
				System.out.println(prompt + " : " + message);
				
			}
		};	// 기존의 추상클래스를 상속받아서 즉석에서 형식을 정의하는 클래스
			// 즉석에서 정의했기 때문에, 클래스 이름이 없다
			// 익명 클래스
		
		ob.show("안녕하세요");
		ob.show("오늘은 3월 19일입니다");
		ob.show("불금이네요. 다들 바쁘시죠??");
		
		System.out.println(ob.getClass());	// PrintMessage의 인스턴스는 아니고
											// PrintMessage를 생속받은 서브 클래스의 객체
		
		PrintMessage ob2 = new PrintMessage() {
			@Override
			public void show(String message) {
				System.err.println(message + "!!");
			}
		};
		
		ob2.show("Hello, world");
		System.out.println(ob2.getClass());
		
		// 함수의 형식을 정해두고, 형식에 맞춰서 작성하면, 해당 함수를 다른 곳에서 호출하여 사용하는 형태
		
		
	}
}
