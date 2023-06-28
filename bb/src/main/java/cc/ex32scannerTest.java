package cc;

import java.util.Scanner;

public class ex32scannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("상품 정보를 입력하세요");
		
		System.out.print("이름 : ");
		String name = scanner.next(); // 실행 시 이곳에서 일시정지. 이름을 입력하면 넘어감
		
		System.out.print("가격 : ");
		int price = scanner.nextInt();
		
		System.out.print("재고량 : ");
		int countstock = scanner.nextInt();
		
		
		
		System.out.println(name + ":" + price + ":" + countstock);
		
		scanner.close();
	}

}
