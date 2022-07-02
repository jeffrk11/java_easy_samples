package oop.model;
//employee has the attributes from person, 
public class Employee extends Person{
    private float money;
    //protected attribute are here
    //and privates only getter and setter can use

    public Employee(String name, int age){
        super(name, age);
    }

    public Employee(String name, int age, float money){
        super(name, age);
        this.money = money;
    }

    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }
}
