public class Estudiante {
    String nombre;
    String codigo;
    int semestre;


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre + "°");

    }

    public static void main (String[] args) {

        Estudiante est1 = new Estudiante();
        est1.nombre = "José Daniel Ballesteros";
        est1.codigo = "7502520040";
        est1.semestre = 2;

        est1.mostrarInfo();

    }




}