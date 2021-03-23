package quiz;

import java.util.ArrayList;
import java.util.HashSet;


public class Quiz {
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();		
		
		while(true) {
			int rand = (int)(Math.random() * 45) + 1;
			lotto.add(rand);
			if(lotto.size() == 7) break;
		}
		
		for(Integer su : lotto) {
			System.out.printf("%s ", su);
		}
		System.out.println();	
		
		ArrayList<Integer> arrLotto = new ArrayList<Integer>(lotto);
		
	}

}
