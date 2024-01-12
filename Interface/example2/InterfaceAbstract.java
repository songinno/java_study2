package example2;

interface Animal2 {
	void cry();
	void bite();
	void sleep();
}

abstract class Dog2 implements Animal2 {
	// 추상 클래스 -> interface의 일부 메서드만 구현
	public void cry() {
		System.out.println("멍멍멍");
	}
	
	public void sleep() {
		System.out.println("강아지가 잠을 잔다.");
	}
}

class MyPet extends Dog2 {
	// interface의 나머지 메서드들은 추상 클래스를 상속 받은 클래스에서 구현
	@Override
	public void bite() {
		System.out.println("애완 강아지는 못깨물어요");
	}
}

public class InterfaceAbstract {

	public static void main(String[] args) {
		MyPet pd = new MyPet();
		pd.cry();
		pd.bite();
		pd.sleep();

	}

}
