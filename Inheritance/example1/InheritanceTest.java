package example1;

class Parent {
	private int i1;
	public int i2;
	protected int i3;
	int i4;
	
	private int sum1(int a, int b) {
		return a + b;
	}
	
	public int sum2(int a, int b) {
		return a + b;
	}
	
	protected int sum3(int a, int b) {
		return a + b;
	}
	
	int sum4(int a, int b) {
		return a + b;
	}
}

class Child extends Parent {
	
}



public class InheritanceTest {

	public static void main(String[] args) {
		Child c = new Child();

	}

}
