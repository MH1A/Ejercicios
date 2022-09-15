package p2.unidad.pkg1semana.pkg7clase.pkg20ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Monica
 */
public class P2Unidad1Semana7Clase20Ejercicio1 {
    public static void main(String[] args) {
        String menu = "Elija una opción: 1, 2, 3 o 4 \n";
        for (int i= 1; i<=4; i++) {
            menu = menu + " opción " + i + "\n";
        }
        String option = JOptionPane.showInputDialog(menu);
        switch (option) {
            case "1":
                JOptionPane.showMessageDialog (null, "Felicitaciones, ha elegido la opción 1");
                break;
            case "2":
                JOptionPane.showMessageDialog (null, "Felicitaciones, ha elegido la opción 2");
                break;  
            case "3":
                JOptionPane.showMessageDialog (null, "Felicitaciones, ha elegido la opción 3");
                break;
            case "4":
                JOptionPane.showMessageDialog (null, "Felicitaciones, ha elegido la opción 4");
                break;
            default:
                JOptionPane.showMessageDialog (null, " no es una opción válida");
                break;
        }
    }
    
}
