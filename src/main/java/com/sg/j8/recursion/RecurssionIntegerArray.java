package com.sg.j8.recursion;

public class RecurssionIntegerArray {

    public static void main(String[] args) {
        int[] a = {2,1,3,5};
        /*int x = sumArray(a, a.length-1);
        int y =factorial(5);
        reverse(a,0,a.length-1);*/
        int sum =sumArrayUsingBinaryRec(a,0,a.length-1);
        System.out.println(sum);
    }
    private static int sumArrayUsingBinaryRec(int[] a, int i, int j) {
        if (i > j) {
            return 0;
        }else if (i == j) {
            return a[i];
        } else {
            int mid = (i+j)/2;
            return sumArray(a, i,mid) + sumArray(a, mid+1,j);
        }
    }

    private static int sumArray(int[] a, int i, int len) {
        if(len<=0)
            return a[len];
             return a[len] + sumArray(a, i, len-1);
    }

    private static int factorial(int num) {
        if(num<=1)
            return num;
        return num*factorial(num-1);
    }

    private static void reverse(int[] a,int start, int end){
        if(start<=end){
            swapArray(a,start, end);
            reverse(a,start+1 , end-1);
        }
    }
    private static void swapArray(int[]a,int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
