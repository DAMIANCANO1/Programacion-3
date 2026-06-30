/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author canod
 */
public class ListaLigada<T> {

    // variables que definen el objeto
    Nodo<T> front;

    // metodo contructor vacio
    public ListaLigada() {
        front = null;
    }

    // metodo contructor parametrizado
    public void ListaLigada(Nodo<T> front2) {
        this.front = front2;
    }

    public void setFront(Nodo<T> front3) {
        this.front = front3;
    }

    //metodo de accesores y mutadores 
    public Nodo<T> getFront() {
        return front;
    }

    //seccion de metodos para manipilatrr la LL
    public boolean isEmpty() {
        return front == null;
    }

    //metodo de obtiene la longitud de la lista ligada
    public int longitd() {
        //verificar si la ll esta vacia
        if (isEmpty()) {
            return 0;
        } else {
            //declarar un contador
            int contador = 0;
            //Posicionarse en el frente de la ll
            Nodo<T> curr = getFront();
            //recorrer la LL mediante la visita
            //a cada nodo por medio de su enlace 
            while (curr.next != null) {
                curr = curr.next;
                contador++;
            }
            //aumenta el valor del contador en 1 
            contador++;
            //devolver del valor del contador
            return contador;
        }
    }

    //metodo que agrega elemantos a la LL al inicio
    public void agregaInicio(T item) {
        //Crear un nuevo nodo con el valor recibido
        Nodo nuevoNodo = new Nodo(item);
        //Enlazar el nuevo nodo con el frente
        nuevoNodo.next = front;
        // renombrar el frente
        front = nuevoNodo;
    }

    //metodo que agrega elementos a la LL al final
    public void agregaFin(T item) {
        //crear un nuevo nodo con el valor recibido
        Nodo nuevoNodo = new Nodo(item);
        //crear un nodo que recorra LL
        Nodo<T> curr = getFront();
        //verificar si la LL esta vacia 
        if (isEmpty()) {
            setFront(nuevoNodo);

        } else {
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = nuevoNodo;
        }
    }

    //metodo toString
    public String toString() {
        //verificar si la LL esta vacia
        if (front == null) {
            return "[]";
        } else {
            //obtener el frente mediante un nodo
            Nodo<T> curr = getFront();
            //capturar el valor del frente
            String str = "[" + curr.value;
            //recorrer la lista ligada para obtener sus valores
            while (curr.next != null) {
                curr = curr.next;
                str += ", " + curr.value;
            }
            str += "]";
            return str;
        }
    }

    //metodo que elimina nodos al inicio de la lista 
    public T elimminaInicio() {
        //declarar una variable que obtenga el valor eliminado
        T temp;
        //verificar si la LL esta vacia
        if (isEmpty()) {
            return (T) new String("error");
        } else {
            //obtener el valor del frente 
            temp = front.value;
            //eliminar el Nodo cambiando el frente 
            front = front.next;
            //devolver el valor del nodo
            return temp;

        }
    }

    //metodo que elimina nodos al final de la lista
    public T eliminaFin() {
        //declarar una variable que capture el valor del nodo eliminado
        T temp;
        //verficar si la LL esta vacia 
        if (isEmpty()) {
            return (T) new String("error");

        } else {
            //verificar si la longitud es 1
            if (longitd() == 1) {
                temp = front.value;
                front = null;
                return temp;
            } else {
                Nodo<T> prev = getFront();
                Nodo<T> curr = prev.next;
                while (curr.next != null) {
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = null;
                return curr.value;
            }
        }

    }

}
