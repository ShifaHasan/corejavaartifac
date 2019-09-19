package thread;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerThrd implements Runnable {

    ArrayBlockingQueue<Integer> arrayBlockingQueue ;
    ProducerThrd( ArrayBlockingQueue<Integer> arrayBlockingQueue ){
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        int x =0;
        while (true) {
            synchronized (arrayBlockingQueue) {
                try {
                    Thread.sleep(200);
                    arrayBlockingQueue.notify();
                    x = x+1;
                    arrayBlockingQueue.put(x);
                    System.out.println(Thread.currentThread() + " " + x);
                    arrayBlockingQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
