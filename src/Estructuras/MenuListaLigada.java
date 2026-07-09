/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author canod
 */
public class MenuListaLigada {
    
    public static void main(String[] args) {
        while (true) {
            int tamal = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa una opcion: \n 1. Lista simple\n 2.Lista con objetos"
                    + "\n 0. Salir"));
            
            switch (tamal) {
                //caso 1 listas simples.
                case 1:
                    int opcionS = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa la opcion a realizar "
                            + "\n 1. String "
                            + "\n 2. Integer"
                            + "\n 3. double "));
                    break;

                //caso 2 lista con objetos     
                case 2:
                    break;

                //caso 0 para salir del menu     
                case 0:
                    break;
                
                default:
                
            }
            
        }
        
    }
    
    public void ListaSimple(int opcionS) {
    }
    
}
