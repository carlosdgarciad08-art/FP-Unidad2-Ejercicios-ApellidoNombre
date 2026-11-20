
public class Ejercicio02 {

    public static void intercambiar(int[] v, int i, int j) {
        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};

        System.out.println("Antes del intercambio:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        intercambiar(numeros, 0, 2);

        System.out.println("\nDespués del intercambio:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}

// ¿Por qué ahora sí funciona?
// Porque el método recibe una referencia al mismo arreglo.
// Por eso puede modificar sus elementos originales.
