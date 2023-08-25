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
    public int stock(String product){
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        return 0;
    }
    public boolean take(String product){
        if (productStock.containsKey(product)) {
            if (productStock.get(product) == 0){
                return false;
            }
            int stock = productStock.get(product);
            productStock.replace(product, stock-1);
            return true;
        }
        return false;
    }

}
