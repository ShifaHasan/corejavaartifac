package com.sg.j8.recursion;

public class RecuresionTest {

    int sv;
    public static void main(String[] args) {
        int x = fun2(4);
        System.out.println(x);
    }

    static int fun(int n) {
        if (n == 0)
            return 1;
        return fun(n - 1) + fun(n - 1) + fun(n - 1); //2^n, 3^n , for two binomial or 3 binomial
    }

    static int fun1(int n) {
        if (n == 1)
            return 1;
        return fun1(n - 1) + fun1(n - 1); //2^(n-1), 3^(n-1) , for two binomial or 3 binomial
    }

    static int fun2(int n) {
        if (n == 2)
            return 1;
        return fun2(n - 1) + fun2(n - 1); //2^(n-2), 3^(n-2) , for two binomial or 3 binomial
    }
}
