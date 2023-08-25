import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    public Warehouse(){
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        this.productStock.put(product, stock);
        this.productPrice.put(product, price);
    }
    public int price(String product){
        if (productPrice.containsKey(product)) {
            return productPrice.get(product);
        }
        return -99;
    }

}
