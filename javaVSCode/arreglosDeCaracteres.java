/* 
 * @autor: crunchmexico
 */

import javax.swing.JOptionPane;

public class arreglosDeCaracteres {
    /* 
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Humano!!! Escribe un texto");
        int longitud=texto.length(); // Obtiene la longitud del texto
        char[] caracteres=new char[longitud]; // Crea un arreglo de caracteres con la longitud del texto
        int inverso=longitud; // Variable para imprimir el texto al reves
        for(int i=0;i<longitud;i++) { // Ciclo for para guardar los caracteres del texto en el arreglo
            caracteres[i]=texto.charAt(inverso-1); // Guarda los caracteres del texto en el arreglo
            inverso--; // Decrementa la variable inverso
            System.out.println(inverso);
        }
        System.out.println(caracteres); // Imprime el texto al reves
    }
}
