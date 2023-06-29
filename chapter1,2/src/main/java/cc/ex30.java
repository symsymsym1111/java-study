package cc;

public class ex30 {

	public static void main(String[] args) {  // String[] args
		// 선언 시 크기를 지정할 수 없다.
		//int[10] a;
		
		//비추
		int a1[] = new int[10];
		System.out.println(a1.length);
		
		// 강추
		int[] a2 = new int[10];
		System.out.println(a2.length);
		
		//초기화1
		int [] a3 = {0, 1, 2, 3, 4, 5}; // int [] a3 = new int[] {0, 1, 2, 3, 4, 5}; 와 동일.
		System.out.println(a3.length);  
		
		//초기화2
		int[] a4 = new int[5];
		a4[0] = 0;
		a4[1] = 1;
		a4[2] = 2;
		a4[3] = 3;
		a4[4] = 4;
		
		
		// 초기화3
		int [] a5 = new int[] {0, 1, 2, 3, 4, 5};
		System.out.println(a5.length); 
		
		
		// 사용1 : 랜덤 접근
		// 객체를 사용한다는 의미 : 객체에 접근하여 읽거나 쓰고 메소드를 불러오는 것이 있다
		System.out.println(a5[3]);
		
		//사용2 : 순회(literation)
		for(int i = 0; i < a5.length; i++) { // 이때 i <= a5.length로 해서는 안됨. out of bound 
			System.out.println(a5[i]);
		}
	}

}
