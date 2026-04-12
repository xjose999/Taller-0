//hablamos de crear un paciente para entender que estamos dando vida a una entidad con identidad y propósito dentro de un sistema (como un hospital), mientras que la instanciación es simplemente el requisito informático necesario para que ese concepto exista dentro de la computadora.

public class Paciente {
    String nombre;
    String enfermedad;
    int edad;

    public void mostrarFicha() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnostico: " + enfermedad);
    }

    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.nombre = "Daniel";
        p1.edad = 20;
        p1.enfermedad = "Gripa";

        p1.mostrarFicha();
    }
}