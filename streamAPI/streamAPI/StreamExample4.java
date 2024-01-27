package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* findAny() vs findFirst() */
public class StreamExample4 {

	public static void main(String[] args) {
		List<String> elements = Arrays.asList("a", "a1", "a2", "b", "b1", "b2", "c", "c1", "c2");
		
		// findFirst()
		Optional<String> firstElement = elements.stream().parallel()
				.filter(s -> s.startsWith("b"))
				.findFirst();
		System.out.println(firstElement.get());
		
		// findAny()
		Optional<String> anyElement = elements.stream().parallel()
				.filter(s -> s.startsWith("b"))
				.findAny();
		System.out.println(anyElement.get());

	}

}
