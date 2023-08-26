import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    public void add(String product, int price){
        this.items.putIfAbsent(product, new Item(product, 0, price));
        this.items.get(product).increaseQuantity();
    }
    public int price(){
        int totalPrice = 0;
        for (Item item: items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
}
