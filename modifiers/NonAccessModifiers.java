package modifiers;

//classes can be final and abstract
//final: class cannot be inherited by other classes
//abstract: class cannot be instantiate
public abstract class NonAccessModifiers {
    //attributes and methods
    final     int number1 = 1; //final: cannot be modified and must be initialized
    static    int number2;     //static: belongs to the class
    
    transient  int number3; // Attributes and methods are skipped when serializing the object containing them. more in: https://www.baeldung.com/java-serialization
    volatile   int number4; // The value of an attribute is not cached thread-locally, and is always read from the "main memory"
    
    synchronized void m(){
        //Methods can only be accessed by one thread at a time
    }

    //An abstract method belongs to an abstract class, and it does not have a body. 
    //The body should be provided by the subclass 
    abstract int method();
}
