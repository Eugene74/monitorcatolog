package utils;

public class MyStop extends Thread{
    private Monitor s;

    public MyStop(Monitor s) {
        this.s = s;
    }

    public void run() {
        s.stop();
    }
}
