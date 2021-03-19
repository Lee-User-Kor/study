package day16;

class Circle {
	private static final double pi = 3.1415926535;	// static과 final은 동시에 사용 가능
	double radius;
	
	public Circle(int radius, double pi) {			// 전달받은 값을 final에 할당하는것도 가능하다
		this.radius = radius;
//		this.pi = pi;								// final 멤버 필드에 대해서 초기화하지 않으면 생성자에서 1번 초기화 가능
	}
	public void show() {
		final int localVariable;					// 함수의 지역변수도 final 적용 가능
		localVariable = 1;							// 1회에 한해서 초기화 가능하다
//		localVariable = 2;							// 초기화 이후에는 값을 할당할 수 없다
		System.out.printf("넓이 : %.2fcm²\n", radius * radius * pi);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3, 3.14);
		
//		c1.pi = 3;									// The final field Circle.pi cannot be assigned
		c1.show();
		
		
	}

}
