package prob01;

public class PrinterTest {

	public static void main(String[] args) { // println을 오버라이드 하는 문제
		Printer printer = new Printer();

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
	}
}