
public class CalculatorApp {

	public static void main(String[] args) {
		Calculator cl1 = new Calculator();
		cl1.setOperands(10, 30);
		cl1.sum(); // 40
		cl1.avg(); // 20
		// 인스턴스를 통한 클래스 변수 접근
		System.out.println(cl1.PI); // 3.14
		
		Calculator cl2 = new Calculator();
		cl2.setOperands(15, 5);
		cl2.sum();
		cl2.avg();
		// 인스턴스를 통한 클래스 변수 접근
		System.out.println(cl2.PI); // 3.14
		
		// 클래스를 통한 클래스 변수 접근
		System.out.println(Calculator.PI);
		
		// 클래스 변수 base의 값을 10으로 지정
		Calculator.base = 10;
		
		Calculator cl3 = new Calculator();
		cl3.setOperands(10, 10);
		cl3.sum(); // 20 + 10 = 30
		cl3.avg(); // (20 + 10) / 2 = 15
		
	}

}
