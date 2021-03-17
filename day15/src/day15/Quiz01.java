package day15;

import java.util.Scanner;

class Admin {
	private String id = "admin";
	private String pw = "ad.vending";
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
}

class Product {
	private String name;
	private int price;
	private int cnt;
		
	public Product(String name, int price, int cnt){
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCnt() {
		return cnt;
	}
	
}//class Product end

class Coin {
	private int name;
	private int cnt;
	private int total;
	
	public Coin(int name, int cnt) {
		this.name = name;
		this.cnt = cnt;
		this.total = name * cnt;
	}
	
	public void setName(int name) {
		this.name = name;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setTotal(int cnt) {
		this.total = name * cnt;
	}
	
	public int getName() {
		return name;
	}
	public int getCnt() {
		return cnt;
	}
	public int getTotal() {
		return total;
	}
}//class Coin end

class Money {
	private int name;
	private int cnt;
	private int total;
	
 	public Money(int name, int cnt) {
		this.name = name;
		this.cnt = cnt;
		this.total = name * cnt;
	}
	
	public void setName(int name) {
		this.name = name;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setTotal(int cnt) {
		this.total = name * cnt;
	}
	
	public int getName() {
		return name;
	}
	public int getCnt() {
		return cnt;
	}
	public int getTotal() {
		return total;
	}
}//class Money end


class VM {
	private Scanner sc = new Scanner(System.in);
	private Product[] product = new Product[8];
	private Coin oneCoin = new Coin(100,0);
	private Coin fiveCoin = new Coin(500,0);
	private Money money = new Money(1000,0);
	private Admin admin = new Admin();
	private int userMoney;
	private int vmMoney;
	
	
	//상품등록 메서드
	private void createProduct() {
		System.out.println("$$$ 상품 등록 $$$");
		String name;
		int price, cnt;
		for(int i = 0; i < product.length; i++) {
			if(product[i] == null) {
				//상품명 등록
				System.out.print("상품 이름 : ");
				name = sc.next();
				//가격 등록
				System.out.print("상품 가격 : ");
				price = sc.nextInt();
				if(price < 0) {
					System.out.println("### 가격 정보 에러 ###");
					product[i] = null;
					i--;
					continue;
				}
				//상품재고 등록
				System.out.print("상품 재고 : ");
				cnt = sc.nextInt();
				if(cnt < 0 || cnt > 10) {
					System.out.println("### 재고 수량 에러 ###\n### 0 ~ 10 ONLY ###");
					product[i] = null;
					i--;
					continue;
				}
				product[i] = new Product(name,price,cnt);
				System.out.println("$$$ 상품 등록 완료 $$$");
				System.out.println();
				return;
			}
			if(i == product.length - 1) {
				System.out.println("### 상품 추가 완료 (8/8) ###");
				System.out.println();
			}
		}
	}
	
	//전체메뉴 출력 메서드
	private void menuList() {
		System.out.println("$$$ Vending Machine $$$");
		System.out.println("1) 요금 투입");
		System.out.println("2) 상품 선택");
		System.out.println("3) 거스름돈 반환");
		System.out.println("4) 관리자 모드");
		System.out.println("0) 종료");
	}
	
	//요금 투입  메서드
	private void addCostList() {
		int menu;
		System.out.println("$$$ 요금 투입 $$$");
		System.out.println("1) 동전 (100, 500원 사용가능)");
		System.out.println("2) 지폐 (1000원권 사용가능)");
		System.out.println("3) 뒤로가기");
		System.out.print("메뉴 입력 > ");
		menu = sc.nextInt();
		System.out.println();
		
		switch(menu) {
		case 1:
			addCoin();
			break;
		case 2:
			addMoney();
			break;
		case 3:
			break;
		default :
			System.out.println("### 메뉴 입력 에러 ###");
		}
		System.out.println();
	}
	
