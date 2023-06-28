package chapter3;


public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countofGoods = 0;
	
	public Goods() {
//		Goods.countofGoods = Goods.countofGoods + 1; // 이 라인과 아래 라인은 모두 같은 것. 이 클래스 내부에서만 goods 부분을 생략가능.
		countofGoods = countofGoods + 1;
	}
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}





	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("재고:" + countStock);
		System.out.println("판매량:" + countSold);
		
	}





	public int calcDiscountPrice(double discountRate) {
		return (int)(price * discountRate);
	}
	
//	// get은 read하는 것
//	public String getName() {	// get + 대문자name으로 쓰는게 암묵적인 규칙.
//		return name;
//	}
//	
//	// set은 write하는 것
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	
	
	
	
}
