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
        System.out.println("Nodo al final: \n"+miLista.toString());
        
        //eliminar nodos en la LL
        System.out.println("Se elimino el nodo: "+miLista.elimminaInicio()+"\nnueva lista: \n"+miLista.toString());
        System.out.println("Se elimino el nodo: "+miLista.eliminaFin()+"\nnueva lista: \n"+miLista.toString());

    }

}
