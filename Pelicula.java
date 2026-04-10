public class Pelicula {
    String nombre;
    String genero;
    int minutos;

    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.println("Pelicula: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + minutos + " minutos");
    }

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Interstellar", "Ciencia Ficcion", 169);

        miPelicula.mostrarFicha();
    }
}