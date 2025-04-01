/* 
 * @Author: @crunchmexico
 * 
 */

import java.util.Random;

public class bucleDoWhile {
/* 
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        /* int i = 1;
        do {
            System.out.println("i = "+i);
            i++;
        }while (i <= 10); */

        /* int i = 10;
        do {
            System.out.println("i = "+i);
            i--;
        }while (i >= 1); // El ciclo se ejecuta al menos una vez, aunque la condicion sea falsa

        System.out.println("Fin del ciclo"); */

        Random rand = new Random(); // Creamos un objeto de la clase Random
        int aleatorio = rand.nextInt(5)+1; // Genera un numero aleatorio entre 1 y 5 
        System.out.println("aleatorio = "+aleatorio);
        int i = 1;
        do {
            System.out.println("i = "+i);
            i++;
        }while (i <= aleatorio); // Mientras i sea menor o igual al numero aleatorio, se ejecuta el ciclo

        System.out.println("Fin del ciclo");
    }
}
