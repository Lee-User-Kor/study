package abstractClass;

interface USB {
	// 필드는 모두 static final
	// 추상메서드만 선언할 수 있음
	void react();
}
class PortableSSD implements USB {
	@Override
	public void react() {
		System.out.println("SSD 연결됨. 용량 2TB");
	}	
}
class ChargeCable implements USB {
	@Override
	public void react() {
		System.out.println("충전 케이블 연결됨. 충전 중...87%");
	}
}
class Speaker implements USB {
	@Override
	public void react() {
		System.out.println("스피커가 연결되었습니다.");
	}
}
class PC{
	public void connect(USB ob) {		// 슈퍼클래스의 역할, 서로 다른 자료형을 묶어서 처리할 수 있도록 한다
		ob.react();						// 오버라이딩 메서드 호출, 서브클래스의 메서드 내용이 실행된다
	}
}

public class Ex04 {
	public static void main(String[] args) {
		PortableSSD ob1 = new PortableSSD();
		ChargeCable ob2 = new ChargeCable();
		Speaker ob3 = new Speaker();
		
		PC pc = new PC();
		
		pc.connect(ob1);		// SSD가 연결되면 저장 장치의 전체용량을 임의로 출력하는 코드
		pc.connect(ob2);		// 전원 충전 중...
		pc.connect(ob3);		// 스퍼커 연결 됨
		
		// java 1.8 이상에서는 람다식을 활용한 인터페이스 객체 생성이 가능하다 (익명 내부 클래스와는 다르다)
		// [인터페이스에 추상메서드가 하나만 존재하는 경우] 사용 가능 (함수를 객체로 취급하기 위해서 사용하는 형태)
		USB mouse = () -> System.out.println("마우스 연결 됨 !!");
		pc.connect(mouse);
		
		USB mic = () -> {
			System.out.println("마이크가 연결되었습니다");
			System.out.println("마이크 테스트 진행 중...");
		};
		pc.connect(mic);
		
		USB memoryStick = new USB() {	// 인터페이스도 추상클래스이므로, 익명 내부 클래스 형식도 가능하다
			@Override
			public void react() {
				System.out.println("SanDisk 16GB 연결됨");
			}
		};
		pc.connect(memoryStick);
		
		System.out.println(mouse.getClass());
	}
}
