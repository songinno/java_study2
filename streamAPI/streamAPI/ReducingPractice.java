package streamAPI;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/* reduce 예제 */
// 배열에 여러 문자열이 있는 경우, Byte 수가 가장 긴 문자열 반환하기

class CompareString implements BinaryOperator<String> {
	
	// reduce() 메서드가 호출될 때, 호출되는 apply() 메서드
	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	}
	
}

public class ReducingPractice {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~!", "hello", "Good Moring", "반갑소!@#"};
		
		// 1. BinaryOperator를 구현한 클래스 사용
		String str1 = Arrays.stream(greetings)
						.reduce(new CompareString())
						.get();
		System.out.println(str1 + "111");
		
		// 2. 람다식으로 직접 구현
		String str2 = Arrays.stream(greetings)
				.reduce("", (s1, s2) -> {
					if (s1.getBytes().length >= s2.getBytes().length) return s1;
					else return s2;
				});
		System.out.println(str2 + "222");
		
		// 3. 익명 내부 클래스 이용
		BinaryOperator<String> bo = new BinaryOperator<String>() {
			
			@Override
			public String apply(String s1, String s2) {
				if (s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;
			}
		};
		
		String str3 = Arrays.stream(greetings)
				.reduce(bo)
				.get();
		System.out.println(str3 + "333");
	}

}
