package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a =10;
		int b = 10 - a;
		
		System.out.println(" some code1");
		
		try {
			System.out.println(" some code2");
			int result = (1 + 2+ 3) / b;
			System.out.println(" some code3");
			System.out.println(" some code4");
		} catch(ArithmeticException ex) {	// 예외 발생시 13번 라인에서 시스템이 정지. 이후 catch블록으로 들어온다.
			/* 예외처리 */
			// 1. 사용자에게 사과
			System.out.println("미안");
			// 2. 로깅 - 로그를 남겨야 개발자가 디버깅이 가능
			System.out.println("error: " + ex);
			// 3. 정상적인 종료 - 복구가 대부분의 경우 불가능하기 때문에 종료수순으로 간다.
			return; // main함수는 return을 만나면 끝남.
			
		} finally {
			System.out.println("자원정리"); // 정상적으로 실행이 되더라도 이 블록 안의 자원정리가 실행. 예외 발생에도 실행.
		}
		// 예외가 발생한 이후에 실행할 가능성이 있기 때문에 try~catch 블록 밖에 코드를 두는 것은 비추. 
//		System.out.println(" some code5");
	}

}
