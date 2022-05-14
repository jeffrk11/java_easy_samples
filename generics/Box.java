package generics;

//box expect anything type of object so instead use class "Object" we can use the generic to define it
//in this case is "Something", but you can name it with whatever you want, generally letters are used like "T"
public class Box <Something> {
    //the box contains "something items"
    Something items;

    //and you can make getters and setter with it
    public Something getItems() {
        return items;
    }
    public void setItems(Something items) {
        this.items = items;
    }

}
