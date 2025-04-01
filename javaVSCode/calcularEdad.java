import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author crunchmexico
 * Problema: Calcular la edad de una persona de acuerdo a su fecha de naciemiento.
 */

 public class calcularEdad {
 
        /**
         * @param args
         */
        public static void main(String[] args) {
            Calendar fechaNac = new GregorianCalendar(1979,06,19);
            Calendar fechaHoy = Calendar.getInstance(); //Fecha actual del sistema
            int anoNac = fechaNac.get(Calendar.YEAR);
            int anoHoy = fechaHoy.get(Calendar.YEAR);
            int edad = anoHoy - anoNac;
            System.out.println("Tu edad es: "+edad+" años");
        }
 }