public class Libro {
    String nombre;
    String genero;

    public Libro() {
        nombre = "Sin título";
        genero = "Sin género";
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + nombre + " | Género: " + genero);
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.nombre = "Don Quijote";
        miLibro.genero = "Clásico";


        miLibro.mostrarInfo();
    }
}