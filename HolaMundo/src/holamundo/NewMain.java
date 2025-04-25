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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ingrese su dni");
            String dni = scanner.nextLine();
            System.out.println("ingrese nombre");
            String nombre = scanner.nextLine();
            if(dni.equals("0") && nombre.equals("fin")){
                break;
            }
            System.out.println("ingrese su edad");
            int edad = scanner.nextInt();
            scanner.nextLine();
            if (edad >= 6 && edad <= 10) {
                System.out.println("Categoria: Menores A");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("Categoria: Menores B");
            } else if (edad >= 18 && edad <= 30) {
                System.out.println("Categoria: Juveniles");
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("Categoria: Adultos");
            } else if (edad >= 50) {
                System.out.println("Categoria: Adultos Mayores");
            }else{
                System.out.println("No entra en ninguna categoria");
            }
        }
        System.out.println("Fin de las inscripciones.");
    }

}
