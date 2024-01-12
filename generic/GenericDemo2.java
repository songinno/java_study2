import java.util.ArrayList;
import java.util.Iterator;

class LandAnimal {
	public void crying() {
		System.out.println("육지동물");
	}
}

class Cat extends LandAnimal {
	@Override
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}

class Dog extends LandAnimal {
	@Override
	public void crying() {
		System.out.println("멍멍멍멍");
	}
}

class Sparrow {
	public void crying() {
		System.out.println("짹짹짹짹");
	}
}


class AnimalList<T> {
	ArrayList<T> al = new ArrayList<T>();
	
	void add(T animal) {
		al.add(animal);
	}
	
	T get(int index) {
		return al.get(index);
	}
	
	boolean remove(T animal) {
		return al.remove(animal);
	}
	
	int size() {
		return al.size();
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		AnimalList<LandAnimal> landAnimalList = new AnimalList<>();
		landAnimalList.add(new LandAnimal());
		landAnimalList.add(new Cat());
		landAnimalList.add(new Dog());
//		landAnimalList.add(new Sparrow()); // 오류 발생
		
		for (int i=0; i < landAnimalList.size(); i++) {
			landAnimalList.get(i).crying();
		}
	}

}
