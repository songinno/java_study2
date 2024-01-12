package anonymous_inner_class;

// 연산식을 추상화한 인터페이스
interface Operate {
	int operate(int a, int b);
}

// 계산 담당 클래스
class Calculator {
	// 계산할 수 있는 두 수를 저장하는 필드
	private final int a;
	private final int b;
	
	// 생성자
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 인터페이스 타입을 매개변수로 받는 메서드(다형성)
	public int calculate(Operate op) {
		return op.operate(this.a, this.b);
	}
	
}

public class AnonymousInnerMain4 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		
		Calculator calculator = new Calculator(num1, num2);
		
		int plusResult = calculator.calculate(new Operate() {
			
			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		});
		
		System.out.println(plusResult);
		
		int minusResult = calculator.calculate(new Operate() {
			
			@Override
			public int operate(int a, int b) {
				return a - b;
			}
		});
		
		System.out.println(minusResult);

	}

}
