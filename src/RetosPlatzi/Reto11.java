/*
Instrucciones: pide al usuario ingresar un número mayor a 1000 y otro menor a 100.
Indica de una forma sencilla de entender al usuario cuantas veces cabe el número
menor a 100 en el número mayor a 1000.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto11 {

    public static void main(String[] args) {

        //Este es el código
        int numero1, numero2, veces;

        do {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número mayor a 1000."));
            if (numero1 <= 1000) {
                JOptionPane.showMessageDialog(null, "Este número no es mayor a 1000.");
            }
        } while (numero1 <= 1000);

        do {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número menor a 100."));
            if (numero2 >= 100) {
                JOptionPane.showMessageDialog(null, "Este número no es menor a 100.");
            }
        } while (numero2 >= 100);

        veces = Math.floorDiv(numero1, numero2);
        JOptionPane.showMessageDialog(null, "El número " + numero2 + " cabe en el número " + numero1 + ", " + veces + " veces.");

    }
}
