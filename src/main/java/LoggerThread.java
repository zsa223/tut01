public class LoggerThread extends Thread {
    public String name;

    LoggerThread(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(this.name +" "+ i);
        }
    }
}
