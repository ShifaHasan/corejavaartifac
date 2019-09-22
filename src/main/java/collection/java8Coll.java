package collection;
import collection.B2;
import collection.Book;

import java.util.*;
import java.util.stream.Collectors;

public class java8Coll {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //numbers.stream().forEach(s-> System.out.println(s));
        //numbers.stream().map(x->x*x).forEach(s-> System.out.println(s));
        numbers.stream().filter(x->x>2).forEach(s-> System.out.println(s));
        long k = numbers.stream().filter(x->x!=2).count();
        //numbers.stream().reduce()
        int sumOFElements = numbers.stream().reduce((x,y)->x+y).get();
        System.out.println(sumOFElements);
        Book b1 = new Book(101, "CoreJava", "A");
        List<String> loc1= new ArrayList<>();
        loc1.add("IND");
        loc1.add("PAK");
        b1.setLocations(loc1);
        Book b2 = new Book(102, "Adv", "B");
        List<String> loc2= new ArrayList<>();
        loc2.add("HG");
        loc2.add("BANG");
        b2.setLocations(loc2);
        Book b3 = new Book(1003, "Bdv", "C");
        List<String> loc3= new ArrayList<>();
        loc3.add("IND");
        loc3.add("FRN");
        b3.setLocations(loc3);
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        //System.out.println(books);//no sort
        Set<String> location = books.stream().flatMap(x->x.getLocations().stream()).collect(Collectors.toSet());
        System.out.println(location);
        Set<String> location2 = books.stream().flatMap(x->x.getLocations().stream()).collect(Collectors.toSet());

        //list contain string with , sep
        List<String> bdrids = new ArrayList<>();
        bdrids.add("abc,cde");
        bdrids.add("12,234");

        List<String> accounts = Arrays.asList(bdrids.stream().collect(Collectors.joining(",")).split(","));
        System.out.println(accounts);
        List<String> accounts2 = bdrids.stream().flatMap(str1->bdrids.stream().map(str2->str1+str2)).collect(Collectors.toList());
        System.out.println(accounts2);

        B2 b22 = new B2();
        B2 b23 = new B2();
        b22.setId(101);
        b22.setName("CoreJava");
        b23.setId(102);
        b23.setName("Test");
        Set<B2> listb2 = new HashSet<>();
        listb2.add(b22);
        listb2.add(b23);
        Book book1 = new Book(101, "", "A");
        Book book2 = new Book(102, "", "A");
        List<Book> bokks = new ArrayList<>();
        bokks.add(book1);
        bokks.add(book2);
        System.out.println(bokks);
        listb2.forEach(x->bokks.stream().filter(a->a.getName().equalsIgnoreCase("")).
                filter(z->z.getId()== x.getId()).forEach(y->{y.setName(x.getName());}));
        System.out.println(bokks);
    }
}
