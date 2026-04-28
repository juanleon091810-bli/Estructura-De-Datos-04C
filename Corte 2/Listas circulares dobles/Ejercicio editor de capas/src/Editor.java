public class Editor {

    Capa capaActiva;
    Capa capaAnterior;

    public Editor(){

        capaActiva = null;
        capaAnterior = null;
    }

    public void agregarCapa(Capa newCapa){
        if (newCapa == null) {
            capaActiva = newCapa;
            capaAnterior = newCapa;
            capaActiva.siguiente = capaActiva;
            capaActiva.anterior = capaActiva;
        }
        else{
            newCapa.anterior = capaAnterior;
            newCapa.siguiente = capaActiva;
            capaAnterior.siguiente = newCapa;
            capaActiva.anterior = newCapa;
            capaAnterior = newCapa;
        }
        System.out.println("Capa agregada exitosamente.");
    }

    public void subirCapa(Capa newCapa){
        if(capaActiva == null){
            capaActiva = newCapa;
            capaActiva.siguiente = capaActiva;
            capaActiva.anterior = capaActiva;
        } else {
            newCapa.siguiente = capaActiva.siguiente;
            newCapa.anterior = capaActiva;
            capaActiva.siguiente.anterior = newCapa;
            capaActiva.siguiente = newCapa;
            capaActiva = newCapa;
        }
    }

    public void bajarCapa(Capa newCapa){
        if(capaActiva == null){
            capaActiva = newCapa;
            capaActiva.siguiente = capaActiva;
            capaActiva.anterior = capaActiva;
        } else {
            newCapa.siguiente = capaActiva;
            newCapa.anterior = capaActiva.anterior;
            capaActiva.anterior.siguiente = newCapa;
            capaActiva.anterior = newCapa;
            capaActiva = newCapa;
        }
    }

    public void eliminarCapa(Capa actual){
        
        if (actual != null) {
            actual.siguiente.anterior = actual.siguiente;
            actual.anterior.siguiente = actual.anterior;
        }
        if (actual == capaActiva) {
            capaActiva = actual.siguiente;
        }
        else if (actual == capaAnterior) {
            capaAnterior = capaAnterior.anterior;
        } 
        
        System.out.println("La capa ha sido eliminada exitosamente.");
    }

    public void toggleVisibilidad(String nombre){

        if (capaActiva == null){
            System.out.println("No hay capas");
            return;
        }

        Capa capa = capaActiva;

        do {
            if (capa.nombre.equals(nombre))
            {
                capa.visible = !capa.visible;
                System.out.println("Visibilidad cambiada en " + nombre);
                return;
            }

        capa = capa.siguiente;

        } while (capa != capaActiva);

        System.out.println("Capa no encontrada");
    }

    public void mostrarCapas(Editor newEditor){

        if (newEditor.capaActiva == null) {
            System.out.println("No hay capas para mostrar");
            return;
        }

        Capa capa = newEditor.capaActiva;
        int contador = 0;

        do {
            System.out.println("Capa numero " + contador + " >> " + capa);
            capa = capa.siguiente;
            contador++;
        } while (capa != newEditor.capaActiva);
    }
}
