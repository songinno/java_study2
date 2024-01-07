
public class CalculatorDemo {
	
	public static void avg(int a, int b) {
		System.out.println((a + b) / 2);
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(11, 44);
		sum(51, 33);
		
		avg(10, 20);
		avg(30, 50);
	}

}
