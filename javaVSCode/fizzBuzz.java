/* 
 * @author: crunchmexico
 * Escribe un programa que muestre por consola (con un print) los
 * numeros de 1 a 100 (ambos incluidos y con un salto de linea entre
 * cada impresion), sustituyendo los siguientes:
 * -Multiplos de 3 por la palabra "fizz".
 * -Multiplos de 5 por la palabra "buzz".
 * -Multiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class fizzBuzz {
    public static void main(String[] args) {
        for(int i=1; i<=500; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if(i % 3 == 0) {
                System.out.println("fizz");
            } else if(i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
