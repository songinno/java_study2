
public class Motobike implements Vehicle {

	@Override
	public void run() {
		System.out.println("오토바이가 달립니다.");
	}
	
	public void run(int speed) {
		System.out.println(speed + " 의 속도로 달립니다.");
	}

}
