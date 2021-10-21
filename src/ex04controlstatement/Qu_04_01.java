package ex04controlstatement;

import java.io.IOException;

/*
하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
실행결과] 아래는 2번 실행하였습니다.
하나의 문자를 입력하세요:a
숫자가아닙니다
하나의 문자를 입력하세요:7
숫자입니다
 */
public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		System.out.println("하나의 문자를 입력하세요");
		int asciiCode = System.in.read();
		String result =(asciiCode>=47 && asciiCode<=58) ? "입니다"  : "가아닙니다.";
		System.out.println("숫자"+result);

//		선생님이 하신 결과물
		
//		System.out.print("하나의 문자를 입력하세요:");
//      요: 뒤에 커서가 오게하고 싶으면 println문 보다 print 문으로 사용하는것이 좋다.
//		int ascii = System.in.read();
		
		/*
		삼항연산자의 형식
			변수 = (조건식) ? "참일때" : "거짓일때";
		 */
		//아스키코드를 알고 있을때(47~58사이)
//		Stirng result = (ascii>=47 && ascii<=58) ? "숫자입니다" : "숫자가아닙니다.";
//		System.out.println((char)ascii+" 는" + result);
		
		//아스키코드를 모를때
//	    result = (ascii>='0' && ascii<='9') ? "숫자입니다" : "숫자가아닙니다.";
//		System.out.println((char)ascii+" 는" + result);
		
		
	}

}
