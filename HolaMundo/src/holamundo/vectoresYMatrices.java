package holamundo;

import java.util.Arrays;

public class vectoresYMatrices {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int [5];
        //inherited from C/C++, less readable in java
        System.out.println(Arrays.toString(vector));
        for(int i = 0; i < vector.length; i++) vector[i] = i;
        System.out.println(Arrays.toString(vector));
    }
    
}
