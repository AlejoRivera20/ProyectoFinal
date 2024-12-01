package Model;

public class Cancion
{
    private String nombre;
    private Artista artista;

    public Cancion(String nombre, Artista artista)
    {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Artista getArtista()
    {
        return artista;
    }
}

