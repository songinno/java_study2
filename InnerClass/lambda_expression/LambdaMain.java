package lambda_expression;

//연산식을 추상화한 인터페이스
interface Operate {
	int operate(int a, int b);
}

//계산 담당 클래스
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

public class LambdaMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(20, 10);
		// 람다식으로 Operator 인터페이스형 익명 객체 만들기
		Operate operate = (a, b) -> {return a + b;};
		Operate operate2 = (a, b) -> a + b;
		
		// 만든 익명 객체를 인자로 넣기
		int result1 = calculator.calculate(operate);
		int result2 = calculator.calculate(operate2);
		
		System.out.println(result1);
		System.out.println(result2);
		
		// 인자에 람다식으로 익명 클래스 구현하기
		int result3 = calculator.calculate((a, b) -> {
			return a + b;
		});
		System.out.println(result3);
		
		// 인자에 람다식 축소
		int result4 = calculator.calculate((a, b) -> a + b);
		System.out.println(result4);

	}

}
