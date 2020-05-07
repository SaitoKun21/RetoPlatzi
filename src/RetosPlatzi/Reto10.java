/*
Instrucciones: hay 1.609344 km en una milla (mi). Escribe un programa en el que
el usuario indique una cantidad de millas y muestre en pantalla el resultado
convertido a kilómetros.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto10 {

    public static void main(String[] args) {
        double mi, km;

        mi = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las millas"));

        km = mi * 1.609344;

        JOptionPane.showMessageDialog(null, "Hay " + km + " kilómetros en " + mi + " millas.");
    }
}
