package p3.unidad.pkg1semana.pkg2clase.pkg6ejercicio.pkg1;
/**
 *
 * @author Monica
 */
import java.util.Scanner;
public class P3Unidad1Semana2Clase6Ejercicio1 {
    public static void main(String[] args) {
        Scanner objetoNum = new Scanner (System.in);
        Scanner objetoTexto = new Scanner (System.in);
        
        String seguir= "s";
        double num, suma; 
        int conteo = 0, primo = 0, noprimo = 0;
        
        while ("s" .equals(seguir) || "S" .equals(seguir))
        {
            System.out.println("ingresar un número positivo");
            num=objetoNum.nextInt();
            
            while(num<0)
            {
            System.out.println("ingresar un número positivo");
            num=objetoNum.nextInt ();
            }
            conteo++;
            
            if(num%2==0)
            {
                primo++;
            }
            else
            {
                noprimo++;
            }
            System.out.println("Desea ingresar otro valor, s");
            seguir=objetoTexto.next();
        }
        
        
    }
    
}
