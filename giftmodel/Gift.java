package giftmodel;

public class Gift {
    int id, qty;
    String name;
    float price;
    public Gift(){
    }
    public Gift(int id, String name, float price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
