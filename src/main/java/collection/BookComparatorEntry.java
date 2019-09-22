package collection;


import java.util.Comparator;
import java.util.Map;

public class BookComparatorEntry implements Comparator<Map.Entry<Integer,Book>> {

    int value;

    public BookComparatorEntry(int value) {
        this.value = value;
    }
    @Override
    public int compare(Map.Entry<Integer, Book> o1, Map.Entry<Integer, Book> o2) {
        if(this.value ==1 ){
            return o1.getValue().getAuther().compareTo(o2.getValue().getAuther());
        }
        if(this.value ==2 ){
            return o1.getValue().getName().compareTo(o2.getValue().getName());
        }
        return 0;
    }
}
