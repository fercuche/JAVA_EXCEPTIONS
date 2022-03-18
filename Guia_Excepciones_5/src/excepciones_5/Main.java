/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento.
 */

package excepciones_5;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Random random = new Random();
        int adivinar = 0;
        int aleatorio = 1 + random.nextInt(500);

        try {
            do {

                System.out.println("Adivine un número del 1 al 500 para ganar");
                adivinar = scanner.nextInt();

                if (adivinar == aleatorio) {
                    System.out.println("Lo adivinaste!");
                } else if (adivinar < aleatorio) {
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println("El número es menor");
                }
            } while (adivinar != aleatorio);


        } catch (NumberFormatException e) {
            e.getCause();
        } catch (InputMismatchException e) {
            e.getCause();
        }

    }
}
