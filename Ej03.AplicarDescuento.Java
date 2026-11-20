
public class Ej03_AplicarDescuento {

    public static void aplicarDescuento(double[] precios, double pct) {

        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    public static void main(String[] args) {

        double[] precios = {100, 200, 300};

        System.out.println("Precios antes del descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        aplicarDescuento(precios, 20);

        System.out.println("Precios después del descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }
}
