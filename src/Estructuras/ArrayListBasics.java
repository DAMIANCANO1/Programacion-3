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
        //verificar la existencia del AL 
        JOptionPane.showMessageDialog(null, "LA AL contiene al elemento?\n"+a1.contains("HTML"));
        a1.add(2,"PROLOG");
        JOptionPane.showMessageDialog(null, a1);
        
        //recorrido de la AL con Iterator
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()){
            JOptionPane.showMessageDialog(null, itr.next());
        }
        
        //clonar AL
        ArrayList<String> copia = (ArrayList<String>) a1.clone();
        JOptionPane.showMessageDialog(null, copia);
        
        //concatenar AL 
        List<String> list = new ArrayList<String>();
        list.add("JAVA SCRIPT");
        list.add("haskell");
        //proveso de concatenar
        a1.addAll(list);
        System.out.println("la nuva AL es: \n"+a1);
        //eliminar elementos en la array list 
        copia.clear();
        JOptionPane.showMessageDialog(null,"AL COPIA:\n "+copia);
        //verificar la existencia de un conjunto de elementos 
        List<String> list2 = new ArrayList<String>();
        list2.add("JAVA");
        list2.add("PHP");
        list2.add("C++");
        JOptionPane.showMessageDialog(null, "LA AL TIENE A LOS ELEMENTOS?:"+list2 + "\n"+a1.containsAll(list2));
        
        // 13. traspasar una arraylist a un arreglo unidimensional 
        //crear el arr unidimensional 
         String arr [] = new String[a1.size()];
         // se hace el traspaso 
         a1.toArray(arr);
         String cadena="[";
         for (int i = 0; i < arr.length; i++) {
             cadena+= arr[i]+",";            
        }
         cadena += "]";
         JOptionPane.showMessageDialog(null, "el arreglo es: \n"+cadena);
         
         //14. generar sub listas apartir de una arrayL
         //Crear una lista para tomar los elementos del arrayL
         List<String> list3 = a1.subList(1, 4);
         JOptionPane.showMessageDialog(null, "la sublista es:\n"+list3);
         
         //15. sorteo de elementos
         //realizar el sorteo 
         Collections.shuffle(a1);
         JOptionPane.showMessageDialog(null, "Arr sorteo:\n"+a1);
         
         //invertir elementos en la arrayL
         Collections.reverse(a1);
         JOptionPane.showMessageDialog(null, "reverse list:\n"+a1);
         
         //17. intercambio de elemento en posiciones de la AL 
         Collections.swap(a1 ,1, 3);
         JOptionPane.showMessageDialog(null, "intercambio de elementos:\n"+a1);
        
    }
    
}
