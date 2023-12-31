package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성 비교(같은 객체인지 비교)
		System.out.println(p1 == p2); // p1, p2의 레퍼런스값을 비교(둘이 동일한 객체인지를 비교) -> 동일성 비교
		System.out.println(p2 == p3); 
		
		// equals : 두 객체의 동질성 비교(내용비교)
		// 부모 클래스(object)의 기본 구현은 동일성(==) 비교와 같다 -> 그래서 위쪽과 결과가 같게 나옴
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		
		
		
	}

}
