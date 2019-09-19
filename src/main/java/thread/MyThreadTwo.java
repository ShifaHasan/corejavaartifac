package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MyThreadTwo implements  Runnable {

    ShareObject shareObject;
    CountDownLatch countDownLatch;
    CyclicBarrier cyclicBarrier;
    MyThreadTwo(ShareObject shareObject,    CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier ){
    this.shareObject = shareObject;
    this.countDownLatch =countDownLatch;
    this.cyclicBarrier = cyclicBarrier;

    }

    public void run() {

       // while(true){
            try {
                System.out.println("Barier is waiting 2");
                cyclicBarrier.await();
                System.out.println("Barier is crosses 2 ");
                shareObject.printSequential();
                this.countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        //}

    }
}
