public class LoggerThread extends Thread{
    public String name;
    public LoggerThread(String name) {
        this.name = name;
    }
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println(this.name + i);
        }
    }
}