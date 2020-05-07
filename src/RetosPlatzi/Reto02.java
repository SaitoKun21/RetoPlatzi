/*
Instrucciones: Ahora que sabemos incluir nombres, podemos agregar más datos.
Intentemos con un apellido para tener algo así: ``Hola, [nombre] [apellido]```
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto02 {
    
    public static void main(String[] args) {

        //Este es el código
        String nombre, apellido;
        nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
        apellido = JOptionPane.showInputDialog("Introduzca su apellido:");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + " " + apellido);
        
    }
}
