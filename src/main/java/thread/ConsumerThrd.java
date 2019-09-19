package thread;
import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerThrd implements Runnable {

    ArrayBlockingQueue<Integer> arrayBlockingQueue ;
    ConsumerThrd( ArrayBlockingQueue<Integer> arrayBlockingQueue ){
        this.arrayBlockingQueue = arrayBlockingQueue;
    }
    @Override
    public void run() {
        while(true){
            synchronized (arrayBlockingQueue){
                try {
                    Thread.sleep(200);
                    arrayBlockingQueue.notify();
                    Integer x = arrayBlockingQueue.take();
                    System.out.println(Thread.currentThread() + " " + x);
                    arrayBlockingQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
