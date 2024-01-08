
abstract class A {
	public abstract int b();
	
	// 구현부가 있는 메서드는 abstract 키워드를 가질 수 없다.
	/*
	 * public abstract int c() { // .... }
	 */
	
	// 추상 클래스 내에는 추상 메서드가 아닌 메서드도 존재할 수 있다.
	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	@Override
	public int b() {
		return 1;
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		B b = new B();
		int result = b.b();
		System.out.println(result);
		b.d();
	}

}
