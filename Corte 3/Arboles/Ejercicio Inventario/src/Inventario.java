public class Inventario {

    Repuesto raiz;

    public Inventario() {
        this.raiz = null;
    }

    private Repuesto AgregarRepuesto(Repuesto nodo, int codigoRef, String descripcion, String marca, int stock) {
        if (nodo == null) {
            return new Repuesto(codigoRef, descripcion, marca, stock);
        }
        if (codigoRef < nodo.codigoRef) {
            nodo.left = AgregarRepuesto(nodo.left, codigoRef, descripcion, marca, stock);
        } else if (codigoRef > nodo.codigoRef) {
            nodo.right = AgregarRepuesto(nodo.right, codigoRef, descripcion, marca, stock);
        }
        return nodo;
    }

    public void AgregarRepuesto(int codigoRef, String descripcion, String marca, int stock) {
        this.raiz = AgregarRepuesto(this.raiz, codigoRef, descripcion, marca, stock);
    }

    private Repuesto BuscarRepuesto(Repuesto nodo, int codigoRef) {
        if (nodo == null || nodo.codigoRef == codigoRef) {
            return nodo;
        }
        if (codigoRef < nodo.codigoRef) {
            return BuscarRepuesto(nodo.left, codigoRef);
        } else {
            return BuscarRepuesto(nodo.right, codigoRef);
        }
    }

    public Repuesto BuscarRepuesto(int codigoRef){
        return BuscarRepuesto(raiz, codigoRef);
    }

    private Repuesto ContarHojas(Repuesto nodo) {
        if (nodo == null) {
            return null;
        }
        if (nodo.left == null && nodo.right == null) {
            return nodo;
        }
        ContarHojas(nodo.left);
        ContarHojas(nodo.right);
        return null;
    }

    public void ReporteRepuestosUnicos() {
        int contador = ContarHojas(raiz) != null ? 1 : 0;
        System.out.println("Cantidad de repuestos únicos (sin variantes relacionadas): " + contador);
    }

    private Repuesto BackupPreOrden(Repuesto nodo) {
        if (nodo != null) {
            System.out.println("[" + nodo.codigoRef + "] " + nodo.descripcion + " - " + nodo.marca + " (" + nodo.stock + " uds)");
            BackupPreOrden(nodo.left);
            BackupPreOrden(nodo.right);
        }
        return null;
    }

    public void BackupPreOrden() {
        BackupPreOrden(raiz);
    }
}