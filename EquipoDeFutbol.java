public class EquipoDeFutbol {
    // ATRIBUTOS: Datos que identifican al equipo
    String nombre;
    int puntos;

    // MÉTODO ÚNICO: Suma 3 puntos al acumulado actual
    public void ganarPartido() {
        puntos = puntos + 3;
    }

    // Método para imprimir los datos del equipo
    public void mostrarTabla() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Puntos totales: " + puntos);
    }

    public static void main(String[] args) {
        // Creación del objeto único
        EquipoDeFutbol miEquipo = new EquipoDeFutbol();

        // Asignación manual de valores
        miEquipo.nombre = "Real Cartagena";
        miEquipo.puntos = 12;

        // Estado antes del partido
        System.out.println("--- Antes del partido ---");
        miEquipo.mostrarTabla();

        // El equipo gana un encuentro
        miEquipo.ganarPartido();

        // Estado tras sumar los nuevos puntos
        System.out.println("\n--- Despues de ganar ---");
        miEquipo.mostrarTabla();
    }
}
