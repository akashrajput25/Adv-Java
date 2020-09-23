package thread;

import java.util.Scanner;

class Processor extends Thread {
    private volatile boolean running = true;
    public void run()
    {
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        running = false;
    }
}

public class thread_sync {
    public static void main(String[] args) {
        Processor p1 = new Processor();
        p1.start();
        System.out.println("press return key to stop");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        p1.shutdown();
    }
}
