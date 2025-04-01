import java.util.Scanner;

/**
 * @author crunchmexico
 * Problema: Condicionales (Sentencia if, else)
 */

 public class condicionales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int numUser,numSis;
        numSis = (int) (Math.random()*10); //Genera un numero aleatorio entre 0 y 9 
        System.out.println("Ingresa este numero "+numSis+": ");
        numUser = entra.nextInt();
        if (numUser == numSis) { //Si el numero del usuario es igual al numero del sistema
            System.out.println("Muy bien, adivinaste el numero");
        } 

        if (numUser != numSis) {
            System.out.println("Lo siento, no adivinaste el numero");
        }
        
        /* Otra manera de hacer la ultima condicion es:

        else { //Tambien podemos usar la sentencia if(numUser != numSis)
            System.out.println("Lo siento, no adivinaste el numero"); 
        }


        */
        entra.close(); //Cierra el objeto Scanner

    }
 }
