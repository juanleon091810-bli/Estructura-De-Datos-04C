//Un sistema universitario necesita registrar 
// la información básica de un estudiante: nombre completo, 
// código (número entero), semestre actual, promedio acumulado y si está matriculado o no

public class Ejercicio_1 {
    public static void main(String[] args) {
        String nombreEstudiante = "María Pérez";
        int codigo = 12345;
        int semestreActual = 5;
        double promedioAcumulado = 8.5;
        boolean estaMatriculado = true;

        System.out.println("Información del estudiante:");
        System.out.println("Nombre completo: " + nombreEstudiante);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre actual: " + semestreActual);
        System.out.println("Promedio acumulado: " + promedioAcumulado);
        System.out.println("Está matriculado: " + (estaMatriculado ? "Sí" : "No"));
    }
}