	//동전 투입 메서드
	private void addCoin() {
		int menu;
		
		System.out.println("$$$ 동전 투입 $$$");
		System.out.println("1) 100원");
		System.out.println("2) 500원");
		System.out.println("3) 뒤로가기");
		System.out.print("메뉴 입력 > ");
		menu = sc.nextInt();
		System.out.println();
		
		switch(menu) {
		case 1: 
			addOneCoin();
			break;
		case 2:
			addFiveCoin();
			break;
		case 3:
			break;
		default :
				System.out.println("### 메뉴 입력 에러 ###");
		}
		System.out.printf("사용가능한 금액 : %d원", userMoney);
		System.out.println();
	}
	
	//100원 투입 메서드
	private void addOneCoin() {
		int cnt;
		System.out.println("$$$ 100원 투입 $$$");
		System.out.print("투입 갯수 > ");
		cnt = sc.nextInt();
		if(cnt < 1) {
			System.out.println("### 요금 충전 에러 ###");
			cnt = 0;
		}
		oneCoin.setCnt(cnt);
		oneCoin.setTotal(cnt);
		userMoney += oneCoin.getTotal();
		System.out.println("$$$ 요금 충전 완료 $$$");
	}
	//500원 투입 메서드
	private void addFiveCoin() {
		int cnt;
		System.out.println("$$$ 500원 투입 $$$");
		System.out.print("투입 갯수 > ");
		cnt = sc.nextInt();
		if(cnt < 1) {
			System.out.println("### 요금 충전 에러 ###");
			cnt = 0;
		}
		fiveCoin.setCnt(cnt);
		fiveCoin.setTotal(cnt);
		userMoney += fiveCoin.getTotal();
		System.out.println("$$$ 요금 충전 완료 $$$");
	}
	
	//지폐 투입 메서드
	private void addMoney() {
		int menu;
		
		System.out.println("$$$ 지폐 투입 $$$");
		System.out.println("1) 1000원");
		System.out.println("2) 뒤로가기");
		System.out.print("메뉴 입력 > ");
		menu = sc.nextInt();
		System.out.println();
		
		switch(menu) {
		case 1: 
			addThousandMoney();
			break;
		case 2:
			break;
		default :
				System.out.println("### 메뉴 입력 에러 ###");
		}
		System.out.printf("사용가능한 금액 : %d원", userMoney);
		System.out.println();
	}
	
	//1000원 투입 메서드
	private void addThousandMoney() {
		int cnt;
		System.out.println("$$$ 1000원 투입 $$$");
		System.out.print("투입 갯수 > ");
		cnt = sc.nextInt();
		if(cnt < 1) {
			System.out.println("### 요금 충전 에러 ###");
			cnt = 0;
		}
		money.setCnt(cnt);
		money.setTotal(cnt);
		userMoney += money.getTotal();
		System.out.println("$$$ 요금 충전 완료 $$$");
	}
	
	//상품메뉴  메서드
	private void productList() {
		int menu;
		
		System.out.println("$$$ Product List $$$");
		for(int i = 0; i < product.length / 2; i++) {
			if(product[i] != null) {
				System.out.printf("(%d) %s : %d원 \t", i + 1, product[i].getName(), product[i].getPrice());
			}
		}
		System.out.println();
		for(int i = 4; i < product.length; i++) {
			if(product[i] != null) {
				System.out.printf("(%d) %s : %d원 \t", i + 1, product[i].getName(), product[i].getPrice());
			}
		}
		System.out.println();
		System.out.println("0) 뒤로가기");
		System.out.print("메뉴 입력 > ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:			sellProduct(menu);			break;
		case 2:			sellProduct(menu);			break;
		case 3:			sellProduct(menu);			break;
		case 4:			sellProduct(menu);			break;
		case 5:			sellProduct(menu);			break;
		case 6:			sellProduct(menu);			break;
		case 7:			sellProduct(menu);			break;
		case 8:			sellProduct(menu);			break;
		case 0:										break;
		default : System.out.println("### 메뉴 입력 에러 ###");
		}
	}
	
