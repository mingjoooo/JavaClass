package ex05method;
/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */

import java.util.Scanner;

public class E04MethodType03_2 {

//	public static void main(String[] args){
//		
//		Scanner scanner = new Scanner(System.in);
//			System.out.print("첫번째숫자 :");
//			int s = scanner.nextInt();
//			System.out.print("두번째숫자 :");
//			int e = scanner.nextInt();
//			inputGugudan(s, e);
//			
//	
//		static void inputGugudan(int sNum, int eNum) {
//			for(int i=sNum; i<=eNum; i++) {
//				for(int k=1; k<=9; k++) 
//				{
//					System.out.printf("%2d*%2d=%2d", i, k, (i*k));
//				}
//			}
	static void inputGugudan(int sNum, int eNum) {
		//기존 구구단 프로그램을 sNum에서 eNum단까지 출력하는 것으로 변경
		for(int dan=sNum ; dan<=eNum; dan++) {
			for(int su=1; su<=9; su++) {
				System.out.printf("%-2d*%-2d=%2d ",dan, su, (dan*su));
			}
			//단을 출력한 후 줄바꿈
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째숫자 :");
		int starNum = scanner.nextInt();
		System.out.print("두번째숫자 :");
		int endNum = scanner.nextInt();
		//입력받은 단을 매개변수로 메서드 호출
		inputGugudan(starNum,endNum);
	}
}

