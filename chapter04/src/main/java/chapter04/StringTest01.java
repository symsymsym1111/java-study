package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		
		// 운영체제에 따라 경로표기가 다르다. 표준에 맞춰서 경로는 /, 하드드라이브는 표시하지 않음
		// 유닉스 기반으로 표시하고, 윈도우에서 돌릴 경우에만 수정한다.
//		System.out.println("c:\temp"); // 역슬래시(\)+문자는 특수한 기능을 담당하기 때문에 제대로 출력되지 않는다.
		// \b는 비프음, \t는 탭, \n는 다음줄, \r는 줄의 가장 앞쪽으로 커서이동
		System.out.println("c:\\temp");
		
		// "hello"
		System.out.println("\"hello\"");
		
		// '
		char c= '\'';
		System.out.println(c);
		

	}

}
