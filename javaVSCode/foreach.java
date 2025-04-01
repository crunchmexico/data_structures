/* 
 * @author: crunchmexico
 * for mejorado
 */
public class foreach {
    /* 
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        /* String [] perros={"Monte","Chupacabras","Solovino","Chimuelo"}; // Arreglo de cadenas
        for(int i=0;i<4;i++) { // Ciclo for para imprimir los elementos del arreglo
            System.out.println(perros[i]); // Imprime los elementos del arreglo
        } */

        // Si se van a recorrer todos los elementos de un arreglo, se puede utilizar el for mejorado
        /* String [] perros={"Monte","Chupacabras","Solovino","Chimuelo","La wera","El chiquito"}; // Arreglo de cadenas
        for(int i=0;i<perros.length;i++) { // Ciclo for para imprimir los elementos del arreglo
            System.out.println(perros[i]); // Imprime los elementos del arreglo
        } */

        // El for mejorado es mas eficiente que el for normal
        /* String [] perros={"Monte","Chupacabras","Solovino","Chimuelo","La wera","El chiquito"}; // Arreglo de cadenas
        for(String perro:perros){ // Ciclo for para imprimir los elementos del arreglo
            System.out.println(perro); // Imprime los elementos del arreglo
        } // La desventaja del for mejorado es que no se puede acceder a la posicion de los elementos del arreglo (no se puede utilizar el indicec o iteracion) */

        // La iteracion nos podria servir para enumerar a nuestros perros
        String [] perros={"Monte","Chupacabras","Solovino","Chimuelo","La wera","El chiquito"}; // Arreglo de cadenas

        for(int i=0;i<perros.length;i++) { // Ciclo for para imprimir los elementos del arreglo
            System.out.println((i+1)+" "+perros[i]); // Imprime los elementos del arreglo
        }
        System.out.println("___________________________________"); // Imprime un salto de linea
        int i=1; // Variable para enumerar a los perros
        for(String perro:perros){ // Ciclo for para imprimir los elementos del arreglo
            System.out.println(i+" "+perro); // Imprime los elementos del arreglo
            i++; // Incrementa la variable i
        }    
    }
} 