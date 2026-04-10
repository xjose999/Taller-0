public class Estudiante {
    String nombre;
    String codigo;
    int semestre;


    public Estudiante() {
        this.nombre = "Sin nombre";
        this.codigo = "0000000000";
        this.semestre = 1;
    }


    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1;
    }


    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre + "°");
    }

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();


        Estudiante est2 = new Estudiante("José Daniel", "7502520040");


        Estudiante est3 = new Estudiante("Andrés Castro", "7502520041", 5);

        System.out.println("Lista de Estudiantes");
        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();
    }
}