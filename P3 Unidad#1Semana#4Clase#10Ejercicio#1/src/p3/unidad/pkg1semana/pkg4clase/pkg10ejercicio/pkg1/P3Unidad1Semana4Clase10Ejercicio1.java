package p3.unidad.pkg1semana.pkg4clase.pkg10ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class P3Unidad1Semana4Clase10Ejercicio1 {
    public static void main(String[] args) {
   int fact=1, num, cont=1;
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Ingrese un número: ");
        num = entrada.nextInt ();
        do {
            fact = fact*cont;
            cont = cont+1;
        } while (cont<=num);
        System.out.println("El factorial es: " +fact);
        
    }
    
}

