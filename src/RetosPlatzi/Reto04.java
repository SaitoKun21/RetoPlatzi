/*
Instrucciones: otro clásico conocido, donde pedirás al usuario que ingrese 2
números y muestre en pantalla el resultado. Si quieres añadir más dificultad
puedes utilizar números con punto decimal y especificar el número de decimales
después del punto.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto04 {

    public static void main(String[] args) {

        //Este es el codigo
        //Usar punto para introducir números decimales
        int decimales;
        double numero1, numero2, suma;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número:"));

        suma = numero1 + numero2;

        decimales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos decimales desea en el resultado?"));

        suma = formatearDecimales(suma, decimales);

        JOptionPane.showMessageDialog(null, "La suma es " + suma);

    }

    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

}
