package example3;

interface I {
	// 추상 메서드
	void abs();
	
	// 추상클래스를 상속 받은 클래스에서 구현할 추상 메서드
	void laterAbs();
	
	// 디폴트 메서드
	default void defaultMethod() {
		System.out.println("인터페이스의 디폴트 메서드입니다.");
	}
	
	// 정적 메서드
	static void staticMethod() {
		int i = 10;
		System.out.println("인터페이스의 정적 메서드입니다." + i);
	}
}

abstract class A implements I {

	@Override
	public void abs() {
		System.out.println("추상 클래스에서 인터페이스의 추상메서드 구현111");
	}
	
	@Override
	public void defaultMethod() {
		// 다중상속이 가능하기 때문에 맨 앞에 인터페이스 명을 붙여준다.
		I.super.defaultMethod(); 
		System.out.println("추상메서드에서 재정의한 디폴트 메서드입니다.");
	}
	
}

class B extends A {
	@Override
	public void laterAbs() {
		System.out.println("추상 클래스를 상속 받은 클래스에서 인터페이스의 추상메서드 구현222");
		
	}
	
	@Override
	public void defaultMethod() {
		// 상속 관계(다중상속X)이기 때문에 super만 써도 된다.
		super.defaultMethod();
		System.out.println("최종 구현 클래스에서 재정의한 디폴트 메서드입니다.");
	}
	
}

public class DefaultMethodTest {

	public static void main(String[] args) {
		I i = new B();
		A a = new B();
		B b = new B();
		i.defaultMethod();
		a.defaultMethod();
		b.defaultMethod();
		
		System.out.println("---------------");
		I.staticMethod();
		
	}

}
