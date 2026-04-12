public class Docente {
    // ATRIBUTOS: Características de la clase
    String nombre;
    String especialidad;
    int horasSemanales;


    // MÉTODO: Acción para mostrar los datos del objeto
    public void mostrarPerfil() {
        System.out.println("Docente: " + nombre);
        System.out.println("Area: " + especialidad);
        System.out.println("Total horas: " + horasSemanales);
    }

    public static void main(String[] args) {
        // Creación del objeto
        Docente miProfe = new Docente();

        // Asignación de valores iniciales
        miProfe.nombre = "Jhon Arrieta";
        miProfe.especialidad = "Ingenieria de Software";
        miProfe.horasSemanales = 40;

        // Mostramos la información inicial
        System.out.println("--- Datos iniciales ---");
        miProfe.mostrarPerfil();


    }
}