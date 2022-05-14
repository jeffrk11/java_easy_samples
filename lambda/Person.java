package lambda;
public class Person implements Speak{

    private Speak speak;
    //receive a Speak and mandatorily implement this outside
    Person(Speak speak){
        this.speak = speak;
    }

    //call the sayHello implemented outside
    @Override
    public void sayHello() {
        this.speak.sayHello();
    }
    
}
