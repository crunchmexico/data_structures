/* 
 * @author: @crunchmexico
 */

import javax.swing.JOptionPane;

public class escaleraAsterisks {
    /* 
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Humano dame la altura de tu pinche escalera"); 
        int altura=Integer.parseInt(texto); // Convierte el texto a entero
        for(int numAsterisko=1; numAsterisko<=altura; numAsterisko++) { // Ciclo for para imprimir la escalera
            for(int i=1; i<=numAsterisko; i++) { // Ciclo for para imprimir los asterisks
                System.out.print("*"); // Imprime asterisks
            }
            System.out.println(""); // Imprime un salto de linea
        }
    }
}
