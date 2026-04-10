public class Libro {
    String nombre;
    String genero;


    public Libro() {
        this.nombre = "Pendiente";
        this.genero = "General";
    }


    public Libro(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + nombre + " | Género: " + genero);
    }

    public static void main(String[] args) {

        Libro libroVacio = new Libro();


        Libro libroConDatos = new Libro("El resplandor", "Terror");


        System.out.println(" Objeto con Constructor Vacío ");
        libroVacio.mostrarInfo();

        System.out.println("\n Objeto con Constructor con Parámetros ");
        libroConDatos.mostrarInfo();
    }
}