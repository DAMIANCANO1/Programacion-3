/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import javax.swing.JOptionPane;

/**
 *
 * @author canod
 */
public class Arreglos {

    public static void main(String[] args) {
        int arr[] = new int[6];
        
        int contador = 1;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = contador;
            contador ++;
        }

        int Dato = Integer.parseInt(JOptionPane.showInputDialog(null, "El arreglo es: " + ImprimirArr(arr)+ "\n Ingrese el nuevo dato entero a cambiar"));
        int Posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "En que posicion desea agregar?"));
        if (Posicion <= arr.length) {
            arr[Posicion] = Dato;
            JOptionPane.showMessageDialog(null, "el arreglo con la posicion " + Posicion + "modificada es" + ImprimirArr(arr));
        } else {
            return;
        }
    }
    
    public static String ImprimirArr(int arr[]) {
        String Mensaje="";
        for (int i = 0; i < arr.length; i++) {
            String ArregloTotal = String.valueOf(arr[i]);
            Mensaje = Mensaje +" "+ ArregloTotal;
        }
        return Mensaje;
    }

}
