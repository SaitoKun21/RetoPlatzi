/*
Instrucciones: escribe un programa al que le indiques una cantidad de días y
como resultado deberá mostrar cuantas horas, minutos y segundos hay en dicha
cantidad de días.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto09 {

    public static void main(String[] args) {

        //Este es el código
        int dias, horas, minutos, segundos;

        dias = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad de días."));

        horas = dias * 24;
        minutos = horas * 60;
        segundos = minutos * 60;

        JOptionPane.showMessageDialog(null, "En " + dias + " dias hay:"
                + "\n - " + horas + " horas"
                + "\n - " + minutos + " minutos"
                + "\n - " + segundos + " segundos");
    }
}
