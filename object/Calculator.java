
public class Calculator {
	// 클래스 변수
	static double PI = 3.14;
	// 클래스 변수 추가
	static int base = 0;
	
	// 멤버 변수
	int a, b;
	
	public void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a + this.b + base);
	}
	
	public void avg() {
		System.out.println((this.a + this.b + base) / 2);
	}
}


