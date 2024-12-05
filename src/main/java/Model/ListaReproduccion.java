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
       if(cancion != null ){
           canciones.add(cancion);
       }
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
