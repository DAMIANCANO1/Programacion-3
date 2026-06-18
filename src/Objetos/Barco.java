/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author canod
 */
public class Barco {

    public String NombreB;
    public String idcapitanB;
    public String colorB;
    public double distancia;
    public double velocidad;
    public double tiempo;

    public Barco() {
        NombreB = "";
        idcapitanB = "";
        colorB = "";
        velocidad = 0.0;
        distancia = 0.0;
        tiempo = 0.0;
    }

    public Barco(String NombreB, String idcapitanB, String colorB, double velocidad, double distancia) {
        this.NombreB = NombreB;
        this.idcapitanB = idcapitanB;
        this.colorB = colorB;
        this.velocidad = velocidad;
        this.distancia = distancia;
    }

    public void setModelo(String nom2) {
        this.NombreB = nom2;
    }

    public String getModelo() {
        return NombreB;
    }

    public void matriculaAv(String id2) {
        this.idcapitanB = id2;
    }

    public String getmatriculaAv() {
        return idcapitanB;
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
        return "\nEl nombre del baarco " + NombreB + ",\nCon id de capitan: " + idcapitanB + " \nDe color "
                + colorB + " \nTiene una velocidad promedio de " + velocidad + "kms/h"
                + " \nle lleva " + tiempo + " horas ir de A a B ";
    }
}
