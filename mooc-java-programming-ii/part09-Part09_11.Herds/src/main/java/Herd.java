import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> items;
    public Herd(){
        this.items = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        this.items.add(movable);
    }
    public void move(int dx, int dy){
        for (Movable item: items) {
            item.move(dx, dy);
        }
    }
    public String toString(){
        String output = "";
        for (Movable item: items) {
            output += item + "\n";
        }
        return output;
    }
}
