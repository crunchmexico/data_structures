/* 
 * @author: Crunchmexico
 * Programa que muestra el rango de un numero ingresado por el usuario
 */

import java.util.Scanner;

public class rangoValoresSwitchCase {
    /* 
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.println("Selecciona un rango de numeros\n1: 1-9\n2: 10-99\n3: 100-999\n4: 1,000-9,000");
        int opcion = entra.nextInt();
        System.out.println("Ahora ingresa un numero dentro del rango que seleccionaste");
        int num = entra.nextInt();
        switch (opcion) {
        case 1:
            if (num > 0 && num < 10) {
                System.out.println("Tu numero es una unidad");
                }
            else {
                System.out.println("Opcion no valida");
                }
            break;
        case 2:
            if (num >= 10 && num < 99) {
                System.out.println("Tu numero es una decena");
                }
            else {
                System.out.println("Opcion no valida");
            }
            break;
        case 3:
            if (num >= 100 && num < 999) {
                System.out.println("Tu numero es una centena");
                }
            else {
                System.out.println("Opcion no valida");
                }
            break;
        case 4:
            if (num >= 1000 && num < 9000) {
                System.out.println("Tu numero es un millar");
                }
            else {
                System.out.println("Opcion no valida");
            }
            break;
        default:
            System.out.println("Opcion no valida");
            break;
        }
        entra.close(); //Cierra el objeto Scanner
    }
}
