package collection;

public class Employee  implements  Comparable<Employee> {
    int id;
    String name;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Employee o) {
        return this.getAddress().compareTo(o.getAddress());
    }*/
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
