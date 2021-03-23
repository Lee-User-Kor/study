package collection;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class FoodSelector {
	// 여러분의 식사 메뉴 선정을 도와주는 클래스를 작성하세요
	
	// Map형식을 활용하여 정수형의 key와 문자열의 메뉴 이름을 value로 저장할 수 있게 하고
	// 메뉴는 사용자가 직접 추가 가능하게끔 Scanner를 이용하여 메뉴 이름을 입력받아서 추가합니다
	// 메뉴를 랜덤으로 추천하기 위해서, Random클래스를 이용하여 지정된 범위 안에서 정수를 추출하고
	// 해당 정수를 Map에 key로 제시하여, value를 받으면 해당 메뉴를 화면에 출력해주는 클래스
	
	private HashMap<Integer, String> food = new HashMap<Integer, String>();
	private int count = 1;
	
	public void selectMenu() {
		System.out.println("### 메뉴 선택 도우미 ###");
		if(food.size() == 0) {
			System.out.println("등록된 메뉴가 없습니다");
			return;
		}else {
			Random rand = new Random();
			int num = rand.nextInt(food.size()) + 1;
			System.out.printf("오늘 추천 메뉴는 [%s] 입니다!!\n", food.get(num));
			System.out.println();			
		}
	}
	
	public void addMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("### 식사 메뉴 추가 ###");
		while(true) {
			System.out.print("메뉴 이름 : ");
			String menu = sc.next();
			food.put(count, menu);
			count++;
			System.out.println("메뉴 추가 성공 !!");
			System.out.println();
			return;
		}
	}
	
	public void listAndCount() {
		System.out.println("### 목록과 개수 출력 ###");
		for(int i = 1; i <= food.size(); i++) {
			System.out.printf("%s) %s\n", i, food.get(i));
		}
		System.out.printf("총 %d개의 메뉴\n", count - 1);
		System.out.println();
	}
	
	public void menuList() {
		System.out.println("### 오늘 뭐 먹지 ? ###");
		System.out.println("1. 메뉴 선택 도우미");
		System.out.println("2. 식사 메뉴 추가");
		System.out.println("3. 목록과 개수 출력");
		System.out.println("0. 종료");
	}
}


public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodSelector fs = new FoodSelector();
		
		int menu;
		// while, switch ~ case 메뉴 구성 : 1. 메뉴 선택 도우미 2. 식사 메뉴 추가 3. 목록과 개수 출력 0. 종료
		do {
			fs.menuList();
			System.out.print("메뉴 선택 > ");
			menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:	fs.selectMenu();			break;
			case 2:	fs.addMenu();				break;
			case 3:	fs.listAndCount();			break;
			case 0: System.out.println("종료");	break;
			default : System.out.println("메뉴 선택 오류 !!\n");
			}
		}while (menu != 0);
		
		sc.close();
	}
}
