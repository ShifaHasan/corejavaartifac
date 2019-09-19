package thread;

public class ShareObject {
        int x=0;
      void printSequential() throws InterruptedException {
          synchronized (this) {
              this.notifyAll();
              System.out.println(Thread.currentThread() + " [ ]  " + ++x);
              Thread.sleep(200);
              this.wait();
          }

    }

}
