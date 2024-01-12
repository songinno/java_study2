package instance_inner_class;

class PocketBall {
	// 인스턴스 변수
	int size = 100;
	int price = 5000;
	
	// 인스턴스 내부 클래스
	class PocketMonster {
		String name = "피카츄";
		int level = 10;
		
//		static int cost = 100;
		
		static final int cost2 = 1000;
		
		public void getPocketMemer() {
			// 별다른 조치 없이 외부 클래스의 멤버 접근 가능
			System.out.println(size);
			System.out.println(price);
			
			// 내부 클래스 멤버
			System.out.println(name);
			System.out.println(level);
//			System.out.println(cost);
			System.out.println(cost2);
		}
	}
	
	
}

public class InstanceInnerMain {

	public static void main(String[] args) {
		// 1. 외부 클래스 인스턴스화
		PocketBall ball = new PocketBall(); 
		// 2. 외부클래스.내부클래스 형식으로 내부클래스 인스턴스 생성 가능
		PocketBall.PocketMonster pocketmon = ball.new PocketMonster();
		pocketmon.getPocketMemer();
		
		// *** 위의 단계를 한줄로 표현
		PocketBall.PocketMonster pocketmon2 = new PocketBall().new PocketMonster();
		pocketmon2.getPocketMemer();
		
	}

}
