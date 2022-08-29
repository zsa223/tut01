public class LoggerThread extends Thread{
    public String name;
    public LoggerThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(this.name);
        }
    }
}