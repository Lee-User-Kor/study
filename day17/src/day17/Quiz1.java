package day17;

class Human {
	private String name;
	
	// 이름을 전달받는 생성자
	public Human(String name) {
		this.name = name;
	}
	// getter
	public String getName() {
		return name;
	}
	// 자신의 이름을 출력하는 show() 메서드
	public void show() {
		System.out.println("저는 [Human] " + name + " 입니다.");
	}
	
}//class Human end
class Doctor extends Human {
	public Doctor(String name) {
		super(name);
	}
	@Override
	public void show() {
		System.out.println("저는 [Doctor] " + getName() + " 입니다.");
	}
	//응급처치 고유 메서드
	public void cure() {
		show();
		System.out.println("##### 응급 치료 중 #####");
	}
}//class Doctor end
class Student extends Human {
	public Student(String name) {
		super(name);
	}
	@Override
	public void show() {
		System.out.println("저는 [Studnet] " + getName() + " 입니다.");
	}
}//class Student end
class Singer extends Human {
	public Singer(String name) {
		super(name);
	}
	@Override
	public void show() {
		System.out.println("저는 [Singer] " + getName() + " 입니다.");
	}
}//class Singer end
class Air {
	private Human[] seat = new Human[4];
	// Human을 매개변수로 받아서 seat의 빈칸에 넣어주는 메서드 enter(Human human)
	public void enter(Human human) {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] == null) {
				seat[i] = human;
				System.out.println(human.getName() + " : 탑승 완료 !!");
				return;
			}
		}
		System.out.println(human.getName() + " : 자리가 없는데 어떻게 타요??");
	}
	public void emergency() {
		System.out.println("*** 응급 상황 발생!! ***\nAir : 승객 여러분들 중에 의사선생님 계신가요?!");
		for(Human h : seat) {
			if(h instanceof Doctor) {
				Doctor d = (Doctor)h;
				d.cure();
				return;
			}
		}
		System.out.println("의사를 찾을 수 없습니다.");
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Doctor c1 = new Doctor("메르시");
		Student c2 = new Student("철수");
		Singer c3 = new Singer("아이유");
		Human c4 = new Human("홍길동");
		Human c5 = new Human("조세호");
		
		Air plane = new Air();
		plane.enter(c1);				// 이름 : 탑승 완료 !!
		plane.enter(c2);
		plane.enter(c3);
		plane.enter(c4);
		plane.enter(c5);				// 조세호 : 자리가 없는데 어떻게 타요??
		
		plane.emergency();				// 승객 중에서 자료형이 Doctor인 객체를 찾아서
										// 이름을 말하게 하고, 응급처치 중 이라는 메시지를 출력한다
										// 메시지를 출력하는 주체가 Doctor 인스턴스가 되도록 한다
										// Doctor 클래스의 메서드를 호출해야 한다 (고유기능)
	}
}
