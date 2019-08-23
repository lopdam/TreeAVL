package Vistas;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author lopdam
 */

public class PanelFondo extends JPanel {

    public PanelFondo() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 507, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 346, Short.MAX_VALUE)
        );
    }
}
