package p2.unidad.pkg1semana.pkg5clase.pkg13ejercicio.pkg1;

/**
 *
 * @author Monica
 */
public class P2Unidad1Semana5Clase13Ejercicio1 {
    public static void main(String[] args) {
        String tipoDia = "";
        String diaSemana = "Martes";
        
        switch (diaSemana.toLowerCase ()) {
            case "lunes":
                tipoDia = "Inicio de semana"; 
                break;
            case "martes":
            case "miercoles":
            case "jueves":
                tipoDia = "Mediado de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin de semana";
                break;
            case "sabaso":
            case "domingo":
                tipoDia = "Fin de semana";
                break;
                
        }
        System.out.println(diaSemana + " es " + tipoDia);
        
    }
    
}
