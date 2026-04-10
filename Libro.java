public class Libro {
    String nombre;
    String genero;

    public Libro(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public Libro(Libro otroLibro) {
        this.nombre = otroLibro.nombre;
        this.genero = otroLibro.genero;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + nombre + " | Género: " + genero);
    }

    public static void main(String[] args) {
        Libro original = new Libro("Cien años de soledad", "Realismo Mágico");

        Libro copia = new Libro(original);

        original.mostrarInfo();
        copia.mostrarInfo();
    }
}