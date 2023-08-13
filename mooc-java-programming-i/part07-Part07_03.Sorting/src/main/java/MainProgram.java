import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array){
        int small = array[0];
        for (int num: array) {
            if (num < small) {
                small = num;
            }
        }
        return small;
    }
    public static int indexOfSmallest(int[] array){
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                idx = i;
            }
        }
        return idx;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = Integer.MAX_VALUE;
        int idx = startIndex;
        for (int i =startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                idx = i;
            }
        }
        return idx;
    }
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }


    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

}
