package p2.unidad.pkg1semana.pkg3clase.pkg8ejercicio.pkg2;
import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class P2Unidad1Semana3Clase8Ejercicio2 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        System.out.println("Ingrese el numero");
        int numero;
        numero = ingresar.nextInt ();
        for(int i = 1; i<10; i++){
            System.out.println (numero +" * " + i + " = " + numero * i);
        }
        
    }
    
}
