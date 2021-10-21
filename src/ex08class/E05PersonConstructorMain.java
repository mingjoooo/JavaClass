package ex08class;

public class E05PersonConstructorMain {
	
	public static void main(String[] args) {
		
		PersonConstructor Person1 = new PersonConstructor();
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		Person1.showPersonInfo();
		
		System.out.println("[멤버변수 초기화용 메소드 호출후]");
		Person1.initialize("홍길동", 20, "논현동");
		Person1.showPersonInfo();
		
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		PersonConstructor Person2 = new PersonConstructor("박길동");
		Person2.showPersonInfo();
		
		System.out.println("[이름과 나이만 전달한 값으로"+ "초기화하기]");
		PersonConstructor Person3 = new PersonConstructor("최길동",40);
		Person3.showPersonInfo();
		
		
		System.out.println("[모든 매개변수를 전달한 값으로 "+ "초기화하기]");
		PersonConstructor Person4 = new PersonConstructor("박길동",50,"가산동");
		Person4.showPersonInfo();
	}
}

	
