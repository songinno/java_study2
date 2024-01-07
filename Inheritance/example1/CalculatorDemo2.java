package example1;

class Calculator2 {
	int left, right;
	
	public Calculator2(int a, int b) {
		this.left = a;
		this.right = b;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator2 extends Calculator2 {

	public SubstractionableCalculator2(int a, int b) {
		super(a, b);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
		System.out.println(super.left - super.right);
	}
	
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(30, 10);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
