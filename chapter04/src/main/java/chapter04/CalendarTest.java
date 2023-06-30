package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11); // 12 -> (month-1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2021, 9, 10); // 2021/10/10
		cal.add(Calendar.DATE, 100); // 100일 더하기
		printDate(cal);

	}

	private static void printDate(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0~11, +1
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일요일)~7(토요일). 0은 없다
		final String[] DAYS = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year + "-" + (month + 1) + "-" + date + " " + DAYS[day-1] + "요일 " + hour + ":" + minute + ":" + second);
		
		
	}

}
