package constant_enum;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
	
	Fruit(String color) {
//		System.out.println("Call constructor " + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		Fruit type = Fruit.APPLE;
		
		switch(type) {
			case APPLE:
				System.out.println(57 + "kcal - " + type.getColor());
				break;
			case PEACH:
				System.out.println(34 + "kcal" + type.getColor());
				break;
			case BANANA:
				System.out.println(93 + "kcal" + type.getColor());
				break;
			default:
				System.out.println("NOTHING");
		}
		
		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}
	}

}
