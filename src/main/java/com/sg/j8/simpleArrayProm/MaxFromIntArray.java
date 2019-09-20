package com.sg.j8.simpleArrayProm;

public class MaxFromIntArray {

    public static void main(String[] args) {
        int[] a =new int[]{1,14,5,8,12};
        int maxValue = maxIntegerArray(a);
    }

    static int maxIntegerArray(int[] a) {
        int max = a[0];
        int i = 1;
        while (i < a.length) {
            if (max < a[i]) {
                max = a[i];
            }
            i++;
        }
        return max;
    }
}
