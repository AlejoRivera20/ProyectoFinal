package Model;

import java.util.ArrayList;

public class Artista {
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Artista(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCancion(Cancion cancion) {
        if (cancion != null) {
            canciones.add(cancion);
        }
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
