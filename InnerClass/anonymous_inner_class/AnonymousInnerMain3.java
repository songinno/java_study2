package anonymous_inner_class;

class Animal3 {
	String name = "다롱이";
	
	public void bark() {
		System.out.println("짐승이 짖는다.");
	}
	
	public void run() {
		Animal3 dog = new Animal3() {
			{
				name = "멍멍이";
			}
			@Override
			public void bark() {
				System.out.println(super.name);
				System.out.println(this.name);
				super.bark(); // 짐승이 짖는다.
				System.out.println("멍멍멍멍");
			}
		};
		
		dog.bark();
	}
	
}

public class AnonymousInnerMain3 {

	public static void main(String[] args) {
		Animal3 dog = new Animal3();
		dog.run();
	}

}
