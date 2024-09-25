import java.util.Scanner;
/*
3. Leer dos números y hallar: la sumatoria, su diferencia, su producto, su cociente y su residuo,
NO usar funciones.
 */

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).
        System.out.println("Ingrese el primer numero entero");//Imprime un mensaje en la consola solicitando al usuario que ingrese el primer número entero.

        int numero1 = scanner.nextInt();// Lee el número entero ingresado por el usuario y lo almacena en la variable numero1.

        //Las siguientes dos líneas hacen lo mismo para el segundo número entero, almacenándolo en la variable numero2.
        System.out.println("Ingrese el segundo numero entero");
        int numero2 = scanner.nextInt();

        int sumatoria = numero1 + numero2;//Suma los dos números y almacena el resultado en la variable sumatoria.
        int diferencia = numero1 - numero2;//Resta el segundo número del primero y almacena el resultado en la variable diferencia.
        int producto = numero1 * numero2;//Multiplica los dos números y almacena el resultado en la variable producto.
        int cociente = numero1 / numero2;//Divide el primer número entre el segundo y almacena el resultado entero (sin decimales) en la variable cociente.
        int residuo = numero1 % numero2;//Calcula el residuo de la división entre los dos números y lo almacena en la variable residuo.

        //Las últimas cinco líneas imprimen en la consola los resultados de cada operación, junto con un mensaje descriptivo.

        System.out.println("La sumatoria es: " + sumatoria);//
        System.out.println("La diferencia es: " + diferencia);//
        System.out.println("El producto es: " + producto);//
        System.out.println("El cociente es:" + cociente);//
        System.out.println("El residuo es " + residuo);//

        System.out.println("______________________________");//Esta línea imprime una serie de guiones bajos para crear una separación visual entre las preguntas y el resto de la salida, lo que mejora la legibilidad.

    }
}
