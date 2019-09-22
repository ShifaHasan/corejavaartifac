package core;


public class CoreJavaQuestion {


    @FunctionalInterface
    interface Inface {
       // int sum();
        int sum(int x , int y );
    }

   // Inface x = ()-> 2;

   //Inface intf = (x, y) -> System.out.println("x and Y");

    public static void main(String[] args) {
        Inface intf = (x, y) -> check(x,y);
        int k = intf.sum(3,4);
    }


    static int check(int x , int y ){
        System.out.print("In the ");
        return  x*y;
    }
}

