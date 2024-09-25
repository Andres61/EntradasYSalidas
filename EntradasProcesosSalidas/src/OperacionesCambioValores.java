import java.util.Scanner;
/*6. El mismo ejercicio anterior, pero utilizando solamente dos variables (en la R.A.M.) durante
        toda la operación. Ayuda, utilizar operaciones matemáticas.
         */

public class OperacionesCambioValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).
        System.out.println("Ingrese el valor de x: "); // Imprime un mensaje en la consola solicitando el valor de x
        int x = scanner.nextInt();              // Lee el valor ingresado por el usuario y lo almacena en la variable x
        System.out.println("Ingrese el valor de y: "); // Imprime un mensaje en la consola solicitando el valor de y
        int y = scanner.nextInt();// Lee el valor ingresado por el usuario y lo almacena en la variable y

        // A continuación, se realiza el intercambio de valores utilizando operaciones matemáticas:

        x = x + y;  // Se suma el valor de y a x y el resultado se almacena en x
        y = x - y;  // Se resta y de x (que ahora contiene la suma) y el resultado se almacena en y
        x = x - y;  // Se resta y (que ahora contiene el valor original de x) de x (que contiene la suma) y el resultado se almacena en x

        System.out.println("Después del intercambio:"); // Imprime un mensaje indicando que los valores han sido intercambiados
        System.out.println("x = " + x);  // Imprime el nuevo valor de x
        System.out.println("y = " + y);  // Imprime el nuevo valor de y
    }
}
