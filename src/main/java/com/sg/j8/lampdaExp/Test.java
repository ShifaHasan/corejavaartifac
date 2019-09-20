package com.sg.j8.lampdaExp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        System.out.println("BisMillah");
        Test t = new Test();
        List<Integer> ints = t.createArrayListObject();
        playWithJAva8(ints );
        sortList(ints);
        Map<String, Person> hashMap= createMAp();
        System.out.println(hashMap);

        /*hashMap.entrySet().stream().sorted(
                (a,b) -> a.getValue().
        )*/
        //HashSet
    }

    private static Map<String, Person> createMAp() {
        Map<String,Person> map = new HashMap<>();
        /*map.put("A",new Person(5, "EE", 51, "A"));
        map.put("D",new Person(4, "DD", 25, "D"));
        map.put("B",new Person(3, "CC", 44, "B"));*/
        return map;
    }

    private static void sortList(List<Integer> ints) {
        List<Integer> newList = ints.stream().sorted().collect(Collectors.toList());
        System.out.println(newList);
    }

    private static void playWithJAva8(List<Integer> ints) {
        Stream<Integer> intStrms = ints.stream();
        System.out.println(ints);
    }

    List<Integer> createArrayListObject(){
        List<Integer>  aryList = new ArrayList<Integer>();
        aryList.add(1);
        aryList.add(3);
        aryList.add(1);
        aryList.add(4);
        aryList.add(6);
        return aryList;
    }
}
