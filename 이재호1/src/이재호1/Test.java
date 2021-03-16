package 이재호1;

import java.util.Scanner;

class Student {
	String name;
	int num, cLang, java, spring, sum;
	double avg;
}

public class Test {
	
	//메뉴 목록
	static void menuList() {
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 출력(번호)");
		System.out.println("4. 학생 정보 출력(평균)");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
	}
	
	//학생 추가
	 static void addStudent(Student[] arr) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("=== 학생 정보 입력 ===");
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == null) {
				 arr[i] = new Student();
				 arr[i].num = i + 1;
				 System.out.print("이름 : ");
				 arr[i].name = sc.next();
				 System.out.print("C언어 점수 : ");
				 arr[i].cLang = sc.nextInt();
				 if(arr[i].cLang > 100 || arr[i].cLang < 0) {
					 System.out.println("점수 오류!!");
					 System.out.println();
					 arr[i] = null;
					 break;
				 }
				 System.out.print("JAVA 점수 : ");
				 arr[i].java = sc.nextInt();
				 if(arr[i].java > 100 || arr[i].java < 0) {
					 System.out.println("점수 오류!!");
					 System.out.println();
					 arr[i] = null;
					 break;
				 }
				 System.out.print("SPRING 점수 : ");
				 arr[i].spring = sc.nextInt();
				 if(arr[i].spring > 100 || arr[i].spring < 0) {
					 System.out.println("점수 오류!!");
					 System.out.println();
					 arr[i] = null;
					 break;
				 }
				 System.out.println(" >> 학생 추가 완료!! << ");
				 System.out.println();
				 arr[i].sum = arr[i].cLang + arr[i].java + arr[i].spring;
				 arr[i].avg = arr[i].sum / 3.0;
				 break;
			 }
		 }// for end
	 }// method end
	  
	 
	//학생 검색
	static void searchStudent(Student[] arr) {
		System.out.println("=== 학생 정보 검색 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String search = sc.next();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && search.equals(arr[i].name)) {
				System.out.println("==================================");
				System.out.printf("%d번) %s 학생\nC언어 : %d점\nJAVA : %d점\n"
				+ "SPRING : %d점\n합계 : %d점\n평균 : %.2f점\n",
				arr[i].num, arr[i].name, arr[i].cLang, arr[i].java,
				arr[i].spring, arr[i].sum, arr[i].avg);
				System.out.println("==================================");
			}
			if(arr[i] != null && search.equals(arr[i].name) == false) {
				System.out.println("해당 학생 없음!!");
				System.out.println();
				return;
			}
		}
	}
	
	
	
	//학생 전체 출력(번호)
	static void listNumStudent(Student[] arr) {
		System.out.println("=== 학생 정보 출력(번호) ===");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%d번) %s 학생의 합계 : %d점, 2)평균 : %.2f점\n",
						arr[i].num, arr[i].name, arr[i].sum, arr[i].avg);
			}
		}
		System.out.println("========================");
		System.out.println();
	}
	
	//평균비교
	static int compare(double avg1, double avg2) {
		if(avg1 < avg2)	return -1;
		if(avg1 > avg2)	return 1;
		return 0;
	}
	
	//학생 전체 출력(평균)
	static void listAvgStudent(Student[] arr) {
		System.out.println("=== 학생 정보 출력(평균) ===");
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && compare(arr[i].avg,arr[j].avg) == -1) {
					double tmp1 = arr[i].avg;
					arr[i].avg = arr[j].avg;
					arr[j].avg = tmp1;
					int tmp2 = arr[i].sum;
					arr[i].sum = arr[j].sum;
					arr[j].sum = tmp2;
					String tmp3 = arr[i].name;
					arr[i].name = arr[j].name;
					arr[j].name = tmp3;
					int tmp4 = arr[i].num;
					arr[i].num = arr[j].num;
					arr[j].num = tmp4;
				}
				if(arr[i] != null) {
					System.out.printf("%d번) %s 학생의 합계 : %d점, 평균 : %.2f점\n",
							arr[i].num, arr[i].name, arr[i].sum, arr[i].avg);
				}
			}
		}
		System.out.println("========================");
		System.out.println();
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && compare(arr[i].num,arr[j].num) == 1) {
					double tmp1 = arr[i].avg;
					arr[i].avg = arr[j].avg;
					arr[j].avg = tmp1;
					int tmp2 = arr[i].sum;
					arr[i].sum = arr[j].sum;
					arr[j].sum = tmp2;
					String tmp3 = arr[i].name;
					arr[i].name = arr[j].name;
					arr[j].name = tmp3;
					int tmp4 = arr[i].num;
					arr[i].num = arr[j].num;
					arr[j].num = tmp4;
				}
			}
		}
	} // method end
	
	//학생 정보 삭제
	static void removeStudent(Student[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String remove = sc.next();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && remove.equals(arr[i].name)) {
				System.out.println("==================================");
				System.out.printf("%d번) %s 학생\nC언어 : %d점\nJAVA : %d점\n"
				+ "SPRING : %d점\n합계 : %d점\n평균 : %.2f점\n",
				arr[i].num, arr[i].name, arr[i].cLang, arr[i].java,
				arr[i].spring, arr[i].sum, arr[i].avg);
				System.out.println("==================================");
				System.out.println("정말 삭제하시겠습니까? (y/n) : ");
				String answer = sc.next();
				answer.toLowerCase();
				SYSTEM: switch(answer) {
				case "y":
					System.out.println(" ↑↑↑ 삭제 완료!! ↑↑↑ ");
					System.out.println();
					arr[i] = null;
					break;
				case "n":
					break SYSTEM;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}
			}
		}
			
	}
	

	
	
	public static void main(String[] args) {
		//선언
		Student[] arr = new Student[35];
		
		//구조
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			menuList();
			System.out.print("메뉴 선택 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0: break;
			case 1: addStudent(arr);			break;
			case 2: searchStudent(arr);			break;
			case 3: listNumStudent(arr);		break;
			case 4:	listAvgStudent(arr);		break;
			case 5: removeStudent(arr);			break;
			default:
				System.out.println("=== 메뉴를 잘못 입력하셨습니다!! ===");
				break;
			}
			
			
		} while (menu != 0);
		
		sc.close();
		
	}
	

}
