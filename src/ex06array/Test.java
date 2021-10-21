package ex06array;

import ex01start.E02SystemOutPrintln;

/*
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */
public class Test {

	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==1) counter[0]++;
			if(answer[i]==2) counter[1]++;
			if(answer[i]==3) counter[2]++;
			if(answer[i]==4) counter[3]++;
		} 
		
		for(int i=0; i<counter.length; i++) {
			System.out.printf("counter[%d] => %d%n",i, counter[i]);
		}
	
	}
	
}
