package cc;

public class ex24 {

	public static void main(String[] args) {
	final int LOOP_COUNT = 10;
		
		int i = 0;
		// 조건을 따지지 않고 한 번은 실행. 이후 조건을 따져서 반복, 탈출
		do {
			System.out.println(i + ". hello"); // 루프
			i = i + 1;
		} while(i < LOOP_COUNT);  // 탈출 조건

	}

}
