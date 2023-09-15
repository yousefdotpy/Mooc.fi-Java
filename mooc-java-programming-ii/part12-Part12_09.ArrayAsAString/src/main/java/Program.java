
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] x : array) {
            for (int y : x) {
                stringBuilder.append(y);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
