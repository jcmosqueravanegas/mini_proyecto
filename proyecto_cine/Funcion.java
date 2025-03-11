public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private String horario;
    private static int numero;

    public Funcion(Pelicula pelicula, Sala sala, String horario, int salaNumero) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.horario = horario;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public Sala getSala() {
        return sala;
    }
public String getHorario() {
    return horario;
}
public static int getNumero() {
return numero;
}



@Override
public String toString() {
return "Función: " + pelicula.getNombre() + " en Sala " + getSala() + " - " + horario;
}
}

