import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bot extends Player{
    private ArrayList<String> moves;
    public Bot(String name) {
        super(name);
        moves =new ArrayList<>();
    }
    public void addMove(String move){
        moves.add(move);
    }
}
