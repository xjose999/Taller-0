public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarBoletin() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio Final: " + calcularDefinitiva());
    }

    public static void main(String[] args) {
        NotaAcademica misNotas = new NotaAcademica();

        misNotas.asignatura = "Programacion Orientada a Objetos";
        misNotas.nota1 = 4.5;
        misNotas.nota2 = 3.8;
        misNotas.nota3 = 5.0;

        misNotas.mostrarBoletin();
    }
}