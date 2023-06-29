package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // 동일성 비교
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + ":" + s2.hashCode());	// 내용기반
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
		
		System.out.println("=======================");
		
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s3 == s4); // 동일성 비교
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());	// 내용기반
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		// 이 방식으로 만들어낸 s3, s4는 같은 객체
		// new로 만들어낸 s1, s2는 다른 객체
		// s3를 만들 때 "hello"를 상수풀에서 찾고, 없으면 new를 해서 문자열을 만들어낸다.
		// s4를 만들 때는 이미 "hello"를 s3에서 만들었기 때문에 같은 부분을 재사용. s3, s4는 같아진다.
		// String 상수풀은 한번 셋팅되면 변하지 않음. 객체에 지정된 문자열이 외부에서 다른 이유로 변경되면 안되기 때문에.
		
	}

}
