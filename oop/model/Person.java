package oop.model;

//abstract cannot be a instance 
public abstract class Person {

    //private only the class can see
    private String name;
    //protectec childs can use
    protected int age;

    //the child must use this constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
