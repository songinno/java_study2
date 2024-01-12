
class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close 되었습니다.");
		
	}
	
}

public class ExceptionMain3 {

	public static void main(String[] args) {
		// try-catch-resources
		try (AutoCloseObj obj1 = new AutoCloseObj(); 
				AutoCloseObj obj2 = new AutoCloseObj()) {
			// ...
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 향상된 try-catch-resources
		
		// try () 안에 들어가는 리소스 참조 변수는 final 또는 effectively final 이어야 한다.
		// 아래와 같이 값이 변경되면 X
//		AutoCloseObj obj3 = null;
//		obj3 = new AutoCloseObj();
		AutoCloseObj obj3 = new AutoCloseObj();
		final AutoCloseObj obj4 = new AutoCloseObj();
		
		try (obj3; obj4) {
			//...
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
