//Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas 
// y el sistema de reportes apuntan al mismo arreglo.

public class Ejercicio_7 {
    public static void main(String[] args) {
        int[] stockProductos = {100, 50, 75, 200, 150};

        // Sistema de ventas
        int productoVendido = 2; // Producto con índice 2
        int cantidadVendida = 10;
        stockProductos[productoVendido] -= cantidadVendida;

        // Sistema de reportes
        System.out.println("Stock actualizado de productos:");
        for (int i = 0; i < stockProductos.length; i++) {
            System.out.println("Producto " + i + ": " + stockProductos[i] + " unidades");
        }
    }
}
