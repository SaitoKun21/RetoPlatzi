/*
Instrucciones: llegaste a una fiesta con X cantidad de rebanadas de pizza
(indicadas por el usuario), después de un rato se consumió Y cantidad de
rebanadas y quedan Z. Fácil ¿cierto?
El reto está en que expreses lo que sucede en una forma comprensible para
cualquier persona, imprescindible pensar en tus usuarios.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto06 {

    public static void main(String[] args) {

        //Este es el código
        int x, y, z;

        x = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuántas rebanadas de pizza llegaste a la fiesta?"));
        y = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas rebanadas se consumieron?"));

        if (y < x) {
            z = x - y;
            JOptionPane.showMessageDialog(null, "Llegaste con " + x + " rebanadas de pizza."
                    + "\nSe comieron " + y + " rebanadas."
                    + "\nPor lo tanto te quedan " + z + " rebanadas.");
        } else if (y == x) {
            JOptionPane.showMessageDialog(null, "Llegaste con " + x + " rebanadas de pizza."
                    + "\nSe comieron " + y + " rebanadas."
                    + "\nPor lo tanto no te quedan rebanadas.");
        } else {
            JOptionPane.showMessageDialog(null, "Llegaste con " + x + " rebanadas de pizza."
                    + "\nPor lo tanto es imposible que se comieran " + y + " rebanadas.");
        }

    }
}
