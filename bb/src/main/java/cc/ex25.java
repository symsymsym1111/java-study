package cc;

public class ex25 {
	
	public static void main(String[] args) {
	// 1~20 홀수만 출력
//		
//		for(int i = 1; i <= 20; i += 2) {
//			System.out.println(i);
//		}
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
