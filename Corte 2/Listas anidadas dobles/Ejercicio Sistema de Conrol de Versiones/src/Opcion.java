public class Opcion {

    Opcion actual;
    Opcion next;
    Opcion prev;

    public Opcion(){
        this.actual = null;
        this.next = null;
        this.prev = null;
    }

    public void agregarTexto(Opcion texto){
        if(actual == null){
            actual = texto;
        }else
        {
            texto.prev = actual;
            actual.next = texto;
            actual= texto;
        }
    }

    public void deshacer(Cambio newCambio){

        
    }

    public void rehacer(Cambio newCambio){


    }
}
