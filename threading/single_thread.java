package threading;

class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class single_thread {
    public static void main(String[] args) {
        Runner one = new Runner();
        one.start(); 

        Runner two = new Runner();
        two.start();
    }
}
