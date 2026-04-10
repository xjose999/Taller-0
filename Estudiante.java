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

    //Aquí hay 3 objetos creados, comparten los mismos atributos, el metodo y se diferencian en los datos que tienen
    //cada uno

    public static void main (String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "José Daniel Ballesteros";
        est1.codigo = "7502520040";
        est1.semestre = 2;

        Estudiante est2 = new Estudiante();
        est2.nombre = "Luis Alfonso Dominguez";
        est2.codigo = "7502520041";
        est2.semestre = 3;

        Estudiante est3 = new Estudiante();
        est3.nombre = "Juan Daniel Orozco";
        est3.codigo = "7502520042";
        est3.semestre = 1;




        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();
    }
}