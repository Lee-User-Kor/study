package 이재호1;

import java.util.Scanner;

class Student1 {
	String name;
	int cLang, java, spring, sum, num;
	double avg;
}

public class Test2 {
	
	// 메뉴 호출
	static void menuList() {
		System.out.println("※※※ 학생 성적관리 프로그램 ※※※");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 리스트(번호)");
		System.out.println("4. 학생 정보 리스트(평균)");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
	}
	
	// 학생 정보 추가
	static void addInfo(Student1[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\t>>> 학생 정보 추가 <<<\t\n");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Student1();
				System.out.print("이름 : ");
				arr[i].name = sc.next();
				System.out.print("C언어 : ");
				arr[i].cLang = sc.nextInt();
				if(arr[i].cLang < 0 || arr[i].cLang > 100) {
					System.out.println(">>> 점수 오류!! <<<");
					arr[i] = null;
					break;
				}
				System.out.print("JAVA : ");
				arr[i].java = sc.nextInt();
				if(arr[i].java < 0 || arr[i].java > 100) {
					System.out.println(">>> 점수 오류!! <<<");
					arr[i] = null;
					break;
				}
				System.out.print("SPRING : ");
				arr[i].spring = sc.nextInt();
				if(arr[i].spring < 0 || arr[i].spring > 100) {
					System.out.println(">>> 점수 오류!! <<<");
					arr[i] = null;
					break;
				}
				
				arr[i].num = i + 1;
				arr[i].sum = arr[i].cLang + arr[i].java + arr[i].spring;
				arr[i].avg = arr[i].sum / 3.0;
				
				System.out.println(">>> 정보 추가 완료!! <<<");
				System.out.println();
				return;
			}
			if(i == arr.length - 1) {
				System.out.println("더이상 정보를 추가할 수 없습니다(35/35)");
				System.out.println();
				break;
			}
		}
		
	}
	
	// 학생 정보 검색
	static void searchInfo(Student1[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">>> 학생 정보 검색 <<<");
		System.out.print("이름 : ");
		String search = sc.next();
		int trueInfo = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(search.equals(arr[i].name)) {
					System.out.println("===============================");
					System.out.printf("%d번) %s 학생\nC언어 : %d점\nJAVA : %d점\nSPRING : %d점\n합계 : %d점\n평균 : %.2f점\n",
							arr[i].num, arr[i].name, arr[i].cLang, arr[i].java, arr[i].spring, arr[i].sum, arr[i].avg);
					System.out.println("===============================");
					trueInfo++;
				}
			}			
		}
		if(trueInfo == 0) {
			System.out.printf(">>> %s(은)는 없는 학생입니다!! <<<\n", search);
		}
		System.out.println();
	}
	
	// 학생 정보 리스트(번호)
	static void listInfo(Student1[] arr) {
		System.out.println(">>> 학생 정보 리스트(번호) <<<");
		System.out.println("===============================");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%d번) %s 학생의 합계 : %d점, 평균 : %.2f점\n",
						arr[i].num, arr[i].name, arr[i].sum, arr[i].avg);
			}
		}
		System.out.println("===============================");
		System.out.println();
	}
	

	// 학생 정보 리스트(평균)
	static void listAvgInfo(Student1[] arr) {
		System.out.println(">>> 학생 정보 리스트(평균) <<<");
		System.out.println("===============================");
		// 평균 내림차순
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].avg < arr[j].avg) {
					int tmp = arr[i].num;
					arr[i].num = arr[j].num;
					arr[j].num = tmp;
					String tmp2 = arr[i].name;
					arr[i].name = arr[j].name;
					arr[j].name = tmp2;
					int tmp3 = arr[i].sum;
					arr[i].sum = arr[j].sum;
					arr[j].sum = tmp3;
					double tmp4 = arr[i].avg;
					arr[i].avg = arr[j].avg;
					arr[j].avg = tmp4;
				}
			}
		}
		// 출력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%d번) %s 학생의 합계 : %d점, 평균 : %.2f점\n",
						arr[i].num, arr[i].name, arr[i].sum, arr[i].avg);
			}
		}
		
		System.out.println("===============================");
		System.out.println();
		
		// 번호 오름차순
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].num > arr[j].num) {
					int tmp = arr[i].num;
					arr[i].num = arr[j].num;
					arr[j].num = tmp;
					String tmp2 = arr[i].name;
					arr[i].name = arr[j].name;
					arr[j].name = tmp2;
					int tmp3 = arr[i].sum;
					arr[i].sum = arr[j].sum;
					arr[j].sum = tmp3;
					double tmp4 = arr[i].avg;
					arr[i].avg = arr[j].avg;
					arr[j].avg = tmp4;
				}
			}
		}	
	}
	
	// 학생 정보 삭제
	static void removeInfo(Student1[] arr) {
		Scanner sc = new Scanner(System.in);		
		System.out.println(">>> 학생 정보 삭제 <<<");
		System.out.print("이름 : ");
		String remove = sc.next();
		int trueInfo = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(remove.equals(arr[i].name)) {
					System.out.println("===============================");
					System.out.printf("%d번) %s 학생\nC언어 : %d점\nJAVA : %d점\nSPRING : %d점\n합계 : %d점\n평균 : %.2f점\n",
							arr[i].num, arr[i].name, arr[i].cLang, arr[i].java, arr[i].spring, arr[i].sum, arr[i].avg);
					System.out.println("===============================");
					trueInfo++;
					System.out.print("위 학생의 정보를 삭제 하시겠습니까? (y/n) : ");
					String answer = sc.next();
					answer.toLowerCase();
					SYSTEM: switch(answer) {
					case "y":
						arr[i] = null;
						System.out.println("↑↑↑ 정보 삭제 완료!! ↑↑↑");
						System.out.println();
						break;
					case "n":
						break SYSTEM;
					default:
						System.out.println(">>> 잘못 입력하셨습니다 <<<");
						System.out.println();
						break;
					}
				}
			}
		}
		if(trueInfo == 0) {
			System.out.printf(">>> %s(은)는 없는 학생입니다!! <<<\n", remove);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//선언
		Student1[] arr = new Student1[35];
		int menu = 0;
		
		//구조
		Scanner sc = new Scanner(System.in);
		
		do {
			menuList();
			System.out.print("메뉴 입력 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0: System.out.println("※※※ 프로그램 종료 ※※※");	break;
			case 1: addInfo(arr);								break;
			case 2: searchInfo(arr);							break;
			case 3: listInfo(arr);								break;
			case 4: listAvgInfo(arr);							break;
			case 5: removeInfo(arr);							break;
			default:
				System.out.printf("\t>>> 메뉴를 잘못 선택하셨습니다 <<<\t\n");
				System.out.println();
				break;
			}
		}while(menu != 0);
		
		
		
	}
}
