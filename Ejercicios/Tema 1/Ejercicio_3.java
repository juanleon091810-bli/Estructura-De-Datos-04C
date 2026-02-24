//Un sensor industrial registra temperaturas. El sistema recibe
// Temperatura actual en Celsius (double)
//Nombre del sensor (String)
//Número de lectura (int)
//Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
//Imprime el estado del sensor con todos sus datos.

public class Ejercicio_3 {
    public static void main(String[] args) {
        double Celsius = 25.0;
        double F = (Celsius * 9/5) + 32;
        boolean enAlarma;

        System.out.println("Temperatura en Celsius: " + Celsius + "°C");
        System.out.println("Temperatura en Fahrenheit: " + F + "°F");

        if(Celsius > 80) {
            enAlarma = true;
            System.out.println("En alarma: " + enAlarma);
        } else {
            enAlarma = false;
        }
        System.out.println("En alarma: " + enAlarma);
    }
}
