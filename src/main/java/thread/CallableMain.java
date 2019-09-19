package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

    public static void main(String[] args) {
        CallableFuture callFut = new CallableFuture();
        ExecutorService executer = Executors.newSingleThreadExecutor();
        //Executors.newFixedThreadPool(10);
        Future<Integer> fut = executer.submit(callFut);
        try {
            int x = fut.get();
            System.out.println(" Return value " + x );
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executer.shutdown();

    }

}
