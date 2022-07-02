package oop;

import oop.model.Employee;
import oop.model.Manager;
import oop.model.Person;
import oop.service.SortPersonUtil;

//simple example of inheritance in java
public class Inheritance {
    
    public static void main(String[] args) {
        Person e = new Employee("Paul",30, 100);
        Person m = new Manager("Allan", 21);

        System.out.println(SortPersonUtil.sortPersonsByName( new Person[]{e,m} ));
    }


}
