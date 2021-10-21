package ex05method;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */


//선생님이 하신 예제

public class QuTemperature {
	
	//섭씨 -> 화씨
	static double celsiusToFahrenheit(double cel) {
		double fah = 1.8 * cel + 32;
		return fah;
	}
	
	//화씨 -> 섭씨
	static double fahrenheitToCelsius(double fah) {
		return (fah - 32) / 1.8;
	}
	
	public static void main(String[] args) {
		
		System.out.println("섭씨23도=>화씨="+celsiusToFahrenheit(23));
		System.out.println("화씨98도=>섭씨="+fahrenheitToCelsius(98.3));
		
	}
	
}

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("섭씨를 입력하시오 :");
//		double c = scanner.nextInt();
//		System.out.println("화씨를 입력하시오 :");
//		double f = scanner.nextInt();
//		temperature(c,f);
//	
//		
//	}
//	public static void temperature(double c, double f) {
//		System.out.println("화씨 = "+(1.8*c+32));
//		System.out.println("섭씨 ="+(f-32)/1.8);
//	}
//}
