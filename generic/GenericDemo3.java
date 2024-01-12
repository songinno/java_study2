class StudentInfo {
	public int grade;
	StudentInfo (int grade) {
		this.grade = grade;
	}
}

interface Info {
	public abstract int getRank();
}


class EmployeeInfo implements Info {
	public int rank;
	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
	@Override
	public int getRank() {
		return this.rank;
	}
}

class Person<T extends Info> {
	public T info;
	Person(T info) {
		this.info = info;
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<>(new EmployeeInfo(1));
		System.out.println(p1.info.getRank());
		
		Person<Info> p2 = new Person<>(new EmployeeInfo(2));
		System.out.println(p2.info.getRank());
		
//		Person<String> p3 = new Person<String>("부장님"); // 오류 발생
	}

}
