package example2;

interface Animal {
	void cry();
}

interface Pet {
	void play();
}

interface WildAnimal {
	void cry();
}

class Cat implements Animal, Pet {

	@Override
	public void play() {
		System.out.println("쥐를 잡자 쥐를 잡자 찍찍찍");
		
	}

	@Override
	public void cry() {
		System.out.println("야옹야옹");
		
	}
	
}

class Dog implements Animal, WildAnimal {

	@Override
	public void cry() {
		System.out.println("Animal일수도 WildAnimal일수도 있는 개가 월월");
		
	}
	
}



public class MultipleImplements {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.cry();

	}

}
