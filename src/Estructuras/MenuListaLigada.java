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
                    MenuObjetos();
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
        ListaLigada<String> lista = new ListaLigada<>();
        ListaLigada<Integer> listaInt = new ListaLigada<>();
        ListaLigada<Double> listaDou = new ListaLigada<>();

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
                                JOptionPane.showMessageDialog(null, "Lista actual: " + lista.toString());
                                break;

                            case "0":
                                bandera1 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    System.out.println("LISTA SIMPLE INTEGER");
                    boolean bandera2 = true;
                    while (bandera2 == true) {
                        String op = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));
                        switch (op) {
                            case "1":
                                System.out.println("insertar");
                                int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor (int)"));
                                int ind = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice"));
                                listaInt.agregaIndice(valor, ind);
                                break;

                            case "2":
                                System.out.println("swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaInt.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaInt.toString());
                                break;

                            case "3":
                                System.out.println("eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                int eliminado = listaInt.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + eliminado);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "Lista actual: " + listaInt.toString());
                                break;

                            case "0":
                                bandera2 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                                break;
                        }
                    }

                    break;

                case 3:
                    System.out.println("LISTA SIMPLE DOUBLE");
                    boolean bandera3 = true;
                    while (bandera3 == true) {
                        String op = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));
                        switch (op) {
                            case "1":
                                System.out.println("insertar");
                                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor (double)"));
                                int ind = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice"));
                                listaDou.agregaIndice(valor, ind);
                                break;

                            case "2":
                                System.out.println("swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaDou.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaDou.toString());
                                break;

                            case "3":
                                System.out.println("eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                double eliminado = listaDou.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + eliminado);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "Lista actual: " + listaDou.toString());
                                break;

                            case "0":
                                bandera3 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                                break;
                        }
                    }
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

    public static void MenuObjetos() {

        ListaLigada<Automovil> listaAutos = new ListaLigada<>();
        ListaLigada<Avion> listaAviones = new ListaLigada<>();
        ListaLigada<Barco> listaBarcos = new ListaLigada<>();
        ListaLigada<Tren> listaTrenes = new ListaLigada<>();

        boolean band = true;
        while (band == true) {
            String op = (JOptionPane.showInputDialog(null, "Puede elegir un objeto"
                    + "\n 1. AUTOMOVIL"
                    + "\n 2. AVION    "
                    + "\n 3. BARCO    "
                    + "\n 4. TREN     "
                    + "\n 0. atras       "));

            if (op == null) {
                break;
            }

            switch (op) {
                case "1":
                    //AUTOMOVIL
                    boolean band4 = true;
                    while (band4 == true) {
                        String opc = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));

                        switch (opc) {
                            case "1":
                                System.out.println("Insertar");
                                String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del automovil");
                                String color = JOptionPane.showInputDialog(null, "Ingrese el color del automovil");
                                String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de automovil");
                                int modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo del automovil"));
                                double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia"));
                                double velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad"));
                                Automovil coche = new Automovil(marca, color, modelo, tipo, velocidad, distancia);
                                listaAutos.agregaInicio(coche);
                                break;

                            case "2":
                                System.out.println("Swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaAutos.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaAutos.toString());
                                break;

                            case "3":
                                System.out.println("Eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                listaAutos.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + indInt);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "LISTA ACTUAL \n" + listaAutos.toString());
                                break;

                            case "0":
                                band4 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                break;

                        }

                    }

                    break;

                case "2":
                    //AVION
                    boolean band5 = true;
                    while (band5 == true) {
                        String opc = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));

                        if (opc == null) {
                            band5 = false;
                            break;
                        }

                        switch (opc) {
                            case "1":
                                System.out.println("Insertar");
                                String modeloAV = JOptionPane.showInputDialog(null, "Ingrese el modelo del avion");
                                String matriculaAV = JOptionPane.showInputDialog(null, "Ingrese la matricula del avion");
                                String colorAV = JOptionPane.showInputDialog(null, "Ingrese el color del avion");
                                double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia"));
                                double velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad"));
                                Avion av = new Avion(modeloAV, matriculaAV, colorAV, velocidad, distancia);
                                listaAviones.agregaInicio(av);
                                break;

                            case "2":
                                System.out.println("Swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaAviones.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaAviones.toString());
                                break;

                            case "3":
                                System.out.println("Eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                listaAviones.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + indInt);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "LISTA ACTUAL \n" + listaAviones.toString());
                                break;

                            case "0":
                                band5 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                break;

                        }
                    }
                    break;
                case "3":
                    //BARCO 
                    boolean band6 = true;
                    while (band6 == true) {
                        String opc = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));

                        if (opc == null) {
                            band6 = false;
                            break;
                        }

                        switch (opc) {
                            case "1":
                                System.out.println("Insertar");
                                String NombreB = JOptionPane.showInputDialog(null, "Ingrese el nombre del barco");
                                String idcapitanB = JOptionPane.showInputDialog(null, "Ingrese el id de capitan");
                                String colorB = JOptionPane.showInputDialog(null, "Ingrese el color del barco");
                                double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia"));
                                double velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad"));
                                Barco bar = new Barco(NombreB, idcapitanB, colorB, distancia, velocidad);
                                listaBarcos.agregaInicio(bar);
                                break;

                            case "2":
                                System.out.println("Swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaBarcos.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaBarcos.toString());
                                break;

                            case "3":
                                System.out.println("Eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                listaBarcos.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + indInt);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "LISTA ACTUAL \n" + listaBarcos.toString());
                                break;

                            case "0":
                                band6 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                break;

                        }
                    }
                    break;
                case "4":
                    //TREN
                    boolean band7 = true;
                    while (band7 == true) {
                        String opc = (JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar"
                                + "\n 1. Insertar"
                                + "\n 2. Cambiar"
                                + "\n 3. Eliminar"
                                + "\n 4. Mostrar"
                                + "\n 0. Atras"));

                        if (opc == null) {
                            band7 = false;
                            break;
                        }

                        switch (opc) {
                            case "1":
                                System.out.println("Insertar");
                                String NombreT = JOptionPane.showInputDialog(null, "Ingrese el nombre del tren");
                                String estacion = JOptionPane.showInputDialog(null, "Ingrese la estacion del tren");
                                String colorB = JOptionPane.showInputDialog(null, "Ingrese el color del tren");
                                double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia"));
                                double velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad"));
                                Tren trenecito = new Tren(NombreT, estacion, colorB, distancia, velocidad);
                                listaTrenes.agregaInicio(trenecito);
                                break;

                            case "2":
                                System.out.println("Swap");
                                int i1 = Integer.parseInt(JOptionPane.showInputDialog("Primer índice:"));
                                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo índice:"));
                                listaTrenes.swap(i1, i2);
                                JOptionPane.showMessageDialog(null, "Lista después del swap:\n" + listaTrenes.toString());
                                break;

                            case "3":
                                System.out.println("Eliminar");
                                int indInt = Integer.parseInt(JOptionPane.showInputDialog("Índice a eliminar:"));
                                listaTrenes.EliiminarIndice(indInt);
                                JOptionPane.showMessageDialog(null, "Eliminado: " + indInt);
                                break;

                            case "4":
                                System.out.println("Mostrar");
                                JOptionPane.showMessageDialog(null, "LISTA ACTUAL \n" + listaTrenes.toString());
                                break;

                            case "0":
                                band7 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                break;

                        }
                    }
                    break;
                case "0":
                    band = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }

        }
    }

}
