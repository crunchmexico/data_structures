/**
 * @author crunchmexico
 * Problema: Si yo me emborracho con 2 litros de cerveza y un vaso mide 6cm de diametro y 10cm de alto.
 * Cuantos vasos debo tomar para emborracharme? 
 * Sabiendo que la formula del volumen de un cilindro es: V = PI * r^2 * h.  r=d/2
 */

 import java.util.Scanner;

public class volCilindro {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entra=new Scanner(System.in);
        System.out.println("Diametro del vaso=");
        float diametro=entra.nextFloat();
        System.out.println("Altura del vaso=");
        float altura=entra.nextFloat();;
        double volumen=0;
        float pi=3.1416f;
        float radio=diametro/2;
        volumen = pi*Math.pow(radio, 2)*altura;
        System.out.println("El volumen de un vaso de cerveza es: "+volumen);
        System.out.println("Con cuantos litros te emborrachas?");
        float litros=entra.nextFloat();
        float mililitrosParaEmborracharse = litros*1000;
        double limiteVasos=mililitrosParaEmborracharse/volumen;
        double vasosRedondeado=Math.ceil(limiteVasos);
        System.out.println("Yo me emborracho con "+vasosRedondeado+" vasos de cerveza");
        entra.close();
    }
}