/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el área asignada:");
            String areastring = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

            double repositor = 15890.0;
            double cajero = 25630.89;
            double supervisor = 35560.20;

            switch (areastring) {
                case "repositor" -> {
                    repositor += repositor * 0.10;
                    System.out.printf("Sueldo del repositor con bono: $%.2f%n", repositor);
                }
                case "cajero" ->
                    System.out.printf("Sueldo del cajero: $%.2f%n", cajero);
                case "supervisor" -> {
                    supervisor -= supervisor * 0.11;
                    System.out.printf("Sueldo del supervisor con descuento: $%.2f%n", supervisor);
                }
                default ->
                    System.out.println("Dato no válido para el sector");
            }
        }
    }

}
