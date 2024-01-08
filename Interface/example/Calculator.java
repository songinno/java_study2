package example;

public class Calculator implements Calculatable {
	
	int first, second, third;

	@Override
	public void setOperands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public int sum() {
		return this.first + this.second + this.third;
	}

	@Override
	public int avg() {
		return this.sum() / 3;
	}

}
