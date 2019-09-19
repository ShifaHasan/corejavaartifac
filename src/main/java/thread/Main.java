package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        CyclicBarierThread bthrd = new CyclicBarierThread();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,bthrd);

        ShareObject shareObject = new ShareObject();
        MyThreadOne one = new MyThreadOne(shareObject,countDownLatch,cyclicBarrier);
        Thread t = new Thread(one);
        t.setName("1");
        t.start();


        MyThreadTwo  two = new MyThreadTwo(shareObject,countDownLatch,cyclicBarrier);
        Thread t2 = new Thread(two);
        t2.setName("2");
        t2.start();

        MyThreadThree  three = new MyThreadThree(shareObject,countDownLatch,cyclicBarrier);
        Thread t3 = new Thread(three);
        t3.setName("3");
        t3.start();

        countDownLatch.await();
        System.out.println("All services are up, Application is starting now");

    }
}
