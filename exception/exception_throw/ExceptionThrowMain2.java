package exception_throw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 예외 미루기 전
/*class B {
	void run() {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("./out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(input);
	}
}

class C {
	void run() {
		B b = new B();
		b.run();
	}
}*/

// 예외 미룬 후
class B {
	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
		
	}
}

class C {
	void run() {
		B b = new B();
		try {
			b.run();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionThrowMain2 {

	public static void main(String[] args) {
		C c = new C();
		c.run();
	}
}
