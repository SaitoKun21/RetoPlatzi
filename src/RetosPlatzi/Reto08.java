/*
Instrucciones: vas con tus amigos a tu restaurante favorito y acuerdan dividir
la cuenta. Para facilitar las cosa pedirás al usuario que indique el total a
pagar, entre cuantas personas se dvidirá la cuenta, porcentaje de propina a
incluir, un porcentaje de impuestos, total a pagar incluyendo propina más
impuestos y el total a pagar por cada persona.
 */
package RetosPlatzi;

import javax.swing.JOptionPane;

public class Reto08 {

    public static void main(String[] args) {

        //Este es el código
        double cuenta, propina, impuestos, total, porPersona;
        int personas;

        cuenta = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es la cuenta?"));
        personas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas son?"));
        propina = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es la propina?\n(en porcentaje)"));
        impuestos = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto son los impuestos?\n(en porcentaje)"));

        if (propina >= 0 && propina <= 100 && impuestos >= 0 && impuestos <= 100) {
            total = cuenta + cuenta * propina + cuenta * impuestos;
            porPersona = total / personas;
            JOptionPane.showMessageDialog(null, "En total se pagará " + total + " pesos."
                    + "\nCada persona pagará " + porPersona + " pesos");
        } else {
            JOptionPane.showMessageDialog(null, "La propina o los impuestos no están en porcentaje.");
        }

    }
}
