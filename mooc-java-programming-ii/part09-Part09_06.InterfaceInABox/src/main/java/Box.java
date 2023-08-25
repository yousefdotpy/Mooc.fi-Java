import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public double weight() {
        double weight = 0;
        for (Packable item: items) {
            weight += item.weight();
        }
        return weight;
    }
    public void add(Packable item){
        if (item.weight()+weight() <= maxWeight) {
            this.items.add(item);
        }
    }
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, " + "total weight " + this.weight() + " kg";
    }
}
