package oop.model;

public class Manager extends Person{
    
    private int employees;

    public Manager(String name, int age) {
        super(name, age);
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

}
