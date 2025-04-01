import java.util.Scanner;

/**
 * @author crunchmexico
 * Problema: Condicionales (Sentencia if, else)
 */

public class condicionales2 {
    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int numUser,numSis;
        numSis = (int) (Math.random()*10); //Genera un numero aleatorio entre 0 y 9 
        System.out.println("Ingresa un numero mayor o igual a este numero "+numSis+": ");
        numUser = entra.nextInt();
        if (numUser > numSis || numUser == numSis) { // || significa "o"
        // if (numUser >= numSis) { "Esto seria lo mismo que la linea anterior"
            
            System.out.println("Muy bien, adivinaste el numero");
        } 
        
        else { //Tambien podemos usar la sentencia if(numUser != numSis)
            System.out.println("Muy mal"); 
        }
        entra.close(); //Cierra el objeto Scanner
     }
}
