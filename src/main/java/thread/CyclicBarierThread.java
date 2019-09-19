package thread;

public class CyclicBarierThread implements  Runnable {
    @Override
    public void run() {
        System.out.println("All parties are arrived at barrier, lets play the game");
        //while (true); //important line for testing

    }
}
