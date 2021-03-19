package day16;

class Square {
	int size = 5;
	
	public void show() {						// 가급적이면 상수보다 변수를 참조하는 코드를 작성하세요
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i == 0 || j == 0 || i == size - 1 || j == size - 1) {
					System.out.print(". ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


public class Quiz1 {
	public static void main(String[] args) {
		Square s1 = new Square();
		s1.show();
		// 가로 5, 세로 5의 정사각형이 출력되도록 코드를 만들어보세요
	}
}
