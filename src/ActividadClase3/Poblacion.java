/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadClase3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author canod
 */
public class Poblacion {

    public static void main(String[] args) {
        ArrayList<Persona> per = new ArrayList<Persona>();
        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas personas desea modelar?"));

        for (int i = 0; i < Cantidad; i++) {
            String Nom = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona: " + i);
            String Se = JOptionPane.showInputDialog(null, "ingrese el sexo de la persona: " + i);
            int Edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la persona: " + i));
            String Crp = JOptionPane.showInputDialog(null, "Ingresa la curp de la persona: " + i);
            String Dire = JOptionPane.showInputDialog(null, "Ingrese la direccion de la persona: " + i);
            int Telef = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la persona: " + i));

            Persona pers = new Persona(Nom, Se, Edad, Crp, Dire, Telef);
            per.add(pers);

        }
        JOptionPane.showMessageDialog(null, per);

    }

}
