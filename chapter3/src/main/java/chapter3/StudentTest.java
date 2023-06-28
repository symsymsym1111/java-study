package chapter3;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1;		 // 업캐스팅. 암시적.
		p1.setName("둘리");
		
		Student s2 = (Student)p1; // 다운캐스팅. 명시적.
		s2.setMajor("com");
//		((Student)p1).setMajor("com"); // 위 두줄의 코드를 한줄로 줄인것. s2를 만들지 않는 경우.
		
		
		

	}

}
