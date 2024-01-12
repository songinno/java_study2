package local_inner_class;

public class LocalInnerMain {
	
	// 외부 클래스 인스턴스 메서드
	public void exec(int i) {
		int outVal = 100; // 외부 클래스의 메서드 내, 지역 변수
		
		// 지역 내부 클래스
		class Cal {
			int inVal = 0; // 지역 내부 클래스의 인스턴스 변수
			
			public void plus() {
//				outVal += 100;
//				i += 100;
				inVal += 300;
			}
		}
		
		Cal cal = new Cal();
		cal.plus();
		
		System.out.println(i);
		System.out.println(outVal);
		System.out.println(cal.inVal);
	}
	
	public static void main(String[] args) {
		LocalInnerMain lim = new LocalInnerMain();
		lim.exec(10);
	}

}