	// 상품 판매 메서드
	private void sellProduct(int menu) {
		if(product[menu - 1] != null) {
			if(userMoney >= product[menu - 1].getPrice()) {
				if(product[menu - 1].getCnt() == 0) {
					System.out.println("### 판매 불가!! (재고 없음) ###");
					System.out.println();
					
				}
				userMoney -= product[menu - 1].getPrice();
				product[menu - 1].setCnt(product[menu - 1].getCnt() - 1);
				vmMoney += product[menu - 1].getPrice();
				System.out.printf("%s 상품이 판매되었습니다. 잔액 : %d원\n", product[menu - 1].getName(), userMoney);
				System.out.println();
				
			}else {
				System.out.println("### 요금이 부족합니다 ###");
				System.out.printf("상품 금액 : %d원 || 잔액 : %d원\n", product[menu - 1].getPrice(), userMoney);
				System.out.println();				
			}				
		}
	}
	
	// 관리자모드 메서드
	private void adminMode() {
		String id, pw;
		System.out.println("$$$ 관리자 모드 $$$");
		System.out.print("Id > ");
		id = sc.next();
		System.out.print("Pw > ");
		pw = sc.next();
		if(id.equals(admin.getId()) && pw.equals(admin.getPw())) {
			System.out.println("로그인 성공 !!");
			int menu;
			do {
				System.out.println();
				System.out.println("$$$ Admin Mode $$$");
				System.out.println("1) 상품 등록");
				System.out.println("2) 입고");
				System.out.println("3) 상품재고현황");
				System.out.println("4) 매출현황");
				System.out.println("0) 종료");
				System.out.print("메뉴 입력 > ");
				menu = sc.nextInt();
				System.out.println();
				SYSTEM: switch(menu) {
				case 1:		createProduct();			break SYSTEM;
				case 2:		addProduct();				break SYSTEM;
				case 3:		productStatus();			break SYSTEM;
				case 4:		salesStatus();				break SYSTEM;
				case 0:									break;
				default : System.out.println("메뉴 선택 에러");
				}
			}while (menu != 0);
		}		
	}
	// 입고 메서드
	private void addProduct() {
		int menu, cnt;
		System.out.println("$$$ 상품 입고 $$$");
		System.out.print("상품 번호 : ");
		menu = sc.nextInt();
		System.out.print("입고 수량 : ");
		cnt = sc.nextInt();
		if(product[menu - 1] != null) {
			int tmp = product[menu - 1].getCnt();
			product[menu - 1].setCnt(product[menu - 1].getCnt() + cnt);
			if(product[menu - 1].getCnt() > 10) {
				System.out.println("### 재고 한도 초과 ###");
				System.out.printf("%s 상품 현재고 : %d개\n", product[menu - 1].getName(), product[menu - 1].getCnt());
				System.out.println();
				product[menu - 1].setCnt(tmp);
				return;
			}
		}
		System.out.printf("%s 상품 %d개 입고 완료! 현재고 : %d개\n", product[menu - 1].getName(), cnt, product[menu - 1].getCnt());
		System.out.println();
	}
	// 매출현황  메서드
	private void salesStatus() {
		System.out.println("$$$ 매출 현황 $$$");
		System.out.printf("총 판매금액 : %d원\n", vmMoney);
		System.out.println();
	}
	// 상품재고현황 메서드
	private void productStatus() {
		System.out.println("$$$ 상품 재고 현황 $$$");
		for(int i = 0; i < product.length; i++) {
			if(product[i] != null) {
				System.out.printf("%d) %s : %d개\n", i + 1, product[i].getName(), product[i].getCnt());				
			}
		}
		System.out.println();
	}
	
	
	
	//VM 작동
	public void start() {
		int menu;
		do {
			menuList();
			System.out.print("메뉴 선택 > ");
			menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:			addCostList();				break;
			case 2:			productList();				break;
			case 3:
				System.out.printf("사용자 자판기 사용 종료, 거스름돈 : %d원\n\n", userMoney);
				userMoney = 0;
				break;
			case 4: 		adminMode();				break;
			case 0:	System.out.println("자판기 종료 !");	break;
			default :
				System.out.println("### 메뉴 입력 에러 ###");
			}
		}while (menu != 0);
		
	}
	
}//class VM end


public class Quiz01 {
	public static void main(String[] args) {
		
		VM vendingMachine = new VM();
		
		vendingMachine.start();
	}
}
