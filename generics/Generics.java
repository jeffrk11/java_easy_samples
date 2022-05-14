package generics;

public class Generics {

    public static void main(String[] args){
        //with generic you can define the type at this moment
        //this case, it's a apple box
        Box<Apple> apple_box = new Box<>();
        //i will put one apple here
        apple_box.setItems(new Apple("$10"));
        //now we have an apple inside the box and yout can manipulate it
        apple_box.getItems().setPrice("$5");
        //and if you try to put something that is not an apple
        //like this
        //apple_box.setItems(new Money(10));
        
        //you will see an error, because it is an apple box
        //and but you can not change it, like this
        //apple_box = new Box<Money>();
        //-------------------------------------------------------------------
        //if you dont say what type of box it is, you will need to cast 
        Box box = new Box<>();
        box.setItems(new Money(10));
        ((Money) box.getItems()).setValue(20);
        //and if you cast different from de real type, you will get an error
        
    }
}
