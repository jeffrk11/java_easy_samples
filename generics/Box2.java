package generics;

//you can do more than one generic
public class Box2 <Something, Anything> {
    //the box contains "something items"
    Something items;
    Anything items2;
    //and you can make getters and setter with it
    public Something getItems() {
        return items;
    }
    public void setItems(Something items) {
        this.items = items;
    }
    public Anything getItems2() {
        return items2;
    }
    public void setItems2(Anything items2) {
        this.items2 = items2;
    }
    

}
