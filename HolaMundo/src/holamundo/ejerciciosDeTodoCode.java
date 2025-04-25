package holamundo;

import java.util.ArrayList;

public class ejerciciosDeTodoCode {
    public static void main(String[] args) {
        int[] loadNumber = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9, 10, 5, 11, 12, 1};
        ArrayList<Integer> numerosRepetidos = new ArrayList<>();
        for(int i = 0; i < loadNumber.length; i++){
            for(int j = i + 1 ;  j < loadNumber.length; j++){
               if(loadNumber[i] == loadNumber[j]){
                   if(!numerosRepetidos.contains(loadNumber[j])){
                       numerosRepetidos.add(loadNumber[j]);
                   }
               }
            }
        }
        System.out.println(numerosRepetidos);
    }
}
