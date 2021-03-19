package day16;

class Card {
	private static int size = 9;
	private String num;
	private String pattern;
	// 생성자 매개변수를 통해서 size를 결정하고
	// show에서 지정된 크기의 사각형을 특수문자를 활용하여 선으로 구성된 사각형으로 출력하세요
	public Card(String num, String pattern) {
		this.num = num;
		this.pattern = pattern;
	}
	
	public void show() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i == 0 && j == 0){
					System.out.print("┌");
				}else if(i == 0 && j == size - 1) {
					System.out.print("┐");
				}else if(i == size - 1 && j == 0) {
					System.out.print("└");
				}else if(i == size - 1 && j == size - 1) {
					System.out.print("┘");
				}else if(i == 0 && i < j) {
					System.out.print("─");
				}else if(i == size - 1 && i > j) {
					System.out.print("─");
				}else if(j == 0 && i > j) {
					System.out.print("│");
				}else if(j == size - 1 && i < j) {
					System.out.print("│");
				}else if(i == size - 2 && j == size - 2){
					System.out.printf("%s", num);
				}else if(i == 1 && j == 1) {
					System.out.printf("%s", num);
				}else if(i == size - 3 && j == size - 2){
					System.out.printf("%s", pattern);
				}else if(i == 2 && j == 1){
					System.out.printf("%s", pattern);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	
	

	public static void setSize(int size) {
		Card.size = size;
	}
		

}


public class Quiz4 {
	public static void main(String[] args) {
		// 모든 카드의 크기를 조절하는 메서드 setSize() 를 Card 클래스에 작성하고, 작동을 테스트하세요
		
		Card ob1 = new Card("J", "♠");
		Card ob2 = new Card("Q", "♣");
		Card ob3 = new Card("K", "♥");
		Card ob4 = new Card("A", "●");
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
		Card.setSize(15);
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}
}
