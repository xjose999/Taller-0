public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre + "°");
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Daniel Ballesteros", "001", 2);

        est1.mostrarInfo();
    }
}