package example3;

class Calculator {
	int[] operands;
	
	public void setOperands(int[] operands) {
		this.operands = operands;
	}
	
	public void sum() {
		int total = 0;
		for (int value : this.operands) {
			total += value;
		}
		
		System.out.println(total);
	}
	
	public void avg() {
		int total = 0;
		for (int value : this.operands) {
			total += value;
		}
		
		double result = total / this.operands.length;
		System.out.println(result);
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(new int[] {1,2,3,4,5,6,7,8,9,10});
		c.sum();
		c.avg();

	}

}
