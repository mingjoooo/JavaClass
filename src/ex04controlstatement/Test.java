package ex04controlstatement;

public class Test {

	public static void main(String[] args) {
//		int sum = 0;
//	for(int i=1 ; i<=100 ; i++) {
//		if(i%3==0 || i%7==0) {
//				if(i%(3*7)!=0) {
//					sum += i;
//					if(i!=99)
//						System.out.print(i+"+");
//					else
//						System.out.print(i);//마지막에 + 없애는 if문 					//2번째 방법
//					//System.out.print(i);
//					//if(i!=99) System.out.print("+");
//				}
//			}
//		}
//		System.out.println("="+sum);//결과출력
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%7==0) {
				if(i%(3*7)!=0) {
					sum += i;
					if(i!=99)
					System.out.print(i+"+");
					else
						System.out.print(i);
				}
			}
		}
		System.out.println("="+sum);
		
	}

}


