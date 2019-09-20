package collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

    int sortType;

    public int getSortType() {
        return sortType;
    }

    public void setSortType(int sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        if(this.sortType==1)
        return o1.getId() - (o2.getId());
        else if(this.sortType==3)
            return o1.getName().compareTo(o2.getName());
        else
            return o1.getAddress().compareTo(o2.getAddress());

    }
}
