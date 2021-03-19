package abstractClass;

import java.io.Serializable;

interface Test {
	// 인터페이스 : inter(서로다른) + face(표면, 얼굴) => 서로 다른 형태의 객체를 연결해주는 표면
	// USB, 마우스(입력장치), 키보드(입력장치), 포터블SSD(저장장치), 데이터케이블(전송장치), USB선풍기(충전), 스피커(출력)
	
	// 자바에서 다중 상속이 허용되는 형태
	// extends 키워드 대신, implement 를 사용한다
	// 인터페이스는 추상 클래스의 한 종류이다 -> 추상 클래스는 클래스의 한 종류이다 -> 슈퍼클래스로 활용이 가능하다
	// 인터페이스의 모든 필드는 public static final 속성을 가진다
	// 인터페이스의 모든 메서드는 public abstract 속성을 가진다
	
	/* public static final */String field = "필드";
	/* public abstract */void method();
}
class Phone extends Object implements Test, Serializable {
//	클래스와 동시에 상속도 가능하고, 하나의 클래스가 여러 인터페이스를 상속(구현)하는 것도 가능하다
	
	
	public Phone() {
		System.out.println(Phone.field);	// static이므로, 클래스.필드이름으로 접근하는 것이 맞다
//		field = "새로운 값";					// final이므로 새로운 값을 할당할 수 없다
	}

	@Override
	public void method() {
		System.out.println("미구현 메서드를 상속받아서 구현함");	
	}
	
	
}

public class Ex03 {
	public static void main(String[] args) {
		Phone ob = new Phone();
		ob.method();
	}
}
