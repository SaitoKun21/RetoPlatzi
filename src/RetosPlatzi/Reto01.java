/*
Instrucciones: este es un clásico de clásicos, pero haremos un pequeño cambio.
En lugar de solo imprimir un mensaje en pantalla, pedirás al usuario que digite
un nombre y mostrarás en pantalla lo siguiente: Hola, [nombre]
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto01 {

    public static void main(String[] args) {

        //Este es el código
        String nombre;
        nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);

    }

}
