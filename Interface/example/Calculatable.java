package example;

public interface Calculatable {
	
	public static final int a = 10;
	int b = 20;
	
	
	
	public abstract void setOperands(int first, int second, int third);
	int sum();
	int avg();
}
