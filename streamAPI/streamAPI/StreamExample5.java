package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamExample5 {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("이순신", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("===== 고객 명단(이름) 출력 =====");
		customerList.stream()
			.map(c -> c.getName())
			.forEach(e -> System.out.println(e));
		
		System.out.println("===== 총 여행 비용 =====");
		int totalPrice = customerList.stream()
			.mapToInt(c -> c.getPrice())
			.sum();
		System.out.println(totalPrice);
		
		System.out.println("===== 20세 이상 고객 출력(정렬) =====");
		customerList.stream()
			.filter(c -> c.getAge() >= 20)
			.map(c -> c.getName())
			.sorted()
			.forEach(e -> System.out.println(e));
		
	}

}
