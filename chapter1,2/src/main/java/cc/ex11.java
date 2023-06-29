package cc;

public class ex11 { // 논리연산자. 값이 true or false로 나온다.

	public static void main(String[] args) {
		// !(not)
		// ! true => false
		// ! false => ture
		System.out.println(!(3 != 2)); //false
		
		// && (and, 논리곱)
		// true && false => false
		// false && true => false
		// false && flase => false
		// true && true => true
		System.out.println(3 > 2 && 3 > 4); //false
		
		// ||(or, 논리합)
		// true || false => true
		// false || true => true
		// false || flase => false
		// true || true => true
		System.out.println(3 != 2 || -1 > 0); // true
		
		// ^(xor, 배타적 논리합)
		// true ^ false => true
		// false ^ true => true
		// false ^ flase => false
		// true ^ true => false
		System.out.println(3 != 2 ^ -1 > 0); // true
		
		
	}

}
