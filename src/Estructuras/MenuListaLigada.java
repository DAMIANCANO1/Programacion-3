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
        boolean bandera = true;
        while (bandera == true) {
            int tamal = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa una opcion: \n 1. Lista simple\n 2.Lista con objetos"
                    + "\n 0. Salir"));

            switch (tamal) {
                //caso 1 listas simples.
                case 1:
                    MenuListaSimple();

                    break;

                //caso 2 lista con objetos     
                case 2:
                    break;

                //caso 0 para salir del menu     
                case 0:
                    bandera = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }

        }

    }

    public static void MenuListaSimple() {
        ListaLigada<String> lista = new ListaLigada<String>();
        ListaLigada<Integer> listaInt = new ListaLigada<Integer>();
        ListaLigada<Double> listaDou = new ListaLigada<Double>();
        boolean BanderaMenuSimple = true;
        while (BanderaMenuSimple == true) {

            int opcionS = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa la opcion a realizar "
                    + "\n 1. String "
                    + "\n 2. Integer"
                    + "\n 3. double "
                    + "\n 0. Atras  "));

            switch (opcionS) {
                //lista simple tipo String
                case 1:
                    System.out.println("LISTA SIMPLE STRING");
                    boolean bandera1 = true;
                    while (bandera1 == true) {
                        String op = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));
                        switch (op) {
                            case "1":
                                System.out.println("insertar");
                                String valor = (JOptionPane.showInputDialog(null, "Ingresa el valor (String)"));
                                String ind = (JOptionPane.showInputDialog(null, "Ingresa el indice"));
                                int ind1 = Integer.parseInt(ind);
                                lista.agregaIndice(valor, ind1);
                                break;

                            case "2":
                                System.out.println("swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                lista.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + lista.toString());
                                break;

                            case "3":
                                System.out.println("eliminar");
                                String indStr = JOptionPane.showInputDialog("Índice a eliminar:");
                                int indice = Integer.parseInt(indStr);
                                String eliminado = lista.EliiminarIndice(indice);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + eliminado);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "Lista actual: "+lista.toString());
                                break;
                                
                            case "0":
                                bandera1 = false;
                                break;

                        }

                    }
                case 2:
                    break;

                case 3:
                    break;
                case 0:
                    BanderaMenuSimple = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;

            }
        }
    }

}
