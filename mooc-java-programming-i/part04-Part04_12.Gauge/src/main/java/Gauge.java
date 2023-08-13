public class Gauge {
    private int value;
    public Gauge(){
        this.value = 0;
    }
    public void increase(){
        if (value == 5) {

        } else {
            this.value++;
        }
    }
    public void decrease(){
        if (value > 0) {
            this.value--;
        }
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
        if (value == 5) {
            return true;
        }
        return false;
    }
}
