package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
//		System.out.println(s1.toUpperCase()); // 소문자->대문자 변환
		
		s2 = s1.toUpperCase();
//		System.out.println(s2); // s2가 바뀌었다.
		// toUppercase 안에서 새로운 String 객체 "ABC"를 만들어서 return하는 방식
		
		
		String s4 = s2.concat("??"); // concat은 기존 ABC에 ??를 붙이고 return. 이때 return은 s4로 들어감
		String s5 = "!".concat(s2).concat("@"); // 새로운 String 객체에 !를 복사해서 저장. ABC를 붙이고 return. 바로 다음 concat이 불려와 새로운 객체에 @ABC를 저장하고 @를 붙여서 return
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6 = null;
		System.out.println(equalsHello(s6));
	}	
	
	
		public static boolean equalsHello(String s) {
//			return s.equals("Hello");
			return "Hello".equals(s);
		}
		
		
	

}
