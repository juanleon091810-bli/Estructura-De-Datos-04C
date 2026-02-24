//Una tienda de barrio vende productos al por menor. El cajero necesita calcular:
//Precio unitario de un producto (double)
//Cantidad comprada (int)
//Descuento aplicado en porcentaje (double)
//Total a pagar después del descuento (double)
    
public class Ejercicio_2 {
    public static void main(String[] args) {
        
        double precio = 10.0;
        int cantidad = 5;
        double descuentoPorcentaje = 20.0;

        double subtotal = precio * cantidad;
        double descuento = subtotal * (descuentoPorcentaje / 100);
        double total = subtotal - descuento;

        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
        System.out.println("Total a pagar después del descuento: $" + total);
    }
}
