/* 
 * @author: crunchmexico
 * Identificar si una palabra es un palindromo.
 */

import javax.swing.JOptionPane;

public class palindromo {
    /* 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Humano!!! Escribe un palindromo");
        int longitud=texto.length();
        char [] letras=new char[longitud];
        char [] letrasInv=new char[longitud];
        int inverso=longitud;
        boolean igual=true;
        for(int i=0; i<longitud; i++) {
            letrasInv[i]=texto.toLowerCase().charAt(inverso-1);
            inverso--;
            letras[i]=texto.toLowerCase().charAt(i);
            if(letrasInv[i]!=letras[i]) {
                igual=false;
                break;
            }
        }
        if(igual==false) {
            System.out.println("Humano estupido!!! "+ texto +" no es un palindromo");
        }
        else {
            System.out.println("Bien jugado Humano!!! "+ texto +" Si es un palindromo");
        }
    }
}
