
public class Ej04_SobrecargaPerimetro {

    // Método para calcular el perímetro de un cuadrado
    public static double perimetro(double lado) {
        return 4 * lado;
    }

    // Método para calcular el perímetro de un rectángulo
    public static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {

        double cuadrado = perimetro(5);
        double rectangulo = perimetro(8, 4);

        System.out.println("Perímetro del cuadrado: " + cuadrado);
        System.out.println("Perímetro del rectángulo: " + rectangulo);
    }
}
