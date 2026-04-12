public class Biblioteca {
    // ATRIBUTOS: Se definen los datos que tendra el objeto
    String nombre;
    String direccion;
    int cantidadLibros;

    // MÉTODO: Se encarga de mostrar la informacion del objeto en pantalla
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + direccion);
        System.out.println("Ejemplares: " + cantidadLibros);
    }

    public static void main(String[] args) {
        // Creamos el objeto
        Biblioteca miBiblioteca = new Biblioteca();

        // Asignacion manual de valores a los atributos del objeto
        miBiblioteca.nombre = "Biblioteca Universitaria";
        miBiblioteca.direccion = "Campus Principal";
        miBiblioteca.cantidadLibros = 850;

        // Llamada al metodo disponible para ver el resultado
        System.out.println("--- Reporte de Biblioteca ---");
        miBiblioteca.mostrarInfo();
    }
}