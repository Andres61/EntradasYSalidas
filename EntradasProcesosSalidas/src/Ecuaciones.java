import java.util.Scanner;

/*7. La ecuación de segundo grado se define algebraicamente como:
        ax^2 + bx + c = 0
        La solución general viene dada por la expresión algebraica:
        Como toda raíz tiene dos resultados uno con positivo y otro con negativo, hallar x1 y x2
        respectivamente (NO tener en cuenta los números complejos de una raíz negativa)
        Para sacar raíces utilizar la función INVESTIGAR(valor);
        Para sacar potencias utilizar la función INVESTIGAR(base, exponente);
        ANALISIS
        ENTRADAS B, A, C
        PROCESOS X1 = (-B + RAIZ(B^2 – 4AC)) / 2 A
        X2 = (-B - RAIZ(B^2 – 4AC)) / 2A
        SALIDAS X1, X2
        import java.math.*;
        double raiz = Math.sqrt(4.0);
        System.out.println("RAIZ: " + raiz);
         */
public class Ecuaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).
        System.out.print("Ingrese el valor de a: "); // Solicita al usuario que ingrese el valor de a
        double a = scanner.nextDouble();// Lee el valor de a ingresado por el usuario y lo almacena en la variable a
        System.out.print("Ingrese el valor de b: ");// Solicita al usuario que ingrese el valor de b
        double b = scanner.nextDouble();// Lee el valor de b ingresado por el usuario y lo almacena en la variable b
        System.out.print("Ingrese el valor de c: ");// Solicita al usuario que ingrese el valor de c
        double c = scanner.nextDouble(); // Lee el valor de c ingresado por el usuario y lo almacena en la variable c

        // Calcula el discriminante de la ecuación de segundo grado utilizando la fórmula b^2 - 4ac
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Verifica si el discriminante es mayor o igual a 0
        if (discriminante >= 0) {
            // Si el discriminante es mayor o igual a 0, calcula las raíces de la ecuación utilizando la fórmula general
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Imprime las soluciones de la ecuación
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            // Si el discriminante es menor que 0, la ecuación no tiene raíces reales
            System.out.println("La ecuación no tiene raíces reales.");

        }
    }
}
