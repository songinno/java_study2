package example1;

class Parent2 {
	void display() {
		System.out.println("부모 클래스의 display() 메서드입니다.");
	}
}

class Child2 extends Parent2 {
	@Override
	void display() {
		System.out.println("자식 클래스의 display() 메서드입니다.");
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.display();
		
		Child2 c = new Child2();
		c.display();
		
		Parent2 pc = new Child2();
		pc.display();

	}

}
