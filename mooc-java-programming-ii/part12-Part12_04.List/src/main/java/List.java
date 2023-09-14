public class List <T>{
    private T[] values;
    private int firstFreeIndex;

    public List(){
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value){
        if (this.firstFreeIndex == this.values.length) {
            extend();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    public void extend(){
        T[] newValues = (T[]) new Object[firstFreeIndex + firstFreeIndex/2];
        for (int i = 0; i < firstFreeIndex; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(T value){

        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public int size() {
        return this.firstFreeIndex;
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

}
