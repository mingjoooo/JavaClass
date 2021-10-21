package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//게임에서 사용할 변수
		int com1, com2, com3;
		int user1, user2, user3;
		int randomCnt = 0;
		int gameCount = 0;
		int strikeCnt = 0, ballCnt=0;
		
		while(true) {
			
			while(true) {
				randomCnt++;
				
				com1 = random.nextInt(100) % 9 +1;
				com2 = random.nextInt(100) % 9 +1;
				com3 = random.nextInt(100) % 9 +1;
//				if(com1==com2 || com2==com3 || com3==com1) {
//					
//					continue;
//				}
//				else {
//					break;
//				}
				if(!(com1==com2 || com2==com3 || com3==com1)) {
					break;
				}
				
			}
			System.out.println(randomCnt+"회:");
		}
		

	}

}
