package oop.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import oop.model.Person;

//this class is a util to sort some persons
public class SortPersonUtil {
    
    public static List<Person> sortPersonsByName(Person[] persons){       
        List<Person> list = List.of(persons);
        return list.stream()
                        .sorted(Comparator.comparing(Person::getName))
                        .collect(Collectors.toList());
    }

}
