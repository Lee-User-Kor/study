package 이재호1;

public class Test3 {
	
	static int[] solution(int[] numbers) {
		int[] answer = {};
		
		//answer 배열길이
		int su = 1, plusNum = 2;
		for(int i = 2; i < numbers.length; i++) {
			answer = new int[su]; 
			su += plusNum;
			plusNum++;	
		}
		
       //answer 배열에 값 담기
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		for(int k = 0; k < answer.length; k++) {
        			answer[k] = numbers[i] + numbers[j];
        		}
        	}
        }
        
        
        
    }
	
	
	public static void main(String[] args) {
		
//		int rand = (int)(Math.random() * 98) + 2;
		int rand = 5;
		
		int[] numbers = new int[rand];
		
		for(int i = 0; i < numbers.length; i++) {
			int rand2 = (int)(Math.random() * 100);
			numbers[i] = rand2;
		}
		
		System.out.println(solution(numbers));
		
	}

}
