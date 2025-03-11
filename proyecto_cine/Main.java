import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        SistemaVenta ventas = new SistemaVenta(cine);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Agregar Película");
            System.out.println("2. Programar Función");
            System.out.println("3. Vender Boletos");
            System.out.println("4. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre, idioma, tipo y duración:");
                    String nombre = scanner.nextLine();
                    String idioma = scanner.nextLine();
                    String tipo = scanner.nextLine();
                    int duracion = scanner.nextInt();
                    cine.agregarPelicula(new Pelicula(nombre,duracion,tipo, idioma ));
                    break;
                case 2:
                    System.out.println("Seleccione película y sala:");
                    cine.programarFuncion(cine.getPeliculas().get(0), 1, "14:00 - 16:30");
                    break;
                case 3:
                    ventas.venderEntrada();
                    break;
                case 4:
                    scanner.close();
                    return;
            }
        }
    }
}