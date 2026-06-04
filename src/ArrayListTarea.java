
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListTarea {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("INGRESA QUE TIPO DE ARRAY DESEAS UTILIZAR");
        System.out.println(" 1: ENTERO\n 2: String\n 3: Double");

        int tipo = Integer.parseInt(enter.next());

        switch (tipo) {
            case 1:
                ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
                while (true) {
                    System.out.println("Ingresa la opcion a realizar");
                    Opciones();
                    System.out.println("30. SALIR");
                    int opEntero = enter.nextInt();
                    OpcionesInt(opEntero, listaEnteros);
                    if (opEntero == 30) {
                        break;
                    }
                }
                break;
            case 2:
                ArrayList<String> listaString = new ArrayList<String>();
                while (true) {

                    System.out.println("Ingresa la opcion a realizar");
                    Opciones();
                    int opString = enter.nextInt();

                    System.out.println("30. SALIR");
                    int opEntero = enter.nextInt();
                    OpcionesString(opString, listaString);
                    if (opEntero == 30) {
                        break;
                    }

                }
                break;

            case 3:
                ArrayList<Double> listaDouble = new ArrayList<Double>();
                while (true) {
                    System.out.println("Ingresa la opcion a realizar");
                    Opciones();
                    int opDouble = enter.nextInt();
                    System.out.println("30. SALIR");
                    int opEntero = enter.nextInt();
                    OperacionesDouble(opDouble, listaDouble);;
                    if (opEntero == 30) {
                        break;
                    }

                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void Opciones() {
        System.out.println(" 1. Añadir elementos al final(add) \n 2. Imprimir el arraylist completo"
                + "\n 3. Obtener un elemento especifico \n 4. Verificar el tamaño(size)"
                + "\n 5. Verificar si esta vacio \n 6. Verificar la existencia de un elemento"
                + "\n 7. Insertar un elemento en un indice especifico (add indice)"
                + "\n 8. Iterar sobre los elementos \n 9. Clonar el array list"
                + "\n 10. Concatenar otra coleccion \n 11. Verificar la existencia de un conjunto de elementos"
                + "\n 12. Eliminar todos los elementos \n 13. Traspasar a arreglo unidimensional"
                + "\n 14. Generar sublista \n 15. Sorteo de elementos (shuffle)"
                + "\n 16. Invertir elementos (reverse) \n 17. Intercambio de elementos (swap)");;
    }

    public static void OpcionesInt(int Op, ArrayList<Integer> lista) {
        Scanner enter = new Scanner(System.in);
        int elementosCantidad;

        switch (Op) {
            case 1:
                System.out.println("Cuantos elementos desea agregar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un numero valido positivo");
                    return;
                } else {
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar");
                        int elementoAdd = enter.nextInt();
                        lista.add(elementoAdd);
                    }
                }
                break;
            case 2:
                System.out.println("ArrayList original: " + lista);
                break;
            case 3:
                System.out.println("Ingresa el indice a buscar");
                int indice = enter.nextInt();
                System.out.println("Elemento en el índice " + indice + ":\n" + lista.get(indice));
                break;
            case 4:
                System.out.println("La longitud del ArrayList es:\n" + lista.size());
                break;
            case 5:
                System.out.println("¿El ArrayList está vacío?\n" + lista.isEmpty());
                break;
            case 6:
                System.out.println("Ingresa que elemento deseas buscar");
                int buscar = enter.nextInt();
                System.out.println("¿El ArrayList contiene " + buscar + "?\n" + lista.contains(buscar));
                break;
            case 7:
                System.out.println("En que indice desea agregar el elemento");
                int indiceElemento = enter.nextInt();
                System.out.println("Ingrese el elemento");
                int elementoIngresado = enter.nextInt();
                lista.add(indiceElemento, elementoIngresado);
                System.out.println("array nuevo " + lista);
                break;
            case 8:
                Iterator<Integer> itr = lista.iterator();
                System.out.println("\n--- Iterando elementos ---");
                while (itr.hasNext()) {
                    System.out.println("Elemento: " + itr.next());
                }
                break;
            case 9:
                ArrayList<Integer> copia = (ArrayList<Integer>) lista.clone();
                System.out.println("La copia del ArrayList contiene:\n" + copia);
                break;
            case 10:
                System.out.println("¿Cuántos elementos nuevos desea agregar para concatenar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<Integer> listaTemporal = new ArrayList<Integer>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar en la nueva lista:");
                        int elementoAdd = enter.nextInt();
                        listaTemporal.add(elementoAdd);
                    }
                    lista.addAll(listaTemporal);
                    System.out.println("El ArrayList principal ahora es: " + lista);
                }
                break;
            case 11:
                System.out.println("¿Cuántos elementos desea agregar al conjunto para verificar su existencia?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<Integer> list2 = new ArrayList<Integer>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a buscar:");
                        int elementoBuscar = enter.nextInt();
                        list2.add(elementoBuscar);
                    }
                    System.out.println("¿El ArrayList principal contiene los elementos " + list2 + "?");
                    System.out.println("Respuesta: " + lista.containsAll(list2));
                }
                break;
            case 12:
                lista.clear();
                System.out.println("Todos los elementos han sido eliminados.");
                System.out.println("ArrayList actual: " + lista);
                break;
            case 13:
                Integer arr[] = new Integer[lista.size()];
                lista.toArray(arr);
                String cadena = "[";
                for (int i = 0; i < arr.length; i++) {
                    if (i == arr.length - 1) {
                        cadena += arr[i]; // Lógica manual para no poner coma al final
                    } else {
                        cadena += arr[i] + ",";
                    }
                }
                cadena += "]";
                System.out.println("El arreglo es: \n" + cadena);
                break;
            case 14:
                if (lista.size() >= 4) {
                    List<Integer> list3 = lista.subList(1, 4);
                    System.out.println("La sublista (del índice 1 al 4) es:\n" + list3);
                } else {
                    System.out.println("No hay suficientes elementos para generar esta sublista (mínimo 4).");
                }
                break;
            case 15:
                Collections.shuffle(lista);
                System.out.println("Arreglo tras sorteo (shuffle):\n" + lista);
                break;
            case 16:
                Collections.reverse(lista);
                System.out.println("Arreglo invertido (reverse):\n" + lista);
                break;
            case 17:
                if (lista.size() >= 4) {
                    Collections.swap(lista, 1, 3);
                    System.out.println("Intercambio de elementos (índices 1 y 3):\n" + lista);
                } else {
                    System.out.println("No hay suficientes elementos para intercambiar (mínimo 4).");
                }
                break;
            default:
                System.out.println("Opción de menú no válida.");
                break;
        }
    }

    public static void OpcionesString(int Op, ArrayList<String> lista) {
        Scanner enter = new Scanner(System.in);
        int elementosCantidad;

        switch (Op) {
            case 1:
                System.out.println("Cuantos elementos desea agregar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un numero valido positivo");
                    return;
                } else {
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar");
                        String elementoAdd = enter.next();
                        lista.add(elementoAdd);
                    }
                }
                break;
            case 2:
                System.out.println("ArrayList original: " + lista);
                break;
            case 3:
                System.out.println("Ingresa el indice a buscar");
                int indice = enter.nextInt();
                System.out.println("Elemento en el índice " + indice + ":\n" + lista.get(indice));
                break;
            case 4:
                System.out.println("La longitud del ArrayList es:\n" + lista.size());
                break;
            case 5:
                System.out.println("¿El ArrayList está vacío?\n" + lista.isEmpty());
                break;
            case 6:
                System.out.println("Ingresa que elemento deseas buscar");
                String buscar = enter.next();
                System.out.println("¿El ArrayList contiene " + buscar + "?\n" + lista.contains(buscar));
                break;
            case 7:
                System.out.println("En que indice desea agregar el elemento");
                int indiceElemento = enter.nextInt();
                System.out.println("Ingrese el elemento");
                String elementoIngresado = enter.next();
                lista.add(indiceElemento, elementoIngresado);
                System.out.println("array nuevo " + lista);
                break;
            case 8:
                Iterator<String> itr = lista.iterator();
                System.out.println("\n--- Iterando elementos ---");
                while (itr.hasNext()) {
                    System.out.println("Elemento: " + itr.next());
                }
                break;
            case 9:
                ArrayList<String> copia = (ArrayList<String>) lista.clone();
                System.out.println("La copia del ArrayList contiene:\n" + copia);
                break;
            case 10:
                System.out.println("¿Cuántos elementos nuevos desea agregar para concatenar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<String> listaTemporal = new ArrayList<String>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar en la nueva lista:");
                        String elementoAdd = enter.next();
                        listaTemporal.add(elementoAdd);
                    }
                    lista.addAll(listaTemporal);
                    System.out.println("¡Colecciones concatenadas con éxito!");
                    System.out.println("El ArrayList principal ahora es: " + lista);
                }
                break;
            case 11:
                System.out.println("¿Cuántos elementos desea agregar al conjunto para verificar su existencia?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<String> list2 = new ArrayList<String>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a buscar:");
                        String elementoBuscar = enter.next();
                        list2.add(elementoBuscar);
                    }
                    System.out.println("¿El ArrayList principal contiene los elementos " + list2 + "?");
                    System.out.println("Respuesta: " + lista.containsAll(list2));
                }
                break;
            case 12:
                lista.clear();
                System.out.println("Todos los elementos han sido eliminados.");
                System.out.println("ArrayList actual: " + lista);
                break;
            case 13:
                String arr[] = new String[lista.size()];
                lista.toArray(arr);
                String cadena = "[";
                for (int i = 0; i < arr.length; i++) {
                    if (i == arr.length - 1) {
                        cadena += arr[i];
                    } else {
                        cadena += arr[i] + ",";
                    }
                }
                cadena += "]";
                System.out.println("El arreglo es: \n" + cadena);
                break;
            case 14:
                if (lista.size() >= 4) {
                    List<String> list3 = lista.subList(1, 4);
                    System.out.println("La sublista (del índice 1 al 4) es:\n" + list3);
                } else {
                    System.out.println("No hay suficientes elementos para generar esta sublista (mínimo 4).");
                }
                break;
            case 15:
                Collections.shuffle(lista);
                System.out.println("Arreglo tras sorteo (shuffle):\n" + lista);
                break;
            case 16:
                Collections.reverse(lista);
                System.out.println("Arreglo invertido (reverse):\n" + lista);
                break;
            case 17:
                if (lista.size() >= 4) {
                    Collections.swap(lista, 1, 3);
                    System.out.println("Intercambio de elementos (índices 1 y 3):\n" + lista);
                } else {
                    System.out.println("No hay suficientes elementos para intercambiar (mínimo 4).");
                }
                break;
            default:
                System.out.println("Opción de menú no válida.");
                break;
        }
    }

    public static void OperacionesDouble(int Op, ArrayList<Double> lista) {
        Scanner enter = new Scanner(System.in);
        int elementosCantidad;

        switch (Op) {
            case 1:
                System.out.println("Cuantos elementos desea agregar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un numero valido positivo");
                    return;
                } else {
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar");
                        double elementoAdd = enter.nextDouble();
                        lista.add(elementoAdd);
                    }
                }
                break;
            case 2:
                System.out.println("ArrayList original: " + lista);
                break;
            case 3:
                System.out.println("Ingresa el indice a buscar");
                int indice = enter.nextInt();
                System.out.println("Elemento en el índice " + indice + ":\n" + lista.get(indice));
                break;
            case 4:
                System.out.println("La longitud del ArrayList es:\n" + lista.size());
                break;
            case 5:
                System.out.println("¿El ArrayList está vacío?\n" + lista.isEmpty());
                break;
            case 6:
                System.out.println("Ingresa que elemento deseas buscar");
                double buscar = enter.nextDouble();
                System.out.println("¿El ArrayList contiene " + buscar + "?\n" + lista.contains(buscar));
                break;
            case 7:
                System.out.println("En que indice desea agregar el elemento");
                int indiceElemento = enter.nextInt();
                System.out.println("Ingrese el elemento");
                double elementoIngresado = enter.nextDouble();
                lista.add(indiceElemento, elementoIngresado);
                System.out.println("array nuevo " + lista);
                break;
            case 8:
                Iterator<Double> itr = lista.iterator();
                System.out.println("\n--- Iterando elementos ---");
                while (itr.hasNext()) {
                    System.out.println("Elemento: " + itr.next());
                }
                break;
            case 9:
                ArrayList<Double> copia = (ArrayList<Double>) lista.clone();
                System.out.println("La copia del ArrayList contiene:\n" + copia);
                break;
            case 10:
                System.out.println("¿Cuántos elementos nuevos desea agregar para concatenar?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<Double> listaTemporal = new ArrayList<Double>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a agregar en la nueva lista:");
                        double elementoAdd = enter.nextDouble();
                        listaTemporal.add(elementoAdd);
                    }
                    lista.addAll(listaTemporal);
                    System.out.println("¡Colecciones concatenadas con éxito!");
                    System.out.println("El ArrayList principal ahora es: " + lista);
                }
                break;
            case 11:
                System.out.println("¿Cuántos elementos desea agregar al conjunto para verificar su existencia?");
                elementosCantidad = enter.nextInt();
                if (elementosCantidad < 1) {
                    System.out.println("Ingrese un número válido positivo.");
                } else {
                    ArrayList<Double> list2 = new ArrayList<Double>();
                    for (int i = 0; i < elementosCantidad; i++) {
                        System.out.println("Ingrese el elemento a buscar:");
                        double elementoBuscar = enter.nextDouble();
                        list2.add(elementoBuscar);
                    }
                    System.out.println("¿El ArrayList principal contiene los elementos " + list2 + "?");
                    System.out.println("Respuesta: " + lista.containsAll(list2));
                }
                break;
            case 12:
                lista.clear();
                System.out.println("Todos los elementos han sido eliminados.");
                System.out.println("ArrayList actual: " + lista);
                break;

            case 13:
                Double arr[] = new Double[lista.size()];
                lista.toArray(arr);
                String cadena = "[";
                for (int i = 0; i < arr.length; i++) {
                    if (i == arr.length - 1) {
                        cadena += arr[i];
                    } else {
                        cadena += arr[i] + ",";
                    }
                }
                cadena += "]";
                System.out.println("El arreglo es: \n" + cadena);
                break;
            case 14:
                if (lista.size() >= 4) {
                    List<Double> list3 = lista.subList(1, 4); 
                    System.out.println("La sublista (del índice 1 al 4) es:\n" + list3);
                } else {
                    System.out.println("No hay suficientes elementos para generar esta sublista (mínimo 4).");
                }
                break;
            case 15:
                Collections.shuffle(lista);
                System.out.println("Arreglo tras sorteo (shuffle):\n" + lista);
                break;
            case 16:
                Collections.reverse(lista);
                System.out.println("Arreglo invertido (reverse):\n" + lista);
                break;
            case 17:
                if (lista.size() >= 4) {
                    Collections.swap(lista, 1, 3);
                    System.out.println("Intercambio de elementos (índices 1 y 3):\n" + lista);
                } else {
                    System.out.println("No hay suficientes elementos para intercambiar (mínimo 4).");
                }
                break;
            default:
                System.out.println("Opción de menú no válida.");
                break;
        }
    }
}
