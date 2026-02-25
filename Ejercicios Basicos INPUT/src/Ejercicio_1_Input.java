//Pide al usuario el nombre de un producto, la cantidad comprada y el precio unitario. 
// Calcula el subtotal, aplica un IVA del 19% y muestra el recibo con el total a pagar.
//Datos de entrada:
//nombre del producto
//cantidad
//precio unitario

import java.util.Scanner;

public class Ejercicio_1_Input {
    public static void main(String[] args) throws Exception {
        
        Scanner scaner = new Scanner(System.in);
        String nombreProducto;
        int cantidad;
        double precio;
        int iva;
        double subtotal;
        double total;

        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = scaner.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cantidad = scaner.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precio = scaner.nextDouble();
        
        subtotal = cantidad * precio;
        iva = (int) (subtotal * 19 / 100);
        total = subtotal + iva;

        scaner.close();

            System.out.println("Recibo de compra");
            System.out.println("Producto: " + nombreProducto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: " + precio);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA (19%): " + iva);
            System.out.println("Total a pagar: " + total);
        
    }
}
