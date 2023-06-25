package cc;

public class ex12 { // 비트 연산자

	public static void main(String[] args) {
		int a = 0x0f; // 16진수. 00001111
		int b = 0xf0; // 16진수. 11110000
		
		System.out.println(a & b); // 00000000  -> 0
		System.out.println(a | b); // 11111111  ->  255
		System.out.println(a ^ b);
		System.out.println(~a); // 11110000  ->  -16
		System.out.println(a >> 3); // 오른쪽으로 3비트 이동. 00001111 -> 00000001
		System.out.println(a << 3); // 왼쪽으로 3비트 이동. 00001111 -> 01111000
//	연산자 우선 순위가 햇갈릴 경우, 괄호가 우선 순위가 가장 높기 때문에 괄호를 이용.
//	햇갈릴 정도로 긴 연산을 쓰기 보다는 변수에 넣어서 연산을 하는 것이 낫다.
	}

}
