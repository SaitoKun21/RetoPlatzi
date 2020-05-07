/*
Instrucciones: añadiendo un extra al reto anterior ahora el usuario ingresará 3
números, sumarás los 2 primeros y el resultado será multiplicado por el tercero.
Añade las consideraciones del punto decimal del reto anterior.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto05 {

    public static void main(String[] args) {

        //Este es el código
        double numero1, numero2, numero3, resultado;
        int decimales;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número:"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tercer número:"));

        resultado = numero1 + numero2;
        resultado *= numero3;

        decimales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos decimales desea en el resultado?"));

        resultado = Reto04.formatearDecimales(resultado, decimales);

        JOptionPane.showMessageDialog(null, "El resultado de"
                + " (" + numero1 + " + " + numero2 + ") * " + numero3
                + " es " + resultado);

    }
}
