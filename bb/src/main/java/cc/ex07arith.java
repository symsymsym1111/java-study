package cc;

public class ex07arith {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		//이항연산자
		System.out.println(a+b); //10
		System.out.println(a-b); //-4
		System.out.println(a*b); //21
		System.out.println(a/b); //0
		System.out.println(a%b); //3
		
		//단항연산자
		System.out.println(-a);  //-3
		
		++a;
		// a += 1
		// a = a + 1
		System.out.println(a); //4
		
		a++;
		// a += 1
		// a = a + 1
		System.out.println(a); //5
		
		System.out.println(a++); //5
//		System.out.println(a);
//		a = a + 1;		
		
		System.out.println(a); //6
		
		System.out.println(++a); // 7
//		a = a + 1;
//		System.out.println(a);
		
		
		System.out.println(--a); //6
		System.out.println(a); //6
		System.out.println(a--); //6
		System.out.println(a); //5

	}

}
