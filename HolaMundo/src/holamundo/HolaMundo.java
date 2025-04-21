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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    /**todo lo que se va a ejecutar en Main
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        /**System.out.println("escribe su edad");
        String edadStr  = scanner.nextLine();
        int edad = Integer.parseInt(edadStr);
        
        if(edad >= 18){
        System.out.println("eres mayor puedes pasar");    
        }else{
            System.out.println("eres menor no puedes pasar");
        }
        **/
        System.out.println("escribi dia de la semana");
        String diaNumString = scanner.nextLine().trim();
        int dia = Integer.parseInt(diaNumString);
        String diaString;
        switch(dia){
            case 1: diaString = "lunes";
            break;
            case 2: diaString = "martes";
            break;
            case 3:diaString="miercoles";
            break;
            case 4: diaString="jueves";
            break;
            case 5:diaString="viernes";
            break;
            default: diaString="dia no valido compa";
            break;
        }
        System.out.println("el dia selecccionado es " + diaString);
        scanner.close(); 
        //Object obj = 20 ; // se puede declarar directamente
        //System.out.println(obj.getClass()); // typeof en Java
        //int year = 2001;
    }
}


















































