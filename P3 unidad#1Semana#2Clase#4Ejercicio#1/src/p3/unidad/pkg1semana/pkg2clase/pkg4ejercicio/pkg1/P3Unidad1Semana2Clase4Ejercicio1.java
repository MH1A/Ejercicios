package p3.unidad.pkg1semana.pkg2clase.pkg4ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class P3Unidad1Semana2Clase4Ejercicio1 {
    public static void main(String[] args) {
        Scanner objetoNum = new Scanner (System.in);
        int valinicial, valfinal;
        
        valinicial=8;
        System.out.println ("Multiplos de 8 hasta 500");
        
        while(valinicial<=500)
        { 
            System.out.println(valinicial+ ",");
            valinicial=valinicial+8;
        }   
    }
        
    
}
