package chapter3;

import mypackage.Goods2;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		
		// public은 접근 제한이 없다
		g.name = "camera";
		
		
		//protected는 같은 패키지에서만 접근가능
		//자식에서도 접근 가능하게 함
//		g.price = 1000;
		
		
		// 디폴트는 같은 패키지에서만 접근가능
//		g.countStock = 20;
		
		
		// private는 내부에서만 사용가능
//		g.countSold = 10;
		
		
		
	}

}
