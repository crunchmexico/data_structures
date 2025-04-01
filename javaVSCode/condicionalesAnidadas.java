/* 
 * @author crunchmexico
 * Ejercicio: Condicionales anidadas
 */

import java.util.Scanner;

public class condicionalesAnidadas {
    /* 
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        Scanner entra =  new Scanner (System.in);
         System.out.println("Ingresa un numero entre 1 y 9,999");
         int num = entra.nextInt();
         if (num > 0 && num < 10) {
            System.out.println("Tu numero es una unidad");
         }
            else {
                if (num >= 10 && num < 100) {
                    System.out.println("tu numero es una decena");
                }
                else {
                    if (num >= 100 && num < 1000) {
                        System.out.println("Tu numero es una centena");
                    }
                    else {
                        if (num >= 1000 && num < 10000) {
                            System.out.println("Tu numero es un millar");
                        }
                        else {
                            System.out.println("Tu numero no esta en el rango");
                        }
                    }
                }
            }
        entra.close(); //Cierra el objeto Scanner
    }
}
