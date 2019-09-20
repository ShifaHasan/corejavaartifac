package com.sg.j8.recursion;

public class DynamicProFibinice {

    public static void main(String[] args) {
        System.out.println("In the name");
        int[] a = {2,5,6,7};
        long start =System.currentTimeMillis();
        long fib = fibonice(50);//0,1,1,2,3,5 //for 50 it takes 335825 i.e 5.5 minuts(12586269025)
        System.out.println(fib);
        System.out.printf(String.valueOf(System.currentTimeMillis() -start));
        //int sum = sumFun(a,a.length);
        //System.out.println(sum);
        //int sum = sumFunRec(a,a.length-1);
        //System.out.println(sum);
    }

    private static int sumFunRec(int[] a, int index) {
        if (index <= 0) {
            return a[index];
        } else {
            return a[index] + sumFunRec(a, index - 1);

        }
    }

    private static int sumFun(int[] a, int len) {
        int sum = 0;
        int i = 0;
        while (i < len) {
            sum = sum + a[i];
            i++;
        }
        return sum;
    }

    static long fibonice(int num){

        /*if (num <= 1) {
            return num;
        } else {
            return fibonice(num - 1) + fibonice(num - 2);
        }*/

        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1]= 1;
        for (int i =2; i<num+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];

    }
}
