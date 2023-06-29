package cc;

public class ex28 {

	public static void main(String[] args) {
		
		
		// "\n" 은 개행문자. println은 자동으로 개행됨. 개행하지 말아야하는 부분에서는 print 사용.
//		System.out.print("hello world" + "\n");
//		
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j);
				System.out.print("\t");
			}
			
			System.out.print("\n");
			
		}
	}

}
