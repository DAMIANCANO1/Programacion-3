/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author canod
 */
public class Tren {

    public String NombreT;
    public String estacion;
    public String colorB;
    public double distancia;
    public double velocidad;
    public double tiempo;

    public Tren() {
        NombreT = "";
        estacion = "";
        colorB = "";
        velocidad = 0.0;
        distancia = 0.0;
        tiempo = 0.0;
    }

    public Tren(String NombreT, String estacion, String colorB, double velocidad, double distancia) {
        this.NombreT = NombreT;
        this.estacion = estacion;
        this.colorB = colorB;
        this.velocidad = velocidad;
        this.distancia = distancia;
    }

    public void setModelo(String nom) {
        this.NombreT = nom;
    }

    public String getModelo() {
        return NombreT;
    }

    public void matriculaAv(String est) {
        this.estacion = est;
    }

    public String getmatriculaAv() {
        return estacion;
    }

    public void setColorAv(String col2) {
        this.colorB = col2;
    }

    public String getColoAvion() {
        return colorB;
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

    //5 definir metodos que demuestren funcionalidad del objeto
    public double calculaTiempo() {
        tiempo = distancia / velocidad;
        return tiempo;
    }

    public String toString() {
        return "\nEl nombre del tren " + NombreT + ",\nsalio de la estacion: " + estacion + " \nDe color "
                + colorB + " \nTiene una velocidad promedio de " + velocidad + "kms/h"
                + " \nle lleva " + tiempo + " horas ir de A a B ";
    }
}
