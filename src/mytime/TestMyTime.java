package mytime;

public class TestMyTime {
    public void run() {
        MyTime times = new MyTime(12,20);
        System.out.println(times.toString());
    }

    public static void main(String[] args) {
        new TestMyTime().run();
    }
}
