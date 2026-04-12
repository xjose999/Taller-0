public class VidaAcademica {

    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;
    double promedio;


    public void simularCalificaciones() {

        nota1 = Math.random() * 5;
        nota2 = Math.random() * 5;
        nota3 = Math.random() * 5;
        nota4 = Math.random() * 5;
        nota5 = Math.random() * 5;


        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
    }


    public void mostrarReporte() {
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Nota 5: " + nota5);
        System.out.println("-----------------------");
        System.out.println("Promedio Final: " + promedio);
    }

    public static void main(String[] args) {

        VidaAcademica misNotas = new VidaAcademica();

        misNotas.simularCalificaciones();

        misNotas.mostrarReporte();
    }
}
