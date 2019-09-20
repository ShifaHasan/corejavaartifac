package com.sg.onlinetest;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SapientTest implements Serializable {
    ArrayList tracks;
    static String s = "acxcbc";

    SapientTest() {
        this.tracks = new ArrayList();
    }

    static void kk(String s) {
        s += "Add";

    }

    public static void main(String[] args) {
        System.out.println("In the name of ALLAH");
        s = "abc";
        String s = "xxx";
        kk(s);
        System.out.println(SapientTest.s);
        Boolean b1 = new Boolean("TruE");
        Boolean b2 = new Boolean("true");
        System.out.println(b1.equals(b2));

       /* OnLineTest t = new OnLineTest();
        int i = t.check();
        System.out.println(i);

        ArrayList<A> x = new ArrayList<A>();
        ArrayList<B> a = new ArrayList<B>();
        x.add(new A());
        int j=0;
        for(j=0;j<2;j++){
            continue;
        }
        BigDecimal m1 = new BigDecimal("39.13");*/

        A xx = new B(2);


        //a= (ArrayList<B>) x;
    }

    int check() {
        try {
            throw new IOException();
            // return 1;//line 13
        } catch (Exception e) {
            System.out.println("catch block");
            return 2;
        } finally {
            // System.exit(0);
            System.out.println("finally");
            return 3;
        }
        //return 0;
    }
}

    class A{
    A()  {
        System.out.println("this");
    }
    public  void    m() {
    }
    }
    class B extends A{
    B(int i){
        System.out.println("dfdf");
    }
    /*public static void m() { //error SubClass should be subset of Subclass, same implement for exception

    }*/
    }



