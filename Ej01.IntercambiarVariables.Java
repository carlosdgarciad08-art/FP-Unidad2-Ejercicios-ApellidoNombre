
public class Ejercicio01 {

    public static void intercambiar(int a, int b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        intercambiar(x, y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// ¿Funciona? NO.
// ¿Por qué? Porque Java pasa los valores de las variables
// a y b por valor. El método intercambia solamente sus copias,
// no modifica las variables originales x e y.
