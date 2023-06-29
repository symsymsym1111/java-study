package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s1 = "aAbbBacccccC";
		
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("aAa")); // 해당 문자열 찾기
		System.out.println(s1.indexOf("aAa", 7)); // 해당 문자열을 7번째부터 찾기
		System.out.println(s1.substring(3)); // 3번째 문자부터 끝까지
		System.out.println(s1.substring(3, 7)); // 3번째부터 7번째 문자까지
		
		String s2 = "    ab       cd     ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim() + "------"); // trim - 문자열 앞뒤의 공백을 제거
		System.out.println("----" + s2.replaceAll(" ", "") + "------"); // 모든 공백 제거
		
		String[] tokens = s3.split(",");
		for(String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
