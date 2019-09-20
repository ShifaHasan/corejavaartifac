package com.sg.j8.sorting;


import java.util.*;
import java.util.stream.Collectors;

public class SortingCollc {

    public static void main(String[] args) {

        Book b1 = new Book(101, "CoreJava", "A");
        Book b2 = new Book(102, "Adv", "B");
        Book b3 = new Book(1003, "Bdv", "C");
        Book b4 = new Book(1003, null, "C");

        //aryLstSorting(b1, b2, b3);
        //hashSetSort(b1, b2, b3);
        //hasMapSortOnKey(b1, b2, b3);
        //hasMapSortOnValue(b1, b2, b3);

        //using java8
        //aryLstSortingJ8(b1, b2, b3);
        //hashSetSortJ8(b1, b2, b3);
        //hasMapSortOnKeyJ8(b1, b2, b3);
        List<Book> aryList = new ArrayList<Book>();
        aryList.add(b1);
        aryList.add(b2);
        aryList.add(b3);
        b4.setName(null);
        aryList.add(b4);
        filterAutherName(aryList);
    }

    private static void filterAutherName(List<Book> aryList) {
        List<String> authors = aryList.stream().map(Book::getName).collect(Collectors.toList());
        System.out.println(authors);
    }

    private static void hasMapSortOnKeyJ8(Book b1, Book b2, Book b3) {
        HashMap<Integer,Book> hmap = new HashMap<>();
        hmap.put(b3.getId(),b3);hmap.put(b2.getId(),b2);;hmap.put(b1.getId(),b1);
        System.out.println(hmap);

    }

    private static void hashSetSortJ8(Book b1, Book b2, Book b3) {
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        BookComparator bookComp = new BookComparator(2);
        //System.out.println(books);
        List<Book> streamBooks = books.stream().sorted(bookComp).collect(Collectors.toList());
        System.out.println(streamBooks);
        //streamBooks.sort();
    }

    private static void aryLstSortingJ8(Book b1, Book b2, Book b3) {
        List<Book> books = new ArrayList<>();
        BookComparator bookComp = new BookComparator(1);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        List<Book> booksStream= books.stream().sorted(bookComp).collect(Collectors.toList());
        System.out.println(booksStream);
        Collections.sort(booksStream,(s1,s2)->s1.compareTo(s2));
    }

    private static void hasMapSortOnValue(Book b1, Book b2, Book b3) {
        HashMap<Integer,Book> hmap = new HashMap<>();
        hmap.put(b3.getId(),b3);hmap.put(b2.getId(),b2);;hmap.put(b1.getId(),b1);
        System.out.println(hmap);
        //method 1
        /*Set<Map.Entry<Integer,Book>> entrySet = (Set<Map.Entry<Integer, Book>>) hmap.entrySet();
        List<Map.Entry<Integer,Book>> listEntry = new ArrayList<>();
        BookComparatorEntry bookComparatorEntry = new BookComparatorEntry(2);
        listEntry.addAll(entrySet);
        Collections.sort(listEntry,bookComparatorEntry);
        System.out.println(listEntry);
        */
        //method 2
        BookComparatorEntry bookComparatorEntry = new BookComparatorEntry(2);
        TreeSet<Map.Entry<Integer,Book>> tset = new TreeSet<Map.Entry<Integer,Book>>(bookComparatorEntry);
        tset.addAll(hmap.entrySet());
        System.out.println(tset);
    }

    private static void hasMapSortOnKey(Book b1, Book b2, Book b3) {
        HashMap<Integer,Book> hmap = new HashMap<>();
        hmap.put(b3.getId(),b3);hmap.put(b2.getId(),b2);;hmap.put(b1.getId(),b1);
        System.out.println(hmap);
        TreeMap<Integer,Book> tmap= new TreeMap<>();
        tmap.putAll(hmap);
        System.out.println(tmap);

    }

    private static void hashSetSort(Book b1, Book b2, Book b3) {
        HashSet hashSet = new HashSet();
        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);
        System.out.println(hashSet);
        //Collections.sort(hashSet);//error
        //First method
        /*List<Book> books = new ArrayList<>(hashSet);
        Collections.sort(books);
        System.out.println(hashSet);
        */
        //secound method
        TreeSet treeSet = new TreeSet<>(hashSet);//treeSet2.addAll(hashSet);
        System.out.println(treeSet);
        //using comparator,
        BookComparator bookComp = new BookComparator(1);
        TreeSet treeSet2 = new TreeSet<>(bookComp);
        treeSet2.addAll(hashSet);
        System.out.println(treeSet2);

    }

    private static void aryLstSorting(Book b1, Book b2, Book b3) {
        List<Book> books = new ArrayList<>();
        BookComparator bookComp = new BookComparator(2);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println(books);//no sort
        Collections.sort(books);
        System.out.println(books);
        Collections.sort(books, bookComp);
        System.out.println(books);
    }
}
