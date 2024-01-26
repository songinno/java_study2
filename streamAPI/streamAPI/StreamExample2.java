package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		/* 중개 연산(Intermediate Operation) */
		IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		
		// distinct() : 중복된 요소 제거
		stream1
			.distinct()
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		// filter() : 홀수만 골라내기
		stream2
			.filter(n -> n % 2 != 0)
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		// map() : 각 문자열의 길이로 이루어진 스트림으로 변환
		Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		stream3
			.map(s -> s.length())
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		// flatMap() : 문자열이 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환
		String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
		
		Stream<String> stream4 = Arrays.stream(arr);
		stream4
			.flatMap(s -> Stream.of(s.split(" +")))
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		// limit(), skip()
		IntStream stream5 = IntStream.range(0, 10);
		IntStream stream6 = IntStream.range(0, 10);
		IntStream stream7 = IntStream.range(0, 10);
		
		stream5.skip(4).forEach(e -> System.out.print(e));
		System.out.println();
		
		stream6.limit(5).forEach(e -> System.out.print(e));
		System.out.println();
		
		stream7.skip(3).limit(4)
			.forEach(e -> System.out.print(e));
		System.out.println();
		
		// sorted()
		Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		
		stream8.sorted()
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		stream9.sorted(Comparator.reverseOrder())
			.forEach(e -> System.out.println(e));
		System.out.println();
		
		// peek()
		IntStream stream10 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		
		stream10.peek(s -> System.out.println("원본 스트림: " + s))
			.skip(2)
			.peek(s -> System.out.println("skip(2) 실행 후: "+ s))
			.limit(5)
			.peek(s -> System.out.println("limit(5) 실행 후: "+ s))
			.sorted()
			.peek(s -> System.out.println("sorted()) 실행 후: "+ s))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		List<String> numbers = Arrays.asList("one", "two", "three", "four", "five");
		numbers.stream()
			.filter(s -> s.length() > 3)
			.peek(e -> System.out.println("filter value: " + e))
			.map(s -> s.toUpperCase())
			.peek(e -> System.out.println("map value: " + e))
			.collect(Collectors.toList());
	}
}
