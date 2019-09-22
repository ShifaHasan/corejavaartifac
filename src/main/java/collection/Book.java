package collection;

import java.util.List;

public class Book implements  Comparable<Book>{



    int id;
    String name;
    String auther;
    List<String> locations;



    public Book(int id, String name, String auther) {
        this.id = id;
        this.name = name;
        this.auther = auther;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
    public void setName(String name) {
        this.name = name;
    }


    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }



    @Override
    public int compareTo(Book o) {
        return this.getAuther().compareTo(o.getAuther());
    }
}
