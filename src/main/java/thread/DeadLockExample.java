package thread;



public class DeadLockExample {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                e1.m();
            }
        }) ;
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                e1.n();
            }
        }) ;
        t1.start();
        t2.start();

        System.out.println("Deak lock example");
    }


}

class Employee {

    synchronized      void m(){
        try {
            Thread.sleep(200);
            System.out.println(Thread.currentThread() + " m ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // n();
    }
    synchronized  void n(){
        try {
            Thread.sleep(200);
            System.out.println(Thread.currentThread() + " n ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //m();
    }
}
