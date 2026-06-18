/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author canod
 */
public class Avion {
    
    public String modeloAv;
    public String matriculaAv;
    public String colorAv;
    public double distancia;
    public double velocidad;
    public double tiempo;
    
    public Avion(){
        modeloAv = "";
        matriculaAv = "";
        colorAv = "";
        velocidad = 0.0;
        distancia = 0.0;
        tiempo = 0.0;
    }
  
    public Avion(String modeloAv, String matriculaAv, String colorAv, double velocidad, double distancia) {
        this.modeloAv = modeloAv;
        this.matriculaAv = matriculaAv;
        this.colorAv = colorAv;
        this.velocidad = velocidad;
        this.distancia = distancia;
    }
    public void setModelo(String mod2) {
        this.modeloAv = mod2;
    }

    public String getModelo() {
        return modeloAv;
    }

    public void matriculaAv(String mat2) {
        this.matriculaAv = mat2;
    }

    public String getmatriculaAv() {
        return matriculaAv;
    }

    public void setColorAv(String col2) {
        this.colorAv = col2;
    }

    public String getColoAvion() {
        return colorAv;
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
    public double calculaTiempo(){
        tiempo = distancia/velocidad;
        return tiempo;
    }
    
    public String toString (){
        return "\nMODELO "+modeloAv+" , \ncon matricula: "+matriculaAv+" \ny de color "
                +colorAv+" \ntiene una velocidad promedio de "+velocidad+"kms/h"+
                " \ny le lleva "+tiempo+" horas ir de A a B ";
    }
}
