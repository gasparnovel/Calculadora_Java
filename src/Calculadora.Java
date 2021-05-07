import java.util.Scanner;

/**
 * @author Gaspar Novel Porcel
 *
 */

public class Calculadora { // nombre de la clase

    public static double num1; // atributos publicos para que cualquier metodo pueda acceder a el, además es double que es un tipo de dato númerico
    public static double num2; // atributos éstaticos para que se inicialicen al principio del porgrama
    public static final Scanner sc = new Scanner(System.in); // atributos finales para que no cambien su valor
    public static final Scanner sc2 = new Scanner(System.in); // atributo del tipo Scanner heredado del java.util para insertar datos por pantalla

    public static void main(String[] args) { // método principal
        calculdora(); // llama al método calculadora
    }

    public static void calculdora() {  //metodo

        String opcion; //atributo del tipo cadena 
        
        //todos los System.out son para que se muestre en pantalla la siguiente información
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

        opcion = sc.nextLine(); //añadimos una variable que almacenará lo intriducido del tipo string por pantalla

        switch (opcion) { //estructura de control de datos, que dependindo de lo introducido por pantalla irá a un caso o al default
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

    public static void sumar() { //metodo
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble(); //añadimos una variable que almacenará lo intriducido del tipo double por pantalla
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble(); //añadimos una variable que almacenará lo intriducido del tipo double por pantalla
        System.out.println("\n" + "El resultado de la suma es " + (num1 + num2)); //añadimos un System.out que nos mostrará la suma de las dos variables
        calculdora();
    }

    public static void restar() { //metodo
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble(); 
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la resta es " + (num1 - num2)); //añadimos un System.out que nos mostrará la resta de las dos variables
        calculdora();
    }

    public static void multiplicar() { //metodo
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la multiplicación es " + (num1 * num2)); //añadimos un System.out que nos mostrará la multiplicación de las dos variables
        calculdora();
    }

    public static void dividir() { //metodo
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resultado de la división es " + (num1 / num2)); //añadimos un System.out que nos mostrará la división de las dos variables
        calculdora();
    }

    public static void resto() { //metodo
        System.out.print("\n" + "Introduzca el primer número: ");
        num1 = sc2.nextDouble();
        System.out.print("\n" + "Introduzca el segundo número: ");
        num2 = sc2.nextDouble();
        System.out.println("\n" + "El resto de " + num1 + " entre " + num2 + " es " + (num1 % num2)); //añadimos un System.out que nos mostrará el resto de las dos variables
        calculdora();
    }
}