package ex08class;

class Triangle2{
	
	int Bottom;
	int Height;
	
	void init(int Bottom, int Height) {
		this.Bottom = Bottom;
		this.Height = Height;
	}
	void setBottom(int Bottom) {
		this.Bottom = Bottom;
	}
	void setHeight(int Height) {
		this.Height = Height;
	}
	double getArea() {
		return (Bottom * Height * 0.5);
	}
}
public class Test1 {

	public static void main(String[] args) {
	
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}
}
