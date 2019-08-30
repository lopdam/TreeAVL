package vistas;

/*
Ventana Panel Fondo
Es la Ventana que funciona como un contenedor para todos los componentes
 */
import java.awt.Graphics;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

/**
 * @author lopdam
 */
public class VentanaFondo extends JPanel {

    public VentanaFondo() {
        initComponents();
        this.setSize(1920, 1080);

    }

    @Override
    public void paintComponent(Graphics g) {

        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 507, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 346, Short.MAX_VALUE)
        );
    }
}
