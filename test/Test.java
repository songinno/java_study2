class Parent {
	int a = 10;
	int b = 20;
	
	public void show() {
		System.out.println("<Parent> a: " + this.a + ", b: " + this.b);
	}
}

class Child extends Parent {
	int a, b;
	
	public Child(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println("오버라이딩 했다.");
	}
	
	public void showInChild() {
		this.show();
		System.out.println("<Child> a: " + this.a + ", b: " + this.b);
	}
}

public class Test {
	public static void main(String[] args) {
		Child c = new Child(30, 40);
		c.showInChild();
	}

}
