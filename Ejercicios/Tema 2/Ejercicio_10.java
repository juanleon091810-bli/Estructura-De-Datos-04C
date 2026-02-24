//Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).
//Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
//Modifica la copia y demuestra que el original no cambia.
//Comenta la diferencia con la asignación directa.

public class Ejercicio_10 {
    public static void main(String[] args) {
        // Arreglo original con configuración de la app
        int[] configuracion = {1920, 1080, 60};

        // Creando una copia real del arreglo
        int[] copiaConfiguracion = new int[configuracion.length];
        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }

        // Modificando la copia
        copiaConfiguracion[0] = 1280; // Cambiando la resolución horizontal

        // Mostrando el arreglo original para demostrar que no cambia
        System.out.println("Configuración original:");
        for (int i : configuracion) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Mostrando la copia modificada
        System.out.println("Copia de configuración modificada:");
        for (int i : copiaConfiguracion) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
