import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)){
            return true;
        }
        return false;
    }
}
