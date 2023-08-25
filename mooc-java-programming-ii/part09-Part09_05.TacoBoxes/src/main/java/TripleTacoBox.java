public class TripleTacoBox implements TacoBox{

    private int tacos;
    public TripleTacoBox(){
        this.tacos = 3;
    }

    public void setTacos(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (this.tacos > 0) {
            this.tacos -= 1;
        }
        else {
            this.tacos = 0;
        }
    }
}
