import java.util.Scanner;
/*
         5. Ingresar dos valores diferentes, almacenarlos en dos variables, pero al momento de mostrarlos,
         sus valores internamente (en la R.A.M.) han sido intercambiados. Se pueden utilizar otras
         variables auxiliares. Ejm: x = 10; y = 20 al final x = 20 ; y = 10 (nota no es intercambiarlos
         al imprimir)
         */
public class RenombrarValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).

        System.out.println("Ingrese el valor en numero de x:");//Imprime un mensaje en la consola solicitando al usuario que ingrese un valor numérico.

        int x = scanner.nextInt();//Lee el valor entero ingresado por el usuario y lo almacena en la variable x.

        //Se repite el proceso para la variable y.
        System.out.println("Ingrese el valor en numeros de y");

        int y = scanner.nextInt();
        int intercambio = x;//Se crea una variable temporal llamada intercambio y se le asigna el valor inicial de x para guardarlo.

        x = y;//El valor de y se asigna a x, sobrescribiendo el valor original de x.
        y = intercambio;//El valor original de x (que ahora está almacenado en intercambio) se asigna a y, completando así el intercambio.
        System.out.println("Despues del intercambio");//Imprime un mensaje indicando que a continuación se mostrarán los valores de x e y después del intercambio.
        System.out.println("x = " + x);//Imprime el valor actualizado de x en la consola.
        System.out.println("y = " + y);//Imprime el valor actualizado de y en la consola.
    }
}
