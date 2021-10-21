package ex05method;


/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */

public class Test {
	 
	public static void main(String[] args) {
		
		System.out.println("섭씨23도=>화씨="+CelsiusToFahrenheit(23));
		System.out.println("화씨98도=>섭씨="+FahrenheitToCelsius(98.3));

	}
	static double CelsiusToFahrenheit(double cle) {
		return ( 1.8 * cle + 32);
		
	}
	static double FahrenheitToCelsius(double fah) {
		return (fah - 32) / 1.8;
	}
	
}
	

