package instance_inner_class;

import java.util.ArrayList;
import java.util.Iterator;

class Outer {
	// 외부 클래스 객체의 크기를 불리기 위한 배열 변수
	private int[] data;
	
	// 인스턴스 내부 클래스
	static class Inner {
		
	}
	
	// 외부 클래스 생성자
	public Outer(int size) {
		this.data = new int[size]; // size를 파라미터로 받아 배열 필드의 크기를 늘림
	}
	
	// 내부 클래스 객체를 생성해서 반환하는 메서드
	Inner getInnerObject() {
		return new Inner();
	}
}


public class InstanceInnerMain2 {

	public static void main(String[] args) {
		// Inner 객체를 저장할 리스트
		ArrayList<Object> al = new ArrayList<>();
		
		// Inner 클래스 객체 생성을 위해 Outer 클래스를 인스턴스화 하고, 메서드를 호출해서 리스트에 담기
		// 이 때, Outer 객체는 메서드 호출용으로 일회용으로 사용되고 버려지기 때문에 GC 대상이 되어야 한다.
		for(int counter=0; counter < 50; counter++) {
			al.add(new Outer(100000000).getInnerObject());
			System.out.println(counter);
		}

	}

}
