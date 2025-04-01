import java.util.Scanner;

/* 
 * @author crunchmexico
 * Problema: Condicionales (Sentencia switch-case)
 */
public class condicionalesString {
    /* 
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        /* System.out.println("Escribe una ocpion\nAcceso\nConfiguracion\nAyuda ");
        String seleccion = entra.nextLine(); //nextLine() lee una cadena de caracteres
        seleccion = seleccion.toLowerCase(); //Convierte la cadena de caracteres a minusculas
        switch (seleccion) { //En este caso, la variable seleccion es de tipo String
        case "acceso": 
            System.out.println("Selecionaste Acceso");
            break; //Si no ponemos break, se ejecutaran todas las sentencias que esten debajo de la seleccion
        case "configuracion": 
            System.out.println("Seleccionaste Configuracion");
            break;
        case "ayuda": 
            System.out.println("Seleccionaste Ayuda"); //Si la variable se escribio con mayusculas, no se ejecutara esta sentencia amenos que usemos toLowerCase() o toUpperCase()
            break;
        default: //Si no se cumple ninguna de las condiciones anteriores, se ejecuta esta sentencia
            System.out.println("Opcion no valida"); 
            break;
        } */
        System.out.println("Saludame por favor");
        String respuesta = entra.nextLine();
        respuesta = respuesta.toLowerCase();
        if(respuesta.equals("hola")==true) {
            System.out.println("Hola, como estas?");
        }
        else {
            System.out.println("No te entiendo");
        }
        entra.close(); //Cierra el objeto Scanner
            
     }
    
}