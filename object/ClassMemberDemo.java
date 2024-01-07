
class C1 {
	// 클래스 변수(Static Field)
	static int static_variable = 1;
	// 인스턴스 변수(Non-Static Field)
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
	}
	
	static void static_instance() {
//		클래스 메서드에서 인스턴스 변수 접근X
//		System.out.println(instance_variable); // 오류 발생
	}
	
	void instacne_static() {
		// 인스턴스 메서드에서는 클래스 변수에 접근 O
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		C1 c = new C1();
		
		// 인스턴스를 이용해서 클래스 메서드(정적 메서드)에 접근
		c.static_static();
		c.static_instance();
		
		// 인스턴스를 이용해서 인스턴스 메서드 접근
		c.instacne_static();
		c.instance_instance();
		
		// 클래스를 이용해서 클래스 메서드에 접근
		C1.static_static();
		C1.static_instance();
		
		// 클래스를 이용해서 인스턴스 메서드 접근 X
//		C1.instacne_static();
//		C1.instance_instance();
		
		

	}

}
