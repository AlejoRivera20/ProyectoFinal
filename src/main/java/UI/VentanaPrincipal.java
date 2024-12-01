package UI;


import Model.GestorMusica;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame
{
    private GestorMusica gestorMusica;
    private JTextArea areaListas, areaArtistas, areaCanciones;

    public VentanaPrincipal()
    {
        gestorMusica = new GestorMusica();
        setTitle("APOSpotify");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaListas = new JTextArea(10,20);
        areaArtistas = new JTextArea(10,20);
        areaCanciones = new JTextArea(10,20);

        // Crear los paneles
        JPanel panelListas = crearPanel("Mis Listas", areaListas);
        JPanel panelArtistas = crearPanel("Artistas", areaArtistas);
        JPanel panelCanciones = crearPanel("Canciones", areaCanciones);

        // Agregar los paneles a la ventana
        add(panelListas, BorderLayout.WEST);
        add(panelArtistas, BorderLayout.CENTER);
        add(panelCanciones, BorderLayout.EAST);
    }

    private JPanel crearPanel(String titulo, JTextArea area)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(new JScrollPane(area), BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            }
        });
    }
}
