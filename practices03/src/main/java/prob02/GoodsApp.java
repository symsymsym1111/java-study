package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		
		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] info = line.split(" ");
			
			String name = info[0];
			int price = Integer.parseInt(info[1]);
			int count = Integer.parseInt(info[2]);
			
			
			
			
			
			
			}
			
			
		
		
		
		
		// 상품 출
		
		
		
		
		
//		System.out.println("콜라(가격 : " + price + "원)이 " + count + "개 입고 되었습니다");
//		System.out.println("사이다(가격 : " + price + "원)이 " + count + "개 입고 되었습니다");
//		System.out.println("맥주(가격 : " + price + "원)이 " + count + "개 입고 되었습니다");
		
		
		
		// 자원정리
		scanner.close();
	}
}
