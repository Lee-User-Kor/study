package inheritance;

class Member {									// 사이트 회원
	String userId;
	Member(String userId){
		this.userId = userId;
	}
	void show() {
		System.out.println("ID : " + userId); 
	}
}//class Member end
class Customer extends Member {					// 주로 구매를 하는 고객 회원
	Customer(String userId) {
		super(userId);
	}
	void show() {						// 슈퍼클래스에 없는 메서드, 고유기능
		System.out.println("[구매고객] ID : " + userId);
	}
}//class Customer end
// 메서드 오버로딩	: 상속이랑 관련없고, 하나의 함수 이름으로, 여러개의 정의를 만들어내는 작업 (중복정의)
// 메서드 오버라이딩 : 상속 받은 메서드이 형식을 그대로 유지하면서 내용을 새로 정의하는 작업 	(재정의)
class Seller extends Member {					// 주로 판매를 하는 회원
	Seller(String userId){
		super(userId);
	}
	@Override									// 오버라이딩 규칙에 어긋나면 경고를 표시 (Annotation)
	void show() {								// 슈퍼클래스에서 이미 정의된 메서드, 상속받은 기능
		System.out.println("[판매고객] ID : " + userId);
	}
}//class Seller end
public class Ex03 {
	public static void main(String[] args) {
		Member m1 = new Member("member");
		Customer ob1 = new Customer("test1");
		Seller ob2 = new Seller("itbank");

		ob1.show();
		ob2.show();
		
		
		// 학생은 사람이다
		// 판매고객은 멤버이다.
		// 구매고객은 멤버이다
		
		Member m2 = ob1;
		Member m3 = ob2;
		System.out.println("========================");
		Member[] arr = { m1, m2, m3 };
		for(Member m : arr) {
			m.show();
		}
	}
}
