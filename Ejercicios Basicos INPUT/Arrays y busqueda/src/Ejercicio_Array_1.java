//Un cajero escanea un producto con el código de barras 770123. 
//El sistema tiene un arreglo desordenado con los códigos de los 
//productos disponibles en la estantería actual.
//El Problema: Debes recorrer la lista para verificar si el producto 
//existe y en qué posición de la estantería se encuentra.
//Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los 
//productos en la estantería no tienen un orden numérico específico

import java.util.Scanner;

public class Ejercicio_Array_1 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int[] productos = {123456, 654321, 770123, 987654, 321654};
        int contador = 0;

        System.out.println("Ingrese el código del producto que desea buscar:");
        int codigo = scanner.nextInt();

        for(int i = 0; i <productos.length; i++){
            if(productos[i] == codigo){
                System.out.println("El producto con código " + codigo + " se encuentra en la posición: " + i + " de la estantería.");
                break;
            }
            if(codigo != productos[i]){
                contador++;
            }
        }
        if(contador == productos.length){
            System.out.println("El producto con código " + codigo + " no existe dentro de la estantería.");
        }
        scanner.close();
    }
}
