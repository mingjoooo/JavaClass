package quiz;

import java.util.Random;
import java.util.Scanner;

/*
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */
public class quiz  {
	

	public static void RockPaperScissors(String[] args) {
		
		int user;
		int computer;
		int count =0;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String[] rockPaperScissors = {"가위","바위","보"};
		
		while(true) {
			System.out.println("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			
			user = scanner.nextInt()	;
			computer = random.nextInt(4);
			
			if(user>3 || user <1) {
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				continue;
			}
			if(user==computer) {
				System.out.println("사용자 : 보, 컴퓨터 : 보\r\n"+ "비겼습니다.\r\n"+ "");
				count++;
			}
			else if(user)
		}
		
	}
}
		
		


