/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author canod
 */
public class LoteDeAutos {
    public static void main(String[] args) {
        //crear la AL de un tipo de objeto
        ArrayList<Automovil> a1 = new ArrayList<Automovil>();

        //anadir elementos a la AL
        Automovil auto1 = new Automovil();
        a1.add(auto1);
        Automovil auto2 = new Automovil("FORD", "PLATA", 2019, "SUV", 85.5, 400);
        a1.add(auto2);
        Automovil auto3 = new Automovil();
        auto3.setMarca("VOLSWAGEN");
        auto3.setColor("Amarillo");
        auto3.setModelo(2026);
        a1.add(auto3);
        
        System.out.println("El lote de autos es: ");
        System.out.println(a1);
        
        System.out.println();
        System.out.println("Obteniendo elemento 2");
        System.out.println(a1.get(2));


    }

}
