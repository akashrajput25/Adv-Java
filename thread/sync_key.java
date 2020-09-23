package thread;

public class sync_key {
    private int count = 0;

    public synchronized void inc(){
        count++;
    }
    public static void main(String[] args) {
        sync_key key = new sync_key();
        key.dowork();
    }

    public void dowork() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inc();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inc();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("Count : "+count);
    }
}
