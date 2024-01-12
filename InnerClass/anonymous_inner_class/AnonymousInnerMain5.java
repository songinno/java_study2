package anonymous_inner_class;

import java.util.Arrays;
import java.util.Comparator;

// Comparator 인터페이스로 익명 구현 객체를 만들어서
// Array.sort() 메서드의 인자로 보내
// 객체 배열 users를 나이순으로 정렬하는 예제

public class AnonymousInnerMain5 {

	public static void main(String[] args) {
		
		class User {
			String name;
			int age;
			
			User(String name, int age) {
				this.name = name;
				this.age = age; 
			}
		}
		
		User[] users = {
			new User("홍길동", 32),
			new User("김춘추", 64),
			new User("임꺽정", 48),
			new User("박혁거세", 14)
		};
		
		// Arrays.sort(배열, Comparator 익명 구현 객체);
		Arrays.sort(users, new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				return Integer.compare(u1.age, u2.age);
			}
			
		});
		
		// 출력
		for (User user : users) {
			System.out.println(user.name + "은 " + user.age + "살 입니다.");
		}

	}

}
