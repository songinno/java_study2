package local_inner_class;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
//		num = 200;
		
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
//				num = 200; // 지역 변수는 상수로 바뀌어 값 변경X
//				i = 100; // 매개 변수도 마찬가지

				localNum += 10;
//				System.out.println(i);
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerMain3 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(5);
		runner.run();

	}

}
