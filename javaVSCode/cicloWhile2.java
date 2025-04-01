/* 
 * Author: @Crunchmexico
 */

import java.util.Scanner;

public class cicloWhile2 {
/* 
 * @param args the command line arguments
 */
    public static void main (String[] args) {
        Scanner entra = new Scanner(System.in);
        int repeticiones;
        do {
            System.out.println("Cuantas veces quiere que se repita el ciclo?");
            repeticiones = entra.nextInt();
            if (repeticiones < 0) {
                System.out.println("No se aceptan numeros negativos. Intenta de nuevo.");
            }
        }while (repeticiones < 0);

        int i = 1;
        while (i <= repeticiones) {
            System.out.println("i = "+i);
            i=i+2; // Repite el ciclo de 2 en 2
        }
        entra.close();
    }
}
