/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author canod
 */
public class Nodo <T> {
    // declarar de las variables que definen al objeto
   T value; //dato que puede guardar el nodo
   Nodo<T> next; //Enlace a otros nodos
   
   // metodo cosntructor vacio
   public Nodo(){
       value = null;
       next = null;
   }
   
   //metodo contructor parametrizado
   public Nodo(T value2){
       this.value = value2;
       next = null;
       
   }
   
   //getters and setters
   public void setValue(T value3){
       this.value = value3;
   }
   
   public T getValue(){
       return  value;
   }
   
   public void setNext(Nodo<T> next2){
       this.next = next2;
   }
    
    public Nodo <T> getNext(){
        return next;
    }
    
    //motodo String
    public String toString(){
        return value.toString();
    }
}
