package unidad.pkg1.semana.pkg5.clase.pkg15.ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class Unidad1Semana5Clase15Ejercicio1 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese la base: ");
        double base = Entrada.nextDouble ();
        System.out.println("Ingrese el exponente: ");
        double exponente = Entrada.nextDouble () ;
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: " + resultado);
    }
    
}