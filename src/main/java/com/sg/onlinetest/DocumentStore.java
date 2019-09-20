package com.sg.onlinetest;
import java.util.*;

public class DocumentStore {
    /*private Collection<String> documents = new ArrayList<String>();
    private int capacity;

    public DocumentStore(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Collection<String> getDocuments() {
        return documents;
    }

    public void addDocument(String document) {
        if (this.documents.size() > this.capacity) {
            throw new IllegalStateException();
        }else {
            documents.add(document);
        }
    }

    @Override
    public String toString() {
        return String.format("Document store: {%d}/{%d}", documents.size(), capacity);
    }*/

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "strawberry", "apple"};
        List<String> arryList = Arrays.asList(arr);
        int x = (int) arryList.stream().filter(y->y.equalsIgnoreCase("apple")).count();
        //System.out.println(x);
         countItems(arr, "apple");
        /*System.out.println("check");
        DocumentStore documentStore = new DocumentStore(2);
        documentStore.addDocument("item");
        documentStore.addDocument("item2");
        documentStore.addDocument("item3");
        System.out.println(documentStore);
        System.out.println(documentStore.getCapacity());
        System.out.println(documentStore.getDocuments());*/
    }

    static void countItems(String[] arryList, String apple) {



    }
}
