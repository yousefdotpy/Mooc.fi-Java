import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private List<T> hideoutList;
    public Hideout(){
        this.hideoutList = new ArrayList<>();
    }
    public void putIntoHideout(T toHide){
        if (!this.hideoutList.isEmpty()){
            this.hideoutList.clear();
        }
        this.hideoutList.add(toHide);
    }
    public T takeFromHideout(){
        T object = this.hideoutList.get(0);
        this.hideoutList.clear();
        return object;
    }
    public boolean isInHideout(){
        return !this.hideoutList.isEmpty();
    }
}
