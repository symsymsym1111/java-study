package chapter3;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.3f;
	
	public int getDoscountPrice() {
		return (int)(price * discountRate); // 다른 패키지에 있는 부모 클래스의 protected 접근자가 걸린 price에 접근
		
	}
	
	
	

}
