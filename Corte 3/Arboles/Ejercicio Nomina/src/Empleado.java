public class Empleado {

    long cedula;
    String nombreCompleto;
    String cargo;
    double salario;

    Empleado derecha;
    Empleado izquierda;

    public Empleado(long cedula, String nombreCompleto, String cargo, double salario) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.salario = salario;
        this.derecha = null;
        this.izquierda = null;
    }
}
