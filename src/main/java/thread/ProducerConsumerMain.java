package thread;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerMain {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(5);
        ProducerThrd producerThrd = new ProducerThrd(arrayBlockingQueue);
        Thread th = new Thread(producerThrd);
        th.setName("Producer");
        th.start();

        ConsumerThrd consumerThrd = new ConsumerThrd(arrayBlockingQueue);
        Thread prod = new Thread(consumerThrd);
        prod.setName("Cosnumer");
        prod.start();
    }
}


