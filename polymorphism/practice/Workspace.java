package practice;

interface Father{}

interface Mother{}

interface Programmer {
	void coding();
}

interface Believer{
}

class Steve implements Father, Programmer, Believer {

	@Override
	public void coding() {
		System.out.println("fast");
		
	}
}

class Rachel implements Mother, Programmer {

	@Override
	public void coding() {
		System.out.println("elegance");
	}
	
}

public class Workspace {

	public static void main(String[] args) {
		Programmer employee1 = new Steve();
		Programmer employee2 = new Rachel();
		employee1.coding();
		employee2.coding();

	}

}
