package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args){
        //wildcards exist because, generics have a rule
        //you cant do a box with fruit and put apple inside
        //so wildcard you solve it
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("$10"));
        loop(apples);
        //and if you want to work with mother class
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple("$10"));
        fruits.add(new Orange("$5"));
        loopFruits(fruits);
    }

    //you dont know what is comming 
    //simple wildcard
    public static void loop(List<?> items){
        items.forEach( item -> System.out.println(item));
    }
    //you know the super class
    //extends wildcard
    public static void loopFruits(List<? extends Fruit> fruits){
        //notice you can call methods from fruit class
        fruits.forEach( fruit -> System.out.println(fruit.getColor()));
    }
}
