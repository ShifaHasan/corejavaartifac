package thread;

import java.util.concurrent.Callable;

public class CallableFuture implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("call future object");
        int x =10;
        //while (x>0){} //import line
        return 42;
    }
}
