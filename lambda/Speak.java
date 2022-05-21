package lambda;
//functional interface, just have one method
@FunctionalInterface
public interface Speak {
    //must be implemented to say hello
    void sayHello();
}
