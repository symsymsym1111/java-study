package cc;

public class ex17 {


	public static void main(String[] args) {
		char grade = ' ';
		int score = 72;
		
		switch(score / 10) {
			case 10 : {
				grade = 'A';
				break;
				}
			case 9 : {
				grade = 'A';
				break;
			}
			case 8 : {
				grade = 'B';
				break;
			}
			case 7 : {
				grade = 'B';
				break;
			}
			case 6 : {
				grade = 'C';
				break;
			}
			default : {
				grade = 'F';
				break;
			}
		}
		
		
		
		
		
		System.out.println("학점은 " + grade + "입니다");
		
		

	}

	
	
}
