package generics;
//simple class
public class Apple extends Fruit{
    
    String price;

    public Apple(String price) {
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
