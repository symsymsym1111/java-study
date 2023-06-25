package cc;

public class ex14 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		
		System.out.println("-----초기값------");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		
		if(n2 > n1) { 	// swap
			int a = n1;
			n1 = n2;
			n2 = a;
		} // 변수 a는 이 블록을 나갈 때 사라진다
		
		
		System.out.println("-----결과값------");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);		
		
		

	} // n1, n2는 이 블록을 빠져 나갈 때 사라진다

}
