public class Biblioteca {

    private Libro raiz;

    public Biblioteca(){
        raiz = null;
    }

    public boolean IsEmpty(){
        return raiz == null;
    }

    private Libro Registrar(Libro nodo, long ISBN, String titulo, String autor, int publicacion){

        if (nodo == null) {
            return new Libro(ISBN, titulo, autor, publicacion);
        }
        if (ISBN < nodo.ISBN) {
            nodo.izquierda = Registrar(nodo.izquierda, ISBN, titulo, autor, publicacion);
        }
        else if (ISBN > nodo.ISBN) {
            nodo.derecha = Registrar(nodo.derecha, ISBN, titulo, autor, publicacion);
        }
        else{
            System.out.println("El ID del libro ya esta registrado en la biblioteca.");
        }
        return nodo;
    }

    public void Registrar(long ISBN, String titulo, String autor, int publicacion){
        raiz = Registrar(raiz, ISBN, titulo, autor, publicacion);
    }

    private Libro Buscar(Libro nodo, long ISBN){
        if (nodo == null) return null;
        if(ISBN == nodo.ISBN) return nodo;
        
        if (ISBN < nodo.ISBN) {
            return Buscar(nodo.izquierda, ISBN);
        }
        else{
            return Buscar(nodo.derecha, ISBN);
        }
    }

    public Libro Buscar(long ISBN){
        return Buscar(raiz, ISBN);
    }

    private void InOrden(Libro nodo){
        if (nodo != null) {
           InOrden(nodo.izquierda); 
           System.out.println(" " + nodo);
           InOrden(nodo.derecha);
        }
    }

    public void InOrder(){
        if (IsEmpty()) {System.out.println("El catallogo de libros se encuentra vacio."); return;}

        System.out.println("InOrden (ISBN ascecdente): ");
        InOrden(raiz);
    }

    private Libro ImprimirCatalogo(Libro nodo){
        if (nodo != null) {
            InOrden(nodo);
            return nodo;
        }
        return null;
    }

    public void ImprimirCatalogo(){
        if (IsEmpty()) {System.out.println("El catallogo de libros se encuentra vacio."); return;}

        System.out.println("InOrden (ISBN ascecdente): ");
        ImprimirCatalogo(raiz);
    }

    public boolean existeISBN(long Isbn){
        boolean existe = Buscar(Isbn) != null;
        if (existe) {
            System.out.println("El ISBN " + Isbn + " ya existe en el catálogo.");
        }
        return existe;
    }
}
