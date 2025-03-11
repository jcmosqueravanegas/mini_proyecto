import java.util.ArrayList;
import java.util.List;

public class Cine {
    private List<Pelicula> peliculas;
    private List<Sala> salas;
    private List<Funcion> funciones;
    

    public Cine() {
        this.peliculas = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.funciones = new ArrayList<>();
        salas.add(new Sala(1, false));
        salas.add(new Sala(2, false));
        salas.add(new Sala(3, true));
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada: " + pelicula);
    }





    public void programarFuncion(Pelicula pelicula, int salaNumero, String horario) {
        for (Sala sala : salas) {
            if (Funcion.getNumero() == salaNumero) {
                if (sala.es3D() && !pelicula.getTipo().equals("3D")) {
                    System.out.println("Error: Solo se permiten películas 3D en esta sala.");
                    return;
                }
                funciones.add(new Funcion(pelicula, sala, horario, salaNumero));
                System.out.println("Función programada con éxito.");
                return;
            }
        }
        System.out.println("Sala no encontrada.");
    }

    public List<Pelicula> getPeliculas() { return peliculas; }
    public List<Funcion> getFunciones() { return funciones; }
}