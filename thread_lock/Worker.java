package thread_lock;

import java.util.*;

public class Worker {

    private static Random random = new Random();
    private static List<Integer> list1 = new ArrayList<Integer>();
    private static List<Integer> list2 = new ArrayList<Integer>();
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public synchronized static void stageone() {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
        
    }

    public synchronized static void stagetwo() {
        synchronized (lock2){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
        }
    }

    public static void process() {
        for (int i = 0; i < 1000; i++) {
            stageone();
            stagetwo();
        }
    }

    public static void main(String args[]) {
        System.out.println("Started");
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken : "+(end + start));
        System.out.println("list 1 : "+list1.size()+ "  List 2 : "+list2.size());
    }
}
