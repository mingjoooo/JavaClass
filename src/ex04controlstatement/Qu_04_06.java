package ex04controlstatement;
/*
문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java
실행결과]
*
* *
* * *
* * * *
* * * * *
 */
public class Qu_04_06 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}	
//선생님이 하신 예제
		
//		int i=1;
//		while(i<=5){
//			int j=1;
//			while(j<=i) {
//				
//				System.out.print("* ");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		}
//		
//	}
//}
