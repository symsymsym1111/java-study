package chapter3;

public class swaptest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a: " + a + ", b: " + b);
		
		swap(a,b);
		
		System.out.println("a: " + a + ", b: " + b);
		
	}	
	
	public static void swap(int m, int n) { // 바뀌지 않음
		int temp = m;
		m = n;
		n = temp;
	}
			

	

}
