/* 
 * Author: @crunchmexico
 * Programa que muestra el uso de la sentencia while
 */

import java.util.Scanner;

public class cicloWhile {
/* 
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        //El codigo de abajo muestra los numeros del 1 al 10
        /* int i = 1;
        while (i <= 10) {
            System.out.println("i = "+i);
            i = i + 1;
        } */

        //El codigo de abajo muestra los numeros del 10 al 1
        /* int i = 10;
        while (i >= 1) {
            System.out.println("i = "+i);
            i = i - 1;
        } */

        // Ahora hacemos un programa con interaccion del usuario, que el usario ingrese un valor.
        /* Scanner entra = new Scanner(System.in);
        System.out.println("Cuantas veces quiere que se repita el ciclo?");
        int repeticiones = entra.nextInt();
        int i = 1;
        while (i <= repeticiones) {
            System.out.println("i = "+i);
            i++; //i = i + 1;
        }
        entra.close(); */

        // Ahora que el programa repita el ciclo de 2 unidades en 2 unidades.
        Scanner entra = new Scanner(System.in);
        System.out.println("Cuantas veces quiere que se repita el ciclo?");
        int repeticiones = entra.nextInt();
        int i = 1;
        while (i <= repeticiones) {
            System.out.println("i = "+i);
            i=i+2; // Repite el ciclo de 2 en 2
        }
        entra.close();
    }
}
