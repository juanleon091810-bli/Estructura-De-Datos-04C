public class Editor {

    Capa capaActiva;
    Capa capaAnterior;

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
}
