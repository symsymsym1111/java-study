package cc;

public class ex29 {

	public static void main(String[] args) {
		int score01 = 90;
		int score02 = 60;
		int score03 = 100;
		int score04 = 80;
		int score05 = 94;
		int score06 = 68;
		int score07 = 72;
		int score08 = 84;
		int score09 = 88;
		int score10 = 60;
		
		
		int sum = score01 + score02 + score03 + score04 + score05 + score06 + score07 + score08 + score09 + score10;
		double average = sum / 10;
		System.out.println("평균 : " + average);
		
		
//		int[] scores = new int[10]; // 배열은 정적이기 때문에 메모리 크기를 미리 정해야 한다.
		int[] scores = new int[] {90, 60, 100, 80, 94, 68, 72, 84, 88, 60};  // 사이즈 지정을 직접 하지 않는 경우. 대신 저장할 데이터를 나열해서 그만큼의 메모리를 확보.
		int sum2 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		double average2 = sum2 / scores.length;
		System.out.println("평균 : " + average2);
		
		

	}

}
