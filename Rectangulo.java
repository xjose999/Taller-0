public class Rectangulo {
    double base;
    double altura;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println("Rectangulo [Base: " + base + " | Altura: " + altura + "]");
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();

        miRectangulo.base = 5.0;
        miRectangulo.altura = 3.0;

        miRectangulo.mostrarResultados();
    }
}