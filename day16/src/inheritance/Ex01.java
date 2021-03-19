package inheritance;

class Super {
	int var1 = 1;
	
	void show() {
		System.out.println("var1 : " + var1);
	}
}

class Sub extends Super{
	// 아무 내용도 없음, Super의 내용을 그대로 가지게 된다 (똑같은 클래스)
	// 똑같은 클래스를 만들거였으면, 원래 클래스를 그냥 사용하면 된다
	// 기존의 클래스의 특징을 그대로 물려받고, 추가 기능을만들어내거나, 기능을 변경하기 위해서이다
	int var2 = 2;
	
	void show() {		// 똑같은 반환형과 이름과 매개변수 형식으로 정의하면, 물려받은 메서드를 재정의한다
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
	}
	void sub() {		// 상속받은 내용이 아니므로, 서브클래스의 고유한 메서드이다
		System.out.println("슈퍼 클래스가 가지고 있지 않은 서브 클래스만의 고유 메서드");
	}
}

//class Sub2 extends Sub {
//	int var3 = 3;
//	
//	void show() {
//		System.out.println("var1 : " + var1 + ", var2 : " + var2 + ", var3 : " + var3);		
//	}
//}

public class Ex01 {
	public static void main(String[] args) {
		Super ob1 = new Super();
		ob1.show();
		Sub ob2 = new Sub();
		ob2.show();
		ob2.sub();
//		Sub2 ob3 = new Sub2();
//		ob3.show();
	}
}
