//Los objetos pertenecen a una misma clase porque DERIVAN DE ELLA, usando sus atributos para establecer sus propios datos.

public class Curso {
    int estudiantes;
    int materias;

    public void mostrarInfo() {
        System.out.println("En el curso hay " + estudiantes + " estudiantes");
        System.out.println("En el curso ven " + materias + " materias");
    }

    public static void main(String[] args) {
    Curso curso1 = new Curso();
    Curso curso2 = new Curso();


    curso1.estudiantes = 40;
    curso1.materias = 12;

    curso2.estudiantes = 35;
    curso2.materias = 12;

    curso1.mostrarInfo();
    curso2.mostrarInfo();
    }
}
