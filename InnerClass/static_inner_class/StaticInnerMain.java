package static_inner_class;

class PocketBall {
	int size = 100;
	static int price = 5000;
	
	// static 내부 클래스
	static class PocketMonster {
		static String name = "이상해씨";
		int level = 10;
		
		public static void getPocketMember() {
			// 외부 클래스 인스턴스 변수에 접근 불가능
//			System.out.println(size);
			
			// 외부 클래스의 정적 변수에는 접근 가능
			System.out.println(price);
			
			// 내부 클래스에서도 정적 멤버에만 접근 가능
			System.out.println(name);
//			System.out.println(level);
		}
		
		public void getPocketMember2() {
			// 외부 클래스의 인스턴스 변수 접근 불가
//			System.out.println(size);
			// 외부 클래스의 정적 변수 접근 가능
			System.out.println(price);
			// 내부 클래스의 정적 변수 접근 가능
			System.out.println(name);
			// 내부 클래스의 인스턴스 변수에 접근 가능 -> 인스턴스 내부 클래스와의 차이점
			System.out.println(level);
		}
	}
	
	
}

public class StaticInnerMain {

	public static void main(String[] args) {
		PocketBall.PocketMonster pocketmon = new PocketBall.PocketMonster();
		pocketmon.getPocketMember();
		pocketmon.getPocketMember2();
	}

}
