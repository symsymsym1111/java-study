package collection;

import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
//		List<String> list = new Stack();	// 스택도 list를 통해 만들수 있다.
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push(	"java");
		stack.push(".");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		//비어있는 경우, pop()을 호풀하면 예외가 발생한다
//		stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek()); // 빼지 않고 가장 위에 무엇이 있는지 보는것. return값이 있지만 stack에서 빠지지는 않는다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		
	}

}
