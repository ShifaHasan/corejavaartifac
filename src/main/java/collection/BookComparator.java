package collection;



import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    int compKey;

    public BookComparator(int compKey){
        this.compKey=compKey;
    }
    @Override
    public int compare(Book o1, Book o2) {
        if(compKey==1){
            return  o1.getName().compareTo(o2.getName());
        }
        if(compKey==2){
            return     o1.getAuther().compareTo(o2.getAuther());
        }
        return 0;
    }
}
