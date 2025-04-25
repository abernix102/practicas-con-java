package holamundo;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosDeTodoCode {
    public static void main(String[] args) {
       /*
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
        */
        double[][] notas = new double[4][4];
        Scanner scanner = new Scanner(System.in);
        for (int f = 0; f < notas.length; f++) {
            double suma = 0;
            if (f == 0) {
                System.out.println("ingrese las 3 primeras notas del primer alumno");
            } else {
                System.out.println("ingrese las 3 notas del alumno " + (f + 1) + ".");
            }
            for (int c = 0; c < notas[f].length - 1; c++) {
                boolean notaValida = false;
                while (!notaValida) {
                    double valorDeNota = scanner.nextDouble();
                    if (valorDeNota >= 0 && valorDeNota <= 10) {
                        notas[f][c] = valorDeNota;
                        suma += valorDeNota;
                        notaValida = true;
                    } else {
                        System.out.println("❌ La nota debe estar entre 0 y 10. Ingresá de nuevo:");
                    }
                }
                notas[f][3] = Math.round((suma / 3) * 100.0) / 100.0;
            }
        }
        System.out.println(Arrays.deepToString(notas));
    }
}
