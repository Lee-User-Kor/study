package quiz2;

import java.util.Scanner;

class Student {
	// 멤버 필드
	private String name;
	private int kor, eng, mat, sum;
	private double avg;
	
	// getter
	public String getName() {
		return name;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// 생성자
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor + eng + mat;
		this.avg = sum / 3.0;
	}
	
}//class Student end

class Handler {
	private static Scanner sc = new Scanner(System.in);
	private Student[] arr = new Student[10];
	
	// 입력
	static void inputInfo(Student[] arr) {
		System.out.println("=*=*= 학생 데이터 입력 =*=*=");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				System.out.print("학생 이름 : ");
				String name = sc.next();
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				if(kor < 0 || kor > 100) {
					System.out.println("점수 입력 에러!!");
					arr[i] = null;
					i--;
					continue;
				}
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				if(eng < 0 || eng > 100) {
					System.out.println("점수 입력 에러!!");
					arr[i] = null;
					i--;
					continue;
				}
				System.out.print("수학 점수 : ");
				int mat = sc.nextInt();
				if(mat < 0 || mat > 100) {
					System.out.println("점수 입력 에러!!");
					arr[i] = null;
					i--;
					continue;
				}
				arr[i] = new Student(name, kor, eng, mat);
				System.out.println("정보 추가 완료!");
				System.out.println();
				return;
			}
			if(i == arr.length - 1) {
				System.out.println("더이상 정보를 추가할 수 없습니다(10/10)");
				System.out.println();
				return;
			}
		}
		
	}
	static void outputInfo(Student[] arr) {
		System.out.println("\"=*=*= 학생 데이터 출력 =*=*=\"");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s 학생 ) 국어 : %d점, 영어 : %d점, 수학 : %d점, 합계 : %d점, 평균 : %.2f점\n",
						arr[i].getName(), arr[i].getKor(), arr[i].getEng(), arr[i].getMat(), arr[i].getSum(), arr[i].getAvg());
			}
		}
	}
	
	public void start() {
		int menu;
		
		do {
			System.out.println("****** 메뉴 ******");
			System.out.println("1) 학생 데이터 입력");
			System.out.println("2) 학생 데이터 출력");
			System.out.println("0) 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:	inputInfo(arr);								break;
			case 2:	outputInfo(arr);							break;
			case 0: System.out.println("프로그램이 종료되었습니다.");	break;
			default : System.out.println("메뉴 입력 오류!");		break;
			}
			
			
		}while(menu != 0);
		
	}
}//class Handler end


public class Quiz2 {
	public static void main(String[] args) {
		Handler h = new Handler();
		
		h.start();
	}
}
