package unidad.pkg1.semana.pkg6.clase.pkg16.ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class Unidad1Semana6Clase16Ejercicio1 {
    public static void main(String[] args) {
    int n1, n2, n3;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    n1=entrada.nextInt ();
    System.out.print("Ingrese un numero: ");
    n2=entrada.nextInt ();
    System.out.print("Ingrese un numero: ");
    n3=entrada.nextInt ();
    if ((n1>n2) && (n2>n3) ) {
        System.out.println("El orden es: " +n1 +n2 +n3);
    }    
    else if ((n1>n3)&&(n3>n2)) {
      System.out.println("El orden es: " +n1 +n3 +n2);
    }
    else if ((n2>n1)&& (n3>n1)){
    System.out.println("El orden es: " +n2 +n1 +n3);
    }
    else if ((n2>n3) &&(n3>n1))
    System.out.println("El orden es: " +n2 +n3 +n1);
    }
    
}
    



