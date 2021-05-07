package src;

import java.util.Scanner;

/**
 * @author Gaspar Novel Porcel
 *
 */

public class Calculadora {

    public static double num1;
    public static double num2;
    public static final Scanner sc = new Scanner(System.in);
    public static final Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        calculdora();
    }

    public static void calculdora() {

        String opcion;
    
        System.out.println("\n" + "*************************");
        System.out.println(" ----- CALCULADORA -----");
        System.out.println("*************************");
        System.out.println("\n" + "---Qué desea realizar?---");
        System.out.println("\n" + "1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto");
        System.out.println("0. Salir del programa");
        System.out.print("\n" + "Introduzca el número de la operación: ");

        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("\n" + "Has seleccionado Sumar:");
                sumar();
                break;

            case "2":
                System.out.println("\n" + "Has seleccionado Restar:");
                restar();
                break;

            case "3":
                System.out.println("\n" + "Has seleccionado Multiplicar:");
                multiplicar();
                break;

            case "4":
                System.out.println("\n" + "Has seleccionado Dividir:");
                dividir();
                break;

            case "5":
                System.out.println("\n" + "Has seleccionado Resto:");
                resto();
                break;

            case "0":
                System.out.println("\n" + "Has seleccionado Salir del programa:");
                System.out.println("\n" + "¡Finalizada la ejecución de la calculadora!" + "\n");
                break;

            default:
                System.out.print("\n" + "[ERROR] Carácter no válido" + "\n");
                calculdora();
        }
    }

    public static void sumar() {
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la suma es " + (num1 + num2));
        calculdora();
    }

    public static void restar() {
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la resta es " + (num1 - num2));
        calculdora();
    }

    public static void multiplicar() {
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la multiplicación es " + (num1 * num2));
        calculdora();
    }

    public static void dividir() {
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la división es " + (num1 / num2));
        calculdora();
    }

}

