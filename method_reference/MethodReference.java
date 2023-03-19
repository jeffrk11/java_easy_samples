package method_reference;

import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        //java 8 feature
        //Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods.
        //There are four kinds of method references:
        
        //static methods
        List.of("apple","banana").stream().forEach( w -> StaticMethod.hello(w)); //without method reference
        List.of("apple","banana").stream().forEach(StaticMethod::hello); //with method reference

        //Instance methods of particular objects
        ParticularObject p = new ParticularObject();
        List.of("apple","banana").stream().forEach(w -> p.hello(w));
        List.of("apple","banana").stream().forEach(p::hello);

        //Instance methods of an arbitrary object of a particular type
        List.of("apple","banana").stream().sorted( (a,b) -> a.compareTo(b));
        List.of("apple","banana").stream().sorted(String::compareTo);

        //Reference to a Constructor
        List.of("apple","banana").stream().map(w -> new ParticularObject(w));
        List.of("apple","banana").stream().map(ParticularObject::new);

    }
}
