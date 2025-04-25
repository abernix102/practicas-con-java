/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/*

  @author nahue
 */
public class arborNatividad {

    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here}
        int altura = 5;
       for(int i =1; i <= altura; i++){
           //espacios determina la cantidad de espacios
           for(int j = 0; j < altura - i; j++){
               System.out.print(" ");
           }
           for(int k =0; k < ( 2 * i - 1); k ++){
               System.out.print("*");
           }
            System.out.println();
       }
        for( int i = -1; i <  altura - i; i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
