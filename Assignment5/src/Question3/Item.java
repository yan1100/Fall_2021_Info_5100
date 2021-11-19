package Question3;

public class Item {
    private String Id;
    private int price;

    public Item(String id, int price) {
        Id = id;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
