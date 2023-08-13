
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public int size(){
        return this.squares + this.rooms;
    }
    public int price() {
        return squares * princePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (this.size() > compared.size()) {
            return true;
        }
        return false;
    }
    public boolean moreExpensiveThan(Apartment compared){
        if (this.price() > compared.price()) {
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        return Math.abs(this.price() - compared.price());
    }


}
