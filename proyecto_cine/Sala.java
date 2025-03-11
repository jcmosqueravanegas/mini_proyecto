import java.util.HashMap;
import java.util.Map;

public class Sala {
    private int numero;
    private boolean es3D;
    private int filasGenerales = 6;
    private int columnasGenerales = 12;
    private int filasPreferenciales = 2;
    private int columnasPreferenciales = 9;
    private Map<String, Boolean> asientos;

    public Sala(int numero, boolean es3D) {
        this.numero = numero;
        this.es3D = es3D;
        this.asientos = new HashMap<>();
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (char fila = 'A'; fila < 'A' + filasGenerales; fila++) {
            for (int num = 1; num <= columnasGenerales; num++) {
                asientos.put(fila + String.valueOf(num), true);
            }
        }
        if (numero == 1 || numero == 2) { 
            for (char fila = 'G'; fila < 'G' + filasPreferenciales; fila++) {
                for (int num = 1; num <= columnasPreferenciales; num++) {
                    asientos.put(fila + String.valueOf(num), true);
                }
            }
        }
    }

    public boolean es3D() { return es3D; }
    public int getNumero() { return numero; }

    public boolean reservarAsiento(String asiento) {
        if (asientos.containsKey(asiento) && asientos.get(asiento)) {
            asientos.put(asiento, false);
            return true;
        }
        return false;
    }

    public void mostrarAsientos() {
        System.out.println("Asientos disponibles en Sala " + numero + ":");
        for (Map.Entry<String, Boolean> entry : asientos.entrySet()) {
            System.out.print(entry.getKey() + (entry.getValue() ? " [Libre] " : " [Ocupado] "));
        }
        System.out.println("\n");
    }
}