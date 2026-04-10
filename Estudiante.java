//Estudiante es una clase porque es el molde que usaremos para luego agregarle atributos y luego objetos,
//en este caso los objetos pueden ser estudiante 1,2 o los que queramos por eso el de este ejemplo lleva el nombre
// de est1


public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre + "°");
    }


    public void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
        System.out.println(">>> El semestre ha sido actualizado a: " + semestre + "°");
    }

    public static void main (String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "José Daniel Ballesteros";
        est1.codigo = "7502520040";
        est1.semestre = 2;


        est1.mostrarInfo();
        est1.cambiarSemestre(3);
        est1.mostrarInfo();
    }
}