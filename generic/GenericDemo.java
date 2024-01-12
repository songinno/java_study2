class MyArray<T> {
	T element;
	
	void setElement(T element) {
		this.element = element;
	}
	
	T getElement() {
		return this.element;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		MyArray<Integer> myArr = new MyArray<>();

	}

}
