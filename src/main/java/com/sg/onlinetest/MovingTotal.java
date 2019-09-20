package com.sg.onlinetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovingTotal {

    static List<Integer> intAry = new ArrayList<>();

    public void append(int[] list) {
        intAry = Arrays.stream(list).boxed().collect(Collectors.toList());
    }

    public boolean contains(int total) {
        Integer value = intAry.stream().reduce((x, y) -> x + y).get();
        if (value == total) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[]{1, 2, 3});
        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));

        //movingTotal.append(new int[] { 4 });
        //System.out.println(movingTotal.contains(9));
    }
}
