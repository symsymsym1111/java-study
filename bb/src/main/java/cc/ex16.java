package cc;

public class ex16 { //switch문

	public static void main(String[] args) {
		char grade = 'P';
		
		
//		if(grade == 'A') {
//			System.out.println("참 잘했어요");
//		} else if(grade == 'B') {
//			System.out.println("잘했어요");
//		} else if(grade =='C') {
//			System.out.println("노력하세요");
//		} else if(grade == 'D') {
//			System.out.println("좀 더 노력하세요");
//		} else if(grade == 'F') {
//			System.out.println("다음 학기에 만나요");
//		} else {
//			System.out.println("잘못된 학점입니다");
//		}
//		
//		System.out.println("학점은 " + grade + "입니다");
		
		switch(grade) {
			case 'A' : {
				System.out.println("잠 잘했어요");
				break;
		}
			case 'B' : {
				System.out.println("잘했어요");
				break;
		}
			case 'C' : {
				System.out.println("노력하세요");
				break;
		}
			case 'D' : {
				System.out.println("좀 더 노력하세요");
				break;
		}
			case 'F' : {
				System.out.println("다음 학기에 만나요");
				break;
		}
			default : {
				System.out.println("잘못된 학점입니다");
				break;
		}
		}
		


		
	}
}
