
class Calculator2 {
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void avg(int a, int b) {
		System.out.println((a + b) / 2);
	}
}

public class CalculatorApp2 {

	public static void main(String[] args) {
		Calculator2.sum(10, 20); // 30
		Calculator2.avg(30, 60); // 45
	}

}
