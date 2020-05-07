/*
Instrucciones: pide al usuario que indique su nombre y su edad. Como mensaje de
salida le indicarás que edad tuvo el año pasado y cuantos años tendrá el
siguiente año.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto07 {

    public static void main(String[] args) {

        //Este es el código
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos años tienes?"));

        JOptionPane.showMessageDialog(null, nombre
                + ", el año pasado tenías " + (edad - 1) + " años"
                + " y el próximo año cumplirás " + (edad + 1) + " años");
    }
}
