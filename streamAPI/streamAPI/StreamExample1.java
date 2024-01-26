package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		
		// 컬렉션 스트림 생성
		Stream<Integer> collectionStream = list.stream();
		collectionStream.forEach(i -> System.out.println(i));
		System.out.println();
		
		// 배열 스트림 생성
		String[] arr = new String[] {"넷", "둘", "셋", "하나"};
		
		Stream<String> arrStream = Arrays.stream(arr);
		arrStream.forEach(e -> System.out.println(e + " "));
		System.out.println();
		
		// 배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> arrStream2 = Arrays.stream(arr, 1, 3);
		arrStream2.forEach(e -> System.out.println(e));
		System.out.println();
		
		// 지정된 범위의 연속된 정수
		IntStream rangeStream = IntStream.range(1, 4); // 1 이상, 4 미만
		rangeStream.forEach(e -> System.out.println(e));
		System.out.println();
		
		IntStream rangeStream2 = IntStream.rangeClosed(1, 4); // 1 이상, 4 이하
		rangeStream2.forEach(e -> System.out.println(e));
		System.out.println();
		
		// 특정 타입의 난수들
		IntStream intStream = new Random().ints(4);
		intStream.forEach(e -> System.out.println(e));
		System.out.println();
		
		// 람다식
		Stream<Integer> lambdaStream = Stream.iterate(2, n -> n + 2).limit(5);
//		lambdaStream.limit(10);
		lambdaStream.forEach(e -> System.out.println(e));
		
		// 파일
		
		
	}

}
