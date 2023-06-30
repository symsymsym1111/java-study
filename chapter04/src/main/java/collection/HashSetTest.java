package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("둘리");
		String s2 = new String("둘리");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s2);
		
		System.out.println(s.size());
		System.out.println(s.contains(s1)); // contains->가지고 있냐?
		// s1이라는 다른 객체에 들어있는 "둘리"를 가지고 있는지 확인하는 코드. 내용기반 비교
		
		//삭제
		s.remove("마이콜"); // 내용기반이기 때문에 같은 내용을 찾아서 지운다.
		
		//순회
		for(String str : s) {
			System.out.println(str);
		}
		
		
		
		

	}

}
