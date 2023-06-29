package chapter04;


import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Rect> s = new HashSet<>();
		
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		
		s.add(r1);
		s.add(r2);
		
		for(Rect r : s) {	// 자료구조에서 가져가는게 아니라 자료구조 쪽에서 자료를 던져주는 것
			System.out.println(r);
		}
		

	}

}
