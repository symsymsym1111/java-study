package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
//		String s1 = "Hello " + " World " + " Java " + 17;
		//위와 아래 코드는 같은 결과를 나타낸다.
		String s1 = new StringBuffer("Hello ").append(" World ").append(" Java ").append(17).toString(); // 자기자신을 return하기 때문에 연달하서 쓸 수 있다.
		
		System.out.println(s1);
		
//		String s2 = "";
//		for(int i = 0; i < 100000; i++) {
//			s2 = s2 + i; // 연산이 매우 오래걸린다. 단순 연산이 아니라 새로운 메모리 할당할 경우에는 느려진다. 아래의 new StringBuffer가 문제
////			s2 = new StringBuffer(s2).append(i).toString(); // 바로 위 코드와 같다
//		}
		
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		String s2 = sb.toString();
		System.out.println(s2.length());
		// String 연산에 +연산을 쓰는 것은 좋지만 그 횟수가 매우 많다면 직접 StringBuffer 또는 StringBuilder를 쓰는게 좋다.
		
		
	}

}
