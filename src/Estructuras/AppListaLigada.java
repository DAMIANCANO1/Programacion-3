/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author canod
 */
public class AppListaLigada {

    public static void main(String[] args) {
        //declarar e inicializar la LL
        ListaLigada<Integer> miLista = new ListaLigada<Integer>();
        //Imprimir lista vacia
        System.out.println("Lista 1: ");
        System.out.println("Lista vacia? \n" + miLista.toString());
        System.out.println();
        //agregar nodos a la LL 
        miLista.agregaInicio(35);
        System.out.println("Nodo al inicio: \n" + miLista.toString());
        miLista.agregaInicio(50);
        System.out.println("Nodo al inicio: \n" + miLista.toString());
        miLista.agregaFin(1);
        System.out.println("Nodo al final: \n" + miLista.toString());
        miLista.agregaFin(5);
        System.out.println("Nodo al final: \n" + miLista.toString());
        miLista.agregaIndice(5, 4);
        System.out.println("Nodo en indice:\n " + miLista.toString());

        //eliminar nodos en la LL
        System.out.println("Se elimino el nodo: " + miLista.elimminaInicio() + "\nnueva lista: \n" + miLista.toString());
        System.out.println("Se elimino el nodo: " + miLista.eliminaFin() + "\nnueva lista: \n" + miLista.toString());
        miLista.swap(1, 2);
        System.out.println("se cambio el nodo:\n" + "\n nueva lista\n" + miLista.toString());
        System.out.println("Se elimino el nodo:\n " + miLista.EliiminarIndice(1) + "\n nueva lista:\n" + miLista.toString());
        
        //LL 
        ListaLigada<Integer> miLista2 = miLista;
        if (equals(miLista, miLista2)) {
            System.out.println("LAS LISTAS SON IGUALES");
            
        }else{
            System.out.println("LAS LISTAS NO SON IGUALES");
        }

        //Lista Ligada con objetos 
        String marca = "jeep";
        String color = "Blanco";
        String tipo = "SUV";
        int modelo = 2004;
        double velocidad = 80.0, distancia = 500.0;
        Automovil coche = new Automovil(marca, color, modelo, tipo, velocidad, distancia);

        ListaLigada<Automovil> lote = new ListaLigada<Automovil>();
        lote.agregaInicio(coche);
        System.out.println("lista ligada de objetos\n");
        System.out.println(lote.toString());
    }

    public static <T extends Comparable<T>> boolean equals(ListaLigada<T> l1, ListaLigada<T> l2) {
        Nodo<T> curr = l1.getFront();
        Nodo<T> curr2 = l2.getFront();

        while (curr.next != null) {
            if (curr.getValue().compareTo(curr2.getValue()) == 0) {
                return true;

            } else {
                return false;
            }

        }
        return false;
    }

}
