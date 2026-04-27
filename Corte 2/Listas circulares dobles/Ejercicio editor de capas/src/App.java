// Los editores gráficos organizan el diseño en capas. El usuario navega a la 
// capa superior (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa. 
// La estructura es circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, 
// alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). 
// mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: 
// crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final

public class App {
    public static void main(String[] args) throws Exception {
        
        
    }
}
