public class Main {
	public static void main(String[] args) {

		/*
		for(int i = 0; i < 10000; i++) {
			System.out.println("A:" + i);
		}
		for(int i = 0; i < 10000; i++) {
			System.out.println("B:" + i);
		}
		*/

		/*
		LoggerThread aFor = new LoggerThread("A");
		LoggerThread bFor = new LoggerThread("B");

		aFor.start();
		bFor.start();
		*/

		Thread aFor = new Thread(new LoggerRunnable("A"));
		Thread bFor = new Thread(new LoggerRunnable("B"));

		aFor.start();
		bFor.start();

	}
}