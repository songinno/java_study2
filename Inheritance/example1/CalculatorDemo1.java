package example1;

class Calculator {
	int left, right;
	
	public void setOperands (int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

// 상속1
class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

// 상속2
class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

// 상속 받은 클래스를 상속하기
class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
		System.out.println("-----------------");
		
		MultiplicationableCalculator c2 = new MultiplicationableCalculator();
		c2.setOperands(10, 20);
		c2.sum();
		c2.avg();
		c2.multiplication();
		
		System.out.println("-----------------");
		
		DivisionableCalculator c3 = new DivisionableCalculator();
		c3.setOperands(10, 20);
		c3.sum();
		c3.avg();
		c3.multiplication();
		c3.division();

	}

}
