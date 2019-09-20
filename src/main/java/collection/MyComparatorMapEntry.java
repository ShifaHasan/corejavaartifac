package collection;

import java.util.Comparator;
import java.util.Map;

public class MyComparatorMapEntry implements Comparator<Map.Entry<Integer, Employee>> {
    private int type;

    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
        if (type == 1) {
            Employee first = (Employee) e1.getValue();
            Employee second = (Employee) e2.getValue();
            return first.getId() - second.getId();
        }
        if (type == 2) {
            System.out.println("short on name  basis ");
            Employee first = (Employee) e1.getValue();
            Employee second = (Employee) e2.getValue();
            return first.getName().compareTo(second.getName());
        } else return 0;
    }

    public void setSortType(int type) {
        this.type = type;

    }

}
