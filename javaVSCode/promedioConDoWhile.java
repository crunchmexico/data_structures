/* 
 * @author: crunchmexico
 */

import javax.swing.JOptionPane;

public class promedioConDoWhile {
 
    /* 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        float calificacion = 0, suma = 0, promedio = 0;
        String texto;
        do{
            texto = JOptionPane.showInputDialog("Ingresa la calificacion del semestre "+(contador+1)); // Ciclo do while para pedir las calificaciones
            System.out.println(texto); 
            if(texto != null){ // Condicion para saber si el humano ingreso una calificacion
                calificacion = Float.parseFloat(texto); // Convierte el texto a numero
                suma = suma + calificacion; // Suma las calificaciones
                contador++; // Cuenta las calificaciones
            }
        }while(texto != null); 
        if(contador > 0){ // Condicion para saber si el humano ingreso por lo menos una calificacion
            promedio = suma/contador;
            JOptionPane.showMessageDialog(null, "Promedio= "+promedio);
            if(promedio >= 6){
                JOptionPane.showMessageDialog(null, "Estas aprobado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Estas reprobado");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Humano estupido, debes de poner por lo menos una calificacion");
        }
    }
}