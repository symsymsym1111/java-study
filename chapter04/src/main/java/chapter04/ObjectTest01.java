package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
//		Class klass = p.getClass();
		System.out.println(p.getClass()); // reflection
		
		
		System.out.println(p.hashCode()); 	// address기반의 해싱값 // hashCode()는 equals와 함께 쓰인다.
											// reference x
											// address x
		System.out.println(p.toString());	// getClass() + "@" + hashcode() 한 결과. 이때 hashcode는 16진수로 표현된다.
		System.out.println(p); // 이것과 바로 위의 것은 동일한 결과를 부른다.
		
		

	}

}
