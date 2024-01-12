package polymorphism;

class A {
	public String x() {
		return "A.x";
	}
}

class B extends A {
	@Override
	public String x() {
		return "B.x";
	}
	
	public String y() {
		return "B.y";
	}
}

class B2 extends A {
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		A obj2 = new B2();
		
		System.out.println(obj.x()); // B.x
		System.out.println(obj2.x()); // B2.x
		
	}

}
