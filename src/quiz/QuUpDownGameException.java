package quiz;

import java.util.Random;
import java.util.Scanner;



public class QuUpDownGameException {
	public static void QuUpDownGameStart() {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		boolean forEnd = false;
		
		while(true) {
			int computer = random.nextInt(10000) % 100 + 1;//1~3사이의 난수
			System.out.println("컴퓨터:"+ computer);
			
			//성공실패
			for(int i = 1; i<=7; i++) {
				int userNum = 0;
				try {
					System.out.println("1~100까지 숫자입력:");
					userNum = scan.nextInt();
				}
				catch (Exception e) {
					scan.nextLine();
					System.out.println("[예외처리]문자는 입력하면안되요!");
				}
				if(userNum > computer) {
					System.out.println("Down");
				}
				else if(userNum < computer){
					System.out.println("Up");
				}
				else {
					System.out.println("일치합니다.");
					System.out.println(i+"번 안에 성공");
					System.out.println("---------------------");
					
					forEnd = true;
					
					break;
				}
			}
			if(forEnd == false) {
				System.out.println("실패");
			}
			while(true) {
				System.out.println();
				System.out.println();
				System.out.println();
				restart = scan.nextInt();
				if (restart ==0) {
					return;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		
	
	}
}
