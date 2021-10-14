package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

/*
시나리오] 구구단을 출력하는 프로그램을 작성하시오.
단 while문을 이용하시오.
 */
public class E03While2 
{

	public static void main(String[] args) 
	{
		int dan =2; //단을 표현한 변수
		while(dan<=9) { //단에 대한 조건 (2~9단까지)
			int su =1; //수를 표현한 변수
			while(su<=9) { //단이 고정된 상태에서 1~9까지 증가
				//print ()를 통해 출력하면 정렬이 약간 틀어지게 된다.
				//System.out.print(dan+"*"+su+"="+(dan*su));
				//서식에 맞춰 출력할때는 printf문이 좀더 유리하다.
				System.out.printf("%-2d*%-2d=%2d", dan, su,(dan*su));
				System.out.printf(" ");// 스페이스(공백) 출력
				su++;
				
			}
		System.out.println(); //줄바꿈
		dan ++;
		}
		
		System.out.println("\n======================\\n");
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과 
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		int x=1; //행으로 4번 반복하는 while문
		while(x<=4) {
			int y=1; //열을 4번 반복하는 while문
			while(y<=4) {
				if(x==y) { //행과 열이 동일할때 1을 출력한다.
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();//행을 출력한 후 줄바꿈 처리
			x++;
		}
	}
}
