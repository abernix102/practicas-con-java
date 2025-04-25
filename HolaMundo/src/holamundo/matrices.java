package holamundo;

import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {
        /* declaration */
        int [] [] matrix = new int[3][3];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = j;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
