import java.util.Scanner;

public class taller1 {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrar_menu();
            System.out.print("\nElige una opción: ");
            opcion = scanner.nextInt();
            elejir_opcion_de_menu(opcion);
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrar_menu() {
        System.out.println("\n=== Menú Principal ===");
        System.out.println("1. Verificar si una frase es Reves o Derecho");
        System.out.println("2. Contar vocales en una frase");
        System.out.println("3. Encriptar una frase");
        System.out.println("4. Desencriptar una frase");
        System.out.println("5. Salir");
    }

    public static void elejir_opcion_de_menu(int opcion) {
        switch (opcion) {
            case 1:
                verificarRevesDerecho();
                break;
            case 2:
                System.out.println("Elegiste la Opción 2");
                break;
            case 3:
                System.out.println("Elegiste la Opción 3");
                break;
            case 4:
                System.out.println("Elegiste la Opción 4");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    public static void verificarRevesDerecho() {
        System.out.println("Ejecutando Opción 1...");
        String frase = ingresarFrase();
        String invertida = invertirFrase(frase);
        System.out.println("Frase invertida: " + invertida);
        if (invertida.equals(frase)) {
            System.out.println("La frase es un palíndromo (Reves y Derecho).");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static String ingresarFrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa una frase: ");
        String frase = scanner.nextLine();
        return frase;
    }

    public static String invertirFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }
}



