public class Estudiante1 {
    String nombre;
    String codigo;
    int semestre;

    public Estudiante1(String nombre, String codigo, int semestre) {
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
        Estudiante1 est1 = new Estudiante1("Daniel Ballesteros", "001", 2);

        est1.mostrarInfo();
    }
}