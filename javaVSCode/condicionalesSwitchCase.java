import java.util.Scanner;

/* 
 * @author crunchmexico
 * Problema: Condicionales (Sentencia switch-case)
 */
public class condicionalesSwitchCase {
    /* 
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.println("Seleccione una ocpion\n1: Acceso\n2: Configuracion\n3: Ayuda ");
        int seleccion = entra.nextInt();
        switch (seleccion) {
        case 1:
            System.out.println("Selecionaste Acceso");
            break; //Si no ponemos break, se ejecutaran todas las sentencias que esten debajo de la seleccion
        case 2:
            System.out.println("Seleccionaste Configuracion");
            break;
        case 3:
            System.out.println("Seleccionaste Ayuda");
            break;
        default: //Si no se cumple ninguna de las condiciones anteriores, se ejecuta esta sentencia
            System.out.println("Opcion no valida");
            break;
        }
        entra.close(); //Cierra el objeto Scanner
            
     }
    
}