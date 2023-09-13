
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int row = 2;
        int columns = 3;
        int[][] matrix = new int[row][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                str.append(array[i][j]);
            }
            str.append("\n");
        }
        return str.toString();
    }   
}
