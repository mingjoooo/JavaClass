package ex05method;

import java.util.Scanner;

/*
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름

실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
 */

//선생님이 하신 예제
public class QuCircleCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		double rad = scanner.nextDouble();
		circleArea(rad);
		//반환값이 있는 메서드이므로 print문 안에서 호출된다.
		System.out.println("원의둘레는:"+circleRound(rad));
		
	}
	//반환값이 없으므로 매개변수를 받은후 결과를 즉시 출력한다.
	static void circleArea(double radian) { //원의넓이 
		double result = 3.14 * radian * radian;
		System.out.println("원의넓이는:"+result);
	}
	static double circleRound(double radian) {//원의둘레 //반환값이 있는경우
		return (2 * 3.14 * radian); //한방에 결과값을 출력하는 방법, result에다가 담아서 출력하면 두줄
	}
	
}

//	static void circleArea(double w) {
//		System.out.println("원의 둘레(circleArea):"+(2*3.14*w));
//	}
//	static void circleRound(double w) {
//		System.out.println("원의 넓이(circleRound):"+(3.14*w*w));
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("반지름");
//		double w=scanner.nextDouble();
//		circleArea(5.5);
//		circleRound(5.5);
//
//	}
//}


