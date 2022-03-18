/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones.
 */
package excepciones_3y4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        DivisionNumero ds = new DivisionNumero();

        System.out.println("Ingrese 2 números enteros:");

        try {
            ds.setNum1((scanner.nextLine()));
            ds.setNum2(scanner.nextLine());

            int num1 = Integer.parseInt(ds.getNum1());
            int num2 = Integer.parseInt(ds.getNum2());

            float division = num1 / num2;

            System.out.println("El resultado de la división es: " + division);
        } catch (InputMismatchException e) {
            System.out.println("No se ingresó un número");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (NumberFormatException e) {
            System.out.println("La cadena no puede convertirse a entero");
        }

    }


}
