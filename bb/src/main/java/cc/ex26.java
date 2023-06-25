package cc;

public class ex26 {

	public static void main(String[] args) {
		
		// while문에서 continue 구문을 사용할 때에는 조건 변경을 신경써야 한다.
		//testWhile();
	}
	
	
	public static void testFor() {
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.println(i);
			
		}
	}
	
	public static void testWhile() {
			
		
	}
	

}
