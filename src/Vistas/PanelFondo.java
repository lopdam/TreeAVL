package Vistas;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {
    /**
 *
  * @author lopdam
 */

    private String ruta;

    public PanelFondo() {
        initComponents();
        this.setSize(1920, 1080);
        this.ruta = "/Imagenes/fondo.jpg";

    }

    @Override
    public void paintComponent(Graphics g) {
        
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents
    
}
