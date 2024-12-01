package Model;

import java.util.ArrayList;

public class GestorMusica
{
    private ArrayList<ListaReproduccion> listas;
    private ArrayList<Artista> artistas;

    public GestorMusica()
    {
        listas = new ArrayList<ListaReproduccion>();
        // especificar el tipo de cancion
        artistas = new ArrayList<Artista>();
        //tipo de artista
    }

    public void crearLista(String nombre)
    {
        // luego agregar funcionalidad
    }

    public void crearArtista(String nombre)
    {
        // luego agregar funcionalidad
    }

    public void crearCancion(String nombre, Artista artista)
    {
        // luego agregar funcionalidad
    }

    public void agregarCancionALista(String nombreLista, Cancion cancion)
    {
        // luego agregar funcionalidad
    }

    public ArrayList<ListaReproduccion> getListas()
    {
        return listas;
    }

    public ArrayList<Artista> getArtistas()
    {
        return artistas;
    }
}
