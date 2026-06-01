public class Impresora {

    Documento inicio;
    Documento fin;
    int totalPaginas;

    public Impresora() {
        this.inicio = null;
        this.fin = null;
        this.totalPaginas = 0;
    }

    public boolean ISEmpty(){
        return inicio == null;
    }

    public Documento peek(){
        if (ISEmpty()) {
            System.out.println("No hay documentos en la cola.");
            return null;
        }
        return inicio;
    }

    public void imprimirDocumento() {
        if (ISEmpty()) {
            System.out.println("No hay documentos para imprimir.");
            return;
        }
        Documento documentoActual = inicio;
        System.out.println("Imprimiendo: " + documentoActual.nombreArchivo + " de " + documentoActual.usuario);
        totalPaginas -= documentoActual.numeroPaginas; // Actualizar el total de páginas
        inicio = inicio.siguiente;
        if (inicio == null) {
            fin = null; 
        }
    }

    public void agregarDocumento(Documento nuevoDocumento) {
        if (inicio == null) {
            inicio = nuevoDocumento;
            fin = nuevoDocumento;
        } else {
            fin.siguiente = nuevoDocumento;
            fin = nuevoDocumento;
        }
        totalPaginas += nuevoDocumento.numeroPaginas; // Actualizar el total de páginas
    }

    public void calcularPaginasTotales() {
        System.out.println("Total de páginas en la cola de impresión: " + totalPaginas);
    }
}
