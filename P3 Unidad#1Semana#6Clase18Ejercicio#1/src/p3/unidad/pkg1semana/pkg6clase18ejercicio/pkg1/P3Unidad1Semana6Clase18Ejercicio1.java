package p3.unidad.pkg1semana.pkg6clase18ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class P3Unidad1Semana6Clase18Ejercicio1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int i = 1;
    int potencia;
    int base; 
    int calculo = 1; 
    System.out.print("Introduzca el valor de la base: ");
    base = teclado.nextInt ();
    System.out.print("Introduzca el valor del exponente: ");
    potencia = teclado.nextInt ();
    while (i<=potencia) {
    calculo = calculo * base;
    i ++;
    }
    System.out.println("El resultado del calculo de la potencia es: "+calculo);
    
    }
    
    
}
