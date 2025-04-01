/* 
 * @author: Crunchmexico
 * Programa que muestre lo siguiente:
 * Si los tres dados son seis, mostrr el mensaje "Excelente".
 * Si dos dados son seis, mostrar el mensaje "Muy bien".
 * Si un dado es seis, mostrar el mensaje "Regular".
 * Si ningun dado es seis, mostrar el mensaje "Pesimo".
 */
import java.util.Random;

public class juegoAzar {
    /* 
     * @parag args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int d1 = rand.nextInt(6)+1;
        int d2 = rand.nextInt(6)+1;
        int d3 = rand.nextInt(6)+1;
        System.out.println("Dado 1= "+d1);
        System.out.println("Dado 2= "+d2);
        System.out.println("Dado 3= "+d3);
        if (d1 == 6 && d2 == 6 && d3 == 6) {
            System.out.println("Excelente");
        }
        else if (d1 == 6 && d2 == 6 || d1 == 6 && d3 == 6 || d2 == 6 && d3 == 6) {
            System.out.println("Muy bien");
        }
        else if (d1 == 6 || d2 == 6 || d3 == 6) {
            System.out.println("Regular");
        }
        else if (d1!=6 && d2!=6 && d3 != 6) {
            System.out.println("Pesimo");
        }
        
    }    
     
}
