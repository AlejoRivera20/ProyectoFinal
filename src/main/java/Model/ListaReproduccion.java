package Model;

import java.util.ArrayList;


public class ListaReproduccion
{
    private String nombre;
    private ArrayList<Cancion> canciones;

    public ListaReproduccion(String nombre)
    {
        this.nombre = nombre;
        this.canciones = new ArrayList<Cancion>(); // especificar el tipo de cancion
    }

    public void agregarCancion(Cancion cancion)
    {
        // siguiente entregar agregar funcionalidad
    }

    public String getNombre()
    {
        return nombre;
    }

    public ArrayList<Cancion> getCanciones()
    {
        return canciones;
    }
}
