/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ArrayListBasics {
    public static void main (String args[]){
        //crear array list
        ArrayList<String> a1 = new ArrayList<String>();
        
        //definicion de actividades basicas en la AL
        
        //1.- anadir elementos a la AL 
        a1.add("JAVA");
        a1.add("C");
        a1.add("C#");
        a1.add("C++");
        a1.add("PHP");
        a1.add("PYTHON");
        a1.add("HTML");
        
        JOptionPane.showMessageDialog(null, "La AL es: \n" + a1);
        //verificar la longitud de la AL 
        JOptionPane.showMessageDialog(null, "La longitd de la Al es \n:"+a1.size());
        
        
    }
    
}

//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
