package anonymous_inner_class;

// 익명 클래스 선언 위치

class Animal2 {
	public String bark() {
		return "동물이 짖는다.";
	}
}

class Creature {
	// 필드에 익명 자식 객체를 생성하여 사용
	
	Animal2 dog = new Animal2() {
		@Override
		public String bark() {
			return "멍멍";
		}
	};
	// 특정 클래스 내부에서 여러 메소드에 이용될 때 사용 고려
	public void method() {
		dog.bark();
	}
	
	public void method2() {
		dog.bark();
	}
}

class Creature2 {
	
	public void method() {
		Animal2 dog = new Animal2() {
			@Override
			public String bark() {
				return "멍멍멍";
			}
		};
		
		dog.bark();
	}
}

class Creature3 {
	
	public void method(Animal2 dog) {
		System.out.println(dog.bark());
	}
}

public class AnonymousInnerMain2 {
	public static void main(String[] args) {
		Creature3 monster = new Creature3();
		monster.method(new Animal2() {
			@Override
			public String bark() {
				return "멍멍멍멍";
			}
		});
	}
}
