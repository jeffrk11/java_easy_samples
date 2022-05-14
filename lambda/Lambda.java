package lambda;

public class Lambda{

    public static void main(String[] args){
        //java 7 way
        //implementation just say hello with a functional interface
        new Person( new Speak(){
            @Override
            public void sayHello() {
                System.out.println("Hello World from implemented method");
            }
        }).sayHello();
        //java 8 way
        //lambda call that one method from interface, and you dont have to explicity nothing
        new Person( () -> System.out.println("Hello World from lambda") ).sayHello();
        
    }

}