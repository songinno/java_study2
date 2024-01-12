package practice;

// 추상 클래스
abstract class Calculator {
	int left, right;
	
	// 일반 메서드
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	
	// 추상 메서드
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

// 구현 클래스1
class CalculatorDecoPlus extends Calculator {

	@Override
	public void sum() {
		System.out.println("+ sum: " + this._sum());
	}

	@Override
	public void avg() {
		System.out.println("+ avg: " + this._sum() / 2);
	}
}

// 구현 클래스2
class CalculatorDecoMinus extends Calculator {

	@Override
	public void sum() {
		System.out.println("- sum: " + this._sum());
	}

	@Override
	public void avg() {
		System.out.println("- avg: " + this._sum() / 2);
	}
}

public class CalculatorDemo {
	
	public static void execute(Calculator cal) {
		System.out.println("실행 결과");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOperands(10, 20);
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOperands(10, 20);
		
		execute(c1);
		execute(c2);


	}

}
