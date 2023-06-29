package cc;

public class ex22 {

	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		
		for(int i = 0; i < POWER; i++ ); {
			result *= 2;
		}
		
		System.out.println("2의" + POWER + "승은" + result + "입니다.");
		
		
	}
}
