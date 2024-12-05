package Model;

import java.util.ArrayList;

public class GestorMusica {
    private ArrayList<ListaReproduccion> listas;
    private ArrayList<Artista> artistas;

    public GestorMusica() {
        listas = new ArrayList<>();
        artistas = new ArrayList<>();
    }

    public void crearLista(String nombre) {
        listas.add(new ListaReproduccion(nombre));
    }

    public void agregarArtista(String nombre) {
        artistas.add(new Artista(nombre));
    }

    public ArrayList<ListaReproduccion> getListas() {
        return listas;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void agregarCancionALista(String nombreLista, Cancion cancion) {
        for (ListaReproduccion lista : listas) {
            if (lista.getNombre().equals(nombreLista)) {
                lista.agregarCancion(cancion);
                break;
            }
        }
    }
}
