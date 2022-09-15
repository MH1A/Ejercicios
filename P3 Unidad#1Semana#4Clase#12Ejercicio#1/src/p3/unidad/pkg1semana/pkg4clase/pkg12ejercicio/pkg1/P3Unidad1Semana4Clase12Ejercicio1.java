package p3.unidad.pkg1semana.pkg4clase.pkg12ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Monica
 */
public class P3Unidad1Semana4Clase12Ejercicio1 {
    public static void main(String[] args) {
        int suma = 0, cant = 0, valor, promedio;
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese el valor");
            valor= entrada.nextInt ();
            if (valor !=0){
                suma = suma + valor;
                cant = cant +1;
            }
        }  while (valor != 0);
           if (cant != 0) {
            promedio = suma / cant;
            System.out.println("El promedio es: " +promedio);
        }  else {
            System.out.println("No se ingresaron valores");
        }
    }
}

            
        
        
    
    

