public class Pelicula {
    private String nombre;
    private String tipo;
    private String idioma;
    private int duracion; 

    public Pelicula(String nombre, int duracion, String tipo, String idioma){ 
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
        this.idioma = idioma;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDuracion(){
        return duracion;
    }
    public String getTipo(){
        return tipo;
    }
    public String getIdioma(){
        return idioma;
    }
    public String toString(){
        return nombre + "("+tipo+","+idioma+","+duracion+"min)"; 
    }
}
