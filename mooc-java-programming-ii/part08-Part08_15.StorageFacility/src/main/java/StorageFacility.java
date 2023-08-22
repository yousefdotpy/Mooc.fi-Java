import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facilities;

    public StorageFacility() {
        this.facilities = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facilities.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> content = this.facilities.get(unit);
        content.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.facilities.containsKey(storageUnit)) {
            return this.facilities.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (this.facilities.containsKey(storageUnit)) {
            ArrayList<String> items = this.facilities.get(storageUnit);
            items.remove(item);

            if (items.isEmpty()) {
                this.facilities.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        for (String unit : facilities.keySet()) {
            if (!facilities.get(unit).isEmpty()) {
                unitsWithItems.add(unit);
            }
        }
        return unitsWithItems;
    }
}