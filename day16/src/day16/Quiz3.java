package day16;

class Square3 {
	int size = 9;
	String num;
	String pattern;
	// 생성자 매개변수를 통해서 size를 결정하고
	// show에서 지정된 크기의 사각형을 특수문자를 활용하여 선으로 구성된 사각형으로 출력하세요
	public Square3(String num, String pattern) {
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
	
}


public class Quiz3 {
	public static void main(String[] args) {
		Square3 ob1 = new Square3("J", "♠");
		Square3 ob2 = new Square3("Q", "♣");
		Square3 ob3 = new Square3("K", "♥");
		Square3 ob4 = new Square3("A", "●");
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}
}
