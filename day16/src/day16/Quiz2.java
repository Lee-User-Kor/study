package day16;

class Square2 {
	int size;
	
	// 생성자 매개변수를 통해서 size를 결정하고
	// show에서 지정된 크기의 사각형을 특수문자를 활용하여 선으로 구성된 사각형으로 출력하세요
	public Square2(int size) {
		this.size = size;
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
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}


public class Quiz2 {
	public static void main(String[] args) {
		Square2 ob = new Square2(5);
		ob.show();
	}
}
