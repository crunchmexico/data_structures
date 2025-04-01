/* 
 * @author: crunchmexico
 * Crea una funcion que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * -La funcion recibira el mes y el año y retornara verdadero o falso.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;

public class viernes13 {
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in ).useLocale(Locale.US);
        int mes, anio;
        System.out.println("Ingresa el año: ");
        anio = sc.nextInt();
        System.out.println("Ingresa el mes: ");
        mes = sc.nextInt();
        LocalDate date = LocalDate.of( anio, mes, 13 ); //Crea un objeto de tipo LocalDate con la fecha indicada
        if(date.getDayOfWeek() == DayOfWeek.FRIDAY) { //Compara si el dia de la semana es viernes
            System.out.println("Si existe un viernes 13 en el mes y año indicados");
        }else {
            System.out.println("No existe un viernes 13 en el mes y año indicados");
        }
        sc.close();
    }
}
