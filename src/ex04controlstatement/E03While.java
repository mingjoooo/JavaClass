package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

/*
 while문
 	: 반복의 횟수가 정해져있지 않을때 주로 사용하는
 	반복문이다. 반복의 횟수가 명확할때는 주로 for문을
 	사용한다.
 	형식]
 		반복을 위한 변수의 초기값 ;
 		while(조건) {
			
			실행문장;
			증감식; <= 반복문 탈출을 위한 증감
		}
		반복의 조건이 false일때 while문을 탈출한다.
		또한 반복문의 처음으로 돌아가면 무조건 조건을 검사한다.
 */
public class E03While {

	public static void main(String[] args) {
		
		/*
		시나리오] 1~10까지의 합을 구하는 프로그램 while문으로
			작성하시오.
		 */
		//작성 1 : 10번 반복하기 위한 while문을 만든다.
		
		int i = 1;
		while(i<=10) {
			System.out.println("변수i="+ i);
			i++;
		}
		
		//작성 2 : 수열문제 구현 (1부터 10까지 값을 다 더하고 싶을때)
		
		int sum = 0;
		int j = 1;
		while(j<=10) {
			//sum = sum + j; //일반적인 방식
			sum += j; //복합대입연산자 사용한 방식
			j++;
		}
		System.out.println("1~10까지의합sum="+ sum);
		
		/*
		시나리오] 1~100까지의 정수중 3의배수이거나 4의배수인
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
		//작성1 : 100번 반복에서 3 혹시 4 배수 출력하기
			
		int total = 0;
		int k = 1;
		while(k<=100) {
			if(k%3==0 || k%4==0) {
				total += k;
				System.out.println("k="+ k);
			}		
			k++;
		}
		System.out.println("3또는4의배수의합:"+ total);
	}
}
