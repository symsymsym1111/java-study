package mypackage;

public class Goods2 {
	public String name;		// 모든 접근이 가능
	protected int price;	// 같은 패키지 + 자식 클래스 접근가능
	int countStock;			// 디폴트. 같은 패키지만
	private int countSold;	// 클래서 내부 전용
	
	
	public void m() {
		countSold = 0;
	}
	
	

}
