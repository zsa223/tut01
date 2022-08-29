public class Main {
	public static void main(String[] args) {
/*
		for (int i = 0; i < 500; i++) {
			System.out.println("나는 A ! : " + i);
		}
		for (int i = 0; i < 500; i++) {
			System.out.println("나는 B ! : " + i);
		}
*/
		LoggerThread aFor = new LoggerThread("A입니다.");
		LoggerThread bFor = new LoggerThread("B입니다.");

		aFor.start();
		bFor.start();


	}
}