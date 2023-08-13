import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        values = new ArrayList<>();
    }
    public boolean isEmpty(){
        return values.isEmpty();
    }
    public void add(String value){
        values.add(value);
    }
    public String take(){
        String last = this.values.get(values.size()-1);
        this.values.remove(values.size()-1);
        return last;
    }
    public ArrayList<String> values(){
        return this.values;
    }
}
