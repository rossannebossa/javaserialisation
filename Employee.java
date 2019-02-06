package Serialisation;

public class Employee implements java.io.Serializable {

    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\t Name: " + name;
    }
}
