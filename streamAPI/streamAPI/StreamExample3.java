package streamAPI;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*  최종 연산  */
public class StreamExample3 {

	public static void main(String[] args) {
		
		/* 요소 출력 */
		// forEach()
		Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
		stream1.forEach(System.out::println);
		System.out.println();
		
		/* 요소 소모 */
		// reduce()
		Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
		Stream<String> stream3 = Stream.of("넷", "둘", "셋", "하나");
		
		// 파라미터(초깃값) 없는 경우
		Optional<String> result2 = stream2.reduce((s1, s2) -> s1 + "++" + s2); // 반환 타입 : Optional<T>
		result2.ifPresent(System.out::println);
		
		// 파라미터(초깃값) 있는 경우
		String result3 = stream3.reduce("시작", (s1, s2) -> s1 + "++" + s2); // 반환 타입 : T
		System.out.println(result3);
		System.out.println();
		
		/* 요소 검색 */
		// findFirst(), findAny()
		// 스트림의 요소 정렬 후, 첫 번째 위치한 요소 출력
		IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
		IntStream stream5 = IntStream.of(4,2,7,3,5,1,6);
		
		OptionalInt result4 = stream4.sorted().findFirst();
		System.out.println(result4.getAsInt());
		
		OptionalInt result5 = stream5.sorted().findAny();
		System.out.println(result5.getAsInt());
		System.out.println();
		
		/* 요소 검사 */
		// anyMatch(), allMatch(), noneMatch()
		IntStream stream6 = IntStream.of(30, 90, 70, 10);
		IntStream stream7 = IntStream.of(30, 90, 70, 10);
		IntStream stream8 = IntStream.of(30, 90, 70, 10);
		
		System.out.println(stream6.anyMatch(n -> n > 80)); // true
		System.out.println(stream7.allMatch(n -> n < 90)); // false
		System.out.println(stream8.noneMatch(n -> n > 100)); // true
		
		/* 요소의 연산 */
		IntStream stream9 = IntStream.of(30, 90, 70, 10);
		DoubleStream stream10 = DoubleStream.of(30.3, 90.9, 70.7, 10.1);
		
		System.out.println(stream9.sum());
		System.out.println(stream10.average().getAsDouble());
		System.out.println();
		
		/* 요소의 수집 */
		// Collectors.toList() : 스트림 -> List로 변환
		Stream<String> stream11 = Stream.of("넷", "둘", "하나", "셋");
		
		List<String> list = stream11.collect(Collectors.toList());
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// Collectors.partitioningBy()
		Stream<String> stream12 = Stream.of("HTML", "CSS", "JAVA", "PHP");
		Map<Boolean, List<String>> partition 
			= stream12.collect(Collectors
					.partitioningBy(s -> (s.length() % 2) == 0));
		// 글자 수가 홀수인 요소
		List<String> oddLengthList = partition.get(false);
		System.out.println(oddLengthList);
		// 글자 수가 짝수인 요소
		List<String> evenLengthList = partition.get(true);
		System.out.println(evenLengthList);
		
		
	}

}
