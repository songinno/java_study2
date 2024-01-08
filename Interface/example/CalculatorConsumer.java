package example;

public class CalculatorConsumer {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(10, 20, 30);
		int sumResult = c.sum();
		int avgResult = c.avg();
		System.out.println(sumResult);
		System.out.println(avgResult);
		
		System.out.println(Calculatable.a);
		

	}

}
