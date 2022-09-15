package p3.semana.pkg7clase.pkg21ejercicio.pkg1;

/**
 *
 * @author Monica
 */
public class P3Semana7Clase21Ejercicio1 {
    public static void main(String[] args) {
        double dinero = 1000;
        int mes = 1;
        while (mes<=12) {
            dinero = dinero * 1.02;
            mes++;
        }
        System.out.println(dinero);
    }
    
}
