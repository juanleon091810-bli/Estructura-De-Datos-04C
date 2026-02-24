//Un profesor tiene las notas de 4 estudiantes en un arreglo. 
// El coordinador recibe una referencia al mismo arreglo para revisarlas.
//El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
//Muestra que el arreglo del profesor también refleja el cambio.
//Añade comentarios explicando el concepto de referencia en memoria

public class Ejercicio_9 {

    public static void main(String[] args) {
        
        // El profesor tiene un arreglo con las notas de 4 estudiantes
        double[] notasProfesor = {2.5, 3.0, 4.0, 1.5};

        // El coordinador recibe una referencia al mismo arreglo
        double[] notasCoordinador = notasProfesor;

        // El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0
        notasCoordinador[1] = 3.0;

        // Muestra que el arreglo del profesor también refleja el cambio
        System.out.println("Notas del profesor:");
        for (int i = 0; i < notasProfesor.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasProfesor[i]);
        }
    }
}
