package example2;

public class OverloadingDemo {
	void A() {
		System.out.println("void A()");
	}
	
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	
	void A(String arg1) {
		System.out.println("void A(Strig arg1)");
	}
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A(); // 오버라이딩
		od.A(1);
		od.A("aaaa");
		od.A("aaaa", "bbbbbb"); // 오버로딩
	}
	
}

class OverloadingDemo2 extends OverloadingDemo {
	// 오버로딩
	void A(String arg1, String arg2) {
		System.out.println("sub class: void A (String arg1, String arg2)");
	}
	// 오버라이딩
	void A() {
		System.out.println("sub class: void A()");
	}
}
