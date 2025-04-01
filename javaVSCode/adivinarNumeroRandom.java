/* 
 * @author: crunchmexico
 */

import java.util.Random;

import javax.swing.JOptionPane;

public class adivinarNumeroRandom {
    /* 
     * @param args the command line arguments
     */

     public static void main(String[] args) {
       Random rand = new Random(); 
       int aleatorio = rand.nextInt(5)+1; 
       System.out.println(aleatorio); 
       int num = Integer.parseInt(JOptionPane.showInputDialog("Humano que numero estoy pensando (entre 1 y 5) digita cero para salir"));
       while (num != aleatorio && num != 0) { // Ciclo while para adivinar el numero
         num = Integer.parseInt(JOptionPane.showInputDialog("Humano estupido, te equivocaste. En que numero estoy pensando (entre 1 y 5) digita cero para salir"));
         System.out.println(aleatorio); // Imprime el numero aleatorio en consola
        }
        if (num != 0) { // Condicion para saber si el humano adivino el numero
          JOptionPane.showMessageDialog(null, "Bien jugado humano");
        } 
        else { // Condicion para saber si el humano se rindio
          JOptionPane.showMessageDialog(null, "Humano estupido, te rendiste. En numero era: " + aleatorio);
        }
    }
}
