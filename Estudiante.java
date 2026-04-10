
public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre + "°");
    }

    //Aquí hay 2 OBJETOS con el mismo valor en uno de los atributos pero distinto en los demás
    public static void main (String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "José Daniel Ballesteros";
        est1.codigo = "7502520040";
        est1.semestre = 2;

        Estudiante est2 = new Estudiante();
        est2.nombre = "Luis Alfonso Dominguez";
        est2.codigo = "7502520040";
        est2.semestre = 3;



        est1.mostrarInfo();
        est2.mostrarInfo();

    }
}