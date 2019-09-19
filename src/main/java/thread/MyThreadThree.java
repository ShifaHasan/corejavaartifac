package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MyThreadThree implements Runnable {
    ShareObject shareObject;
    CountDownLatch countDownLatch;
    CyclicBarrier cyclicBarrier;
    MyThreadThree(ShareObject shareObject, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier) {
        this.shareObject = shareObject;
        this.countDownLatch = countDownLatch;
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        //while(true){
        try {
            System.out.println("Barier is waiting 3");
            cyclicBarrier.await();
            System.out.println("Barier is crosses 3 ");
            shareObject.printSequential();
            this.countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        //  }

    }
}
