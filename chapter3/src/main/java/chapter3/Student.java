package chapter3;

public class Student extends Person {
	private String major;
	private int grade;
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {
		// 자식의 모든 생성자에서 
		// 부모의 특정 생성자를 명시적으로 호출하지 않으면
		// 암시적으로 	부모의 기본 생성자가 자식의 생성자 코드 앞에 호출된다.
		super(); // 부모의 기본생성자를 명시적으로 호출한 부분. 이 부분이 없어도 알아서 넣어준다.
		System.out.println("Student() called");
	}

}
