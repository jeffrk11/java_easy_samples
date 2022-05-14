package generics;
//simple class
public class Orange extends Fruit{
    
    String price;

    public Orange(String price) {
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
