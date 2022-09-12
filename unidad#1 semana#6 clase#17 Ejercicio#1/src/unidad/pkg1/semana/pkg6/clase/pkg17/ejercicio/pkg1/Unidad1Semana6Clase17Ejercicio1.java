package unidad.pkg1.semana.pkg6.clase.pkg17.ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class Unidad1Semana6Clase17Ejercicio1 {

    public static void main(String[] args) {
    String nombre,clave;
    Scanner entrada = new Scanner (System.in);
    System.out.print("Igrese Nombre de usuario: ");
    nombre = entrada.nextLine ();
    System.out.print("Igrese Clave de usuario: ");
    clave = entrada.nextLine ();
    if(nombre.equals ("monica") && clave.equals("123456")) {
    System.out.println("Bienvenida al sistema");
    }
    else {
    System.out.println("Nombre de Usuario o contraseña incorrecto");
    }
    }
    
}
