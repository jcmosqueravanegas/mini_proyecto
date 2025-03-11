import java.util.Scanner;

public class SistemaVenta {
    private Cine cine;
    private Scanner scanner;

    public SistemaVenta(Cine cine) {
        this.cine = cine;
        this.scanner = new Scanner(System.in);
    }

    public void venderEntrada() {
        System.out.println("Seleccione una función:");
        for (int i = 0; i < cine.getFunciones().size(); i++) {
            System.out.println(i + ". " + cine.getFunciones().get(i));
        }
        int opcion = scanner.nextInt();
        Funcion funcion = cine.getFunciones().get(opcion);

        funcion.getSala().mostrarAsientos();
        System.out.println("Ingrese asiento a reservar (Ejemplo: A3):");
        String asiento = scanner.next();

        if (funcion.getSala().reservarAsiento(asiento)) {
            System.out.println("Compra exitosa. ¡Disfrute la película!");
        } else {
            System.out.println("El asiento no está disponible.");
        }
    }
}