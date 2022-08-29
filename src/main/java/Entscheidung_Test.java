public class Entscheidung_Test extends Thread{
    public String entscheidung;

    public Entscheidung_Test(String entscheidung){
        this.entscheidung = entscheidung;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
                System.out.println(this.entscheidung);
            }
        }
    }
