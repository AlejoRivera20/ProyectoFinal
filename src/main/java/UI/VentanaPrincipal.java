package UI;

import Model.Artista;
import Model.Cancion;
import Model.GestorMusica;
import Model.ListaReproduccion;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private GestorMusica gestorMusica;
    private JTextArea areaListas, areaArtistas, areaCanciones;
    private JButton btnCrearLista, btnAgregarCancion, btnAgregarArtista;

    public VentanaPrincipal() {
        gestorMusica = new GestorMusica();
        setTitle("APOSpotify");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaListas = new JTextArea(10, 20);
        areaArtistas = new JTextArea(10, 20);
        areaCanciones = new JTextArea(10, 20);

        // Crear los paneles
        JPanel panelListas = crearPanel("Mis Listas", areaListas);
        JPanel panelArtistas = crearPanel("Artistas", areaArtistas);
        JPanel panelCanciones = crearPanel("Canciones", areaCanciones);

        // Agregar los paneles a la ventana
        add(panelListas, BorderLayout.WEST);
        add(panelArtistas, BorderLayout.CENTER);
        add(panelCanciones, BorderLayout.EAST);

        // Crear botones
        btnCrearLista = new JButton("Crear Lista");
        btnCrearLista.addActionListener(e -> crearLista());

        btnAgregarCancion = new JButton("Agregar Canción");
        btnAgregarCancion.addActionListener(e -> agregarCancion());

        btnAgregarArtista = new JButton("Agregar Artista");
        btnAgregarArtista.addActionListener(e -> agregarArtista());

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnCrearLista);
        panelBotones.add(btnAgregarCancion);
        panelBotones.add(btnAgregarArtista);

        add(panelBotones, BorderLayout.SOUTH);
    }

    private JPanel crearPanel(String titulo, JTextArea area) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(new JScrollPane(area), BorderLayout.CENTER);
        return panel;
    }

    private void crearLista() {
        String nombreLista = JOptionPane.showInputDialog("Ingrese el nombre de la lista:");
        if (nombreLista != null && !nombreLista.trim().isEmpty()) {
            gestorMusica.crearLista(nombreLista);
            actualizarListas();
        }
    }

    private void agregarCancion() {
        String nombreCancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción:");
        String nombreArtista = JOptionPane.showInputDialog("Ingrese el nombre del artista:");
        String nombreLista = JOptionPane.showInputDialog("Ingrese el nombre de la lista a la que desea agregar la canción:");

        if (nombreCancion != null && !nombreCancion.trim().isEmpty() && nombreLista != null) {
            Cancion cancion = new Cancion(nombreCancion, nombreArtista);
            gestorMusica.agregarCancionALista(nombreLista, cancion);

        }
    }

    private void agregarArtista() {
        String nombreArtista = JOptionPane.showInputDialog("Ingrese el nombre del artista:");
        if (nombreArtista != null && !nombreArtista.trim().isEmpty()) {
            gestorMusica.agregarArtista(nombreArtista);
            actualizarArtistas();
        }
    }

    private void actualizarListas() {
        areaListas.setText("");
        for (ListaReproduccion lista : gestorMusica.getListas()) {
            areaListas.append(lista.getNombre() + "\n");
        }
    }

    private void actualizarArtistas() {
        areaArtistas.setText("");
        for (Artista artista : gestorMusica.getArtistas()) {
            areaArtistas.append(artista.getNombre() + "\n");
        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}