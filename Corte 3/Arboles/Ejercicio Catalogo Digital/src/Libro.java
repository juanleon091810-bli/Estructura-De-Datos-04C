public class Libro {

    long ISBN;
    String titulo;
    String autor;
    int publicacion;

    Libro derecha;
    Libro izquierda;

    public Libro(long ISBN, String titulo, String autor, int publicacion){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.derecha = null;
        this.izquierda = null;
    }

    public String toString(){
        return "Libro: " + ISBN + "|" + titulo + "|" + autor + "|" + publicacion + "|";
    }
}
