package ex02variable;
/*
 문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
실행결과]
평균점수(실수형)=91.66666666666667
평균점수(정수형)=91
 */
public class Qu_02_02 {

	public static void main(String[] args) {
		
		int kor=99, eng=80, math=96;
		int avg1 = (kor+eng+math)/3;
		double avg2 = (kor+eng+math)/3.0;
		
		System.out.println("평균점수(실수형)="+avg2);
		System.out.println("평균점수(정수형)="+avg1);
		
	}
}		
//		int kor=99, eng=80, math=96;
//		System.out.println("평균점수(실수형)="+(kor+eng+math)/3.0);
//		System.out.println("평균점수(정수형)="+(kor+eng+math)/3);
//				
//		
//	선생님이 하신 결과물
//		int k=99, e=80, m=96;
//		int avg1 = (k+e+m)/3;
//		double avg1 = (k+e+m)/3.0;
//		
//		System.out.println("평균점수(실수는)="avg2);
//		System.out.println("평균점수(정수는)="avg1);
//		
//
//	}
//
//}
