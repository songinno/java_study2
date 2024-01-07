
public class VehicleApp {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.run();
		
		Vehicle bike = new Motobike();
		bike.run();
		
		// 상위 클래스 타입의 객체 생성
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new Motobike();
		
		for (Vehicle vehicle : vehicles) {
			vehicle.run();
		}

	}

}
