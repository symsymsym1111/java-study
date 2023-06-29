package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// deprecated
		Integer i = new Integer(10); 
		
		// Auto Boxing
		Integer i2 = 10;
		Long l = 10L;
		
		System.out.println(i2.equals(10));
		
		// Auto unboxing
		System.out.println(i2 == 10);
//		System.out.println(i2.intValue() == 10); // 위와 같은 의미
		int m = i2 + 10;
//		int m = i2.intValue() + 10; // 위와 같은 의미
		
		
		
		
		
		

	}

}
