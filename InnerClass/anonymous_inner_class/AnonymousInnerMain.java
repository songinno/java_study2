package anonymous_inner_class;
// 외부클래스
class Animal {
	public int i = 100;
	
	public String bark() {
		return "동물이 웁니다";
	}
}

public class AnonymousInnerMain {

	public static void main(String[] args) {
		// 익명 내부 클래스 : 클래스 정의와 인스턴스화를 동시에(일회성으로 사용)
		Animal dog = new Animal() {
			// 외부 클래스의 인스턴스 변수 값 재할당
			{
				i = 1000;
			}
			
			// 외부 클래스의 메서드 오버라이딩
			@Override
			public String bark() {
//				System.out.println(i);
				System.out.println(super.i); // 1000 -> 외부 클래스의 변수 i의 값이 아님
				System.out.println(this.i); // 1000
				
				System.out.println(super.bark()); // 동물이 웁니다
				return "개가 짖습니다.";
			}
			
			
			// 새로 생성한 익명 클래스의 변수
			public int y = 2000;
			
			// 새로 생성한 익명 클래스의 메서드
			public String newBark() {
				return "월월월월!";
			}
		};
		
		String result = dog.bark();
		System.out.println(result);
		
		System.out.println(dog.i); // 1000
		
		// 익명 클래스에서 새로 만든 변수와 메서드 참조 불가
//		dog.newBark(); // 오류 발생
//		System.out.println(dog.y); // 오류 발생
	}

}
