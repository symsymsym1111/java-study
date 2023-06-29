package chapter04;

import java.util.Objects;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int hashCode() {		// 해시코드 오버라이드
		return Objects.hash(height, width);	// 자료구조 추가 조건을 바꿀때 아래쪽과 함께 바꿔야할 지점
	}

	@Override
	public boolean equals(Object obj) {		// equals 오버라이드
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		return height == other.height && width == other.width;	// 자료구조 추가 조건을 바꾸고 싶다면 이 부분을 바꿔야 한다. 넓이가 같으면 같은 것으로 취급한다거나.
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

}
