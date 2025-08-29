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
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            elejir_opcion_de_menu(opcion);
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrar_menu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opción 4");
        System.out.println("5. Salir");
    }

    public static void elejir_opcion_de_menu(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Elegiste la Opción 1");
                break;
            case 2:
                System.out.println("Elegiste la Opción 2");
                break;
            case 3:
                System.out.println("Elegiste la Opción 3");
                break;
            case 4:
                System.out.println("Opción en construcción");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }
}
    

