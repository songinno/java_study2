package polymorphism;


// overloading과 다형성

class O {
	public void a(int param) {
		System.out.println("숫자 출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자 출력");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(100);
		o.a("hihi");

	}

}
