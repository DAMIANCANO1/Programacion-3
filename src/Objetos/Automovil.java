/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author canod
 */
public class Automovil {
    //definir las caracteristicas o propiedades 
    //del objeto

    public String marca;
    public String color;
    public int modelo;
    public String tipo;
    public double velocidad;
    public double distancia;
    public double tiempo;

    //2. Definir el metodo constructor vacio. Este modelo
    //permite crear el objeto desde una aplicacion con valores
    //vacios.
    public Automovil() {
        marca = "";
        color = "";
        modelo = 0;
        tipo = "";
        velocidad = 0.0;
        tiempo = 0.0;

    }
    
    //3. definir el metodo contructor parametrizado del objeto
    //este metodo permimte crear un objetp en una aplicacion con
    //valores definidos 
    public Automovil(String marca, String color, int modelo, String tipo, double velocidad, double distancia) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.distancia = distancia;
    }

    //definir los metodos mutadores y accesores a cada variable 
    //del objetom, esto permite modificarlas o acceder a cada una 
    //de manera individual
    public void setMarca(String mar2) {
        this.marca = mar2;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String col2) {
        this.color = col2;
    }

    public String getColor() {
        return color;
    }

    public void setModelo(int mod2) {
        this.modelo = mod2;
    }

    public int getModelo() {
        return modelo;
    }

    public void setTipo(String tip2) {
        this.tipo = tip2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setVelocidad(double vel2) {
        this.velocidad = vel2;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setDistancia(double dis2) {
        this.distancia = dis2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setTiempo(double tiempo2) {
        this.tiempo = tiempo2;
    }

    public double getTiempo() {
        return tiempo;
    }
    //5 definir metodos que demuestren funcionalidad del objeto
    public double calculaTiempo(){
        tiempo = distancia/velocidad;
        return tiempo;
    }
    //6 definir un metodo de visualizacion de la informacion del objeto
    
    public String toString (){
        return "\nEL AUTO DE LA MARCA "+marca+" \nMODELO "+modelo+" , \ntipo "+tipo+" y de color "
                +color+" \ntiene una velocidad promedio de "+velocidad+"kms/h"+
                " \ny le lleva "+tiempo+" horas ir de A a B ";
    }
}
