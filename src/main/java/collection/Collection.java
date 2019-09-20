package collection;

import java.util.*;

public class Collection {

    public static void main(String[] args) {

        System.out.println("Test");
        List<Employee> empLst = new ArrayList<Employee>();
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Manaizr");
        e1.setAddress("Bang");

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Arshad");
        e2.setAddress("Pune");

        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("Shadhid");
        e3.setAddress("Hyd");

        empLst.add(e1);
        empLst.add(e2);
        empLst.add(e3);
        //System.out.println(empLst);
        //Collections.sort(empLst);
        //System.out.println(empLst);
        MyComparator my = new MyComparator();
        my.setSortType(2);
    /*
        Collections.sort(empLst,my);
        System.out.println(empLst);

        my.setSortType(3);
        Collections.sort(empLst,my);
        System.out.println(empLst);*/

        //TreeSet
        Set<Employee> hSet = new HashSet<>();
        hSet.add(e1);
        hSet.add(e2);
        hSet.add(e3);
        TreeSet<Employee> treeSet = new TreeSet<>(my);
        treeSet.addAll(hSet);
        System.out.println(treeSet);

        Map<Integer,Employee> hmap = new HashMap<>();
        hmap.put(1,e1);
        hmap.put(2,e2);
        hmap.put(3,e3);
        Set<Map.Entry<Integer, Employee>> keySet = hmap.entrySet();
        ArrayList as = new ArrayList(keySet);
        MyComparatorMapEntry myComparatorMapEntry = new MyComparatorMapEntry();
        myComparatorMapEntry.setSortType(2);
        Collections.sort(as,myComparatorMapEntry);
        System.out.println(keySet);
    }
}
