/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author canod
 */
public class Examen1 {
    public static void main(String[] args) {
        ArrayList<Integer> Datos = new ArrayList<Integer>();
        ArrayList<Integer> Mayores = new ArrayList<Integer>();
        int Resultado = 0;
        
        for (int i = 0; i < 8; i++) {
            int Num = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA UN DIGITO ENTERO"));
            Datos.add(Num);
            Resultado+= Datos.get(i);  
        }
        int Promedio = Resultado / Datos.size();
        
        for (int i = 0; i < Datos.size(); i++) {
            if (Promedio < Datos.get(i)) {
                Mayores.add(Datos.get(i));      
            }        
        }
        System.out.println(Promedio);
        System.out.println(Datos);
        
        JOptionPane.showMessageDialog(null,"LOS NUMEROS MAYORES AL PROMEDIO SON: "+Mayores);

    }

}
