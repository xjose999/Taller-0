public class Hospital {
    // ATRIBUTOS: Datos basicos del hospital
    String nombre;
    int camasDisponibles;

    // Método para ver el estado actual
    public void mostrarEstado() {
        System.out.println("Hospital: " + nombre);
        System.out.println("Camas libres: " + camasDisponibles);
    }

    public static void main(String[] args) {
        // Creamos el objeto unico
        Hospital miHospital = new Hospital();

        // Asignamos valores directamente a los atributos
        miHospital.nombre = "Hospital San Jose";
        miHospital.camasDisponibles = 50;

        // Mostramos el estado
        miHospital.mostrarEstado();


    }
}
