package polymorphism;

interface I2 {
	String A();
}

interface I3 {
	String B();
}

class D implements I2, I3 {

	@Override
	public String A() {
		// TODO Auto-generated method stub
		return "A";
	}
	
	@Override
	public String B() {
		// TODO Auto-generated method stub
		return "B";
	}
	
	public String D() {
		return "D";
	}

}

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
//		objI2.B(); // 오류 발생 -> objI2의 데이터 타입을 I2로 한다 => 인스턴스를 외부에서 제어할 수 있는 조작장치를 인터페이스 I2의 멤버로 제한한다.
		
//		objI3.A(); // 오류 발생 -> obj3의 데이터 타입을 I3으로 한다 => 인스턴스를 외부에서 제어할 수 있는 조작장치를 인터페이스 I3의 멤버로 제한한다.
		objI3.B();
		
		obj.D();
//		objI2.D(); // 오류 발생
//		objI3.D(); // 오류 발생

	}

}
