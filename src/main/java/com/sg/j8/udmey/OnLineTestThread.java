package com.sg.j8.udmey;

public class OnLineTestThread {
    public static void main(String[] args) throws InterruptedException {
        //int x=2,b[]=new int[0];     System.out.println(b[x]);
        Thread.currentThread().join(); //it seems like dead lock
        Runnable run = ()-> {
            for(int i=0;i<100;i++){
                System.out.println("Test "+Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(run);
        t.start();
       // t.join();
        System.out.println("Exit Main Thread "+Thread.currentThread().getName());
    }
}
