public class LoggerRunnable extends Logger implements Runnable{
    public String name;
    public LoggerRunnable(String name) {
        this.name = name;
    }
    public void run() {
        for(int i = 0; i < 10000; i++) {
            this.log(this.name, i);
        }
    }
}