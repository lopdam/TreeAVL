package vistas;

/*
    En esta clase se agregan todos los componetes a  al panel
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 * @author lopdam
 */
public class Componentes extends JFrame {

    private JButton botonBorrar;
    private JTextArea impresion;
    private JDesktopPane jDesktopPane1;
    private JInternalFrame jInternalFrame2;

    private final ControlGrafica simulador = new ControlGrafica();

    public Componentes() {
        initComponents();
        this.inicializar(false);
        VentanaFondo f = new VentanaFondo();
        this.add(f, BorderLayout.CENTER);
        this.pack();

    }

    private void inicializar(boolean enable) {

        this.botonBorrar.setEnabled(enable);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        JPanel jPanel2 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        impresion = new JTextArea();
        JPanel jPanel3 = new JPanel();
        JButton botonInsertar = new JButton();
        botonBorrar = new JButton();
        jDesktopPane1 = new JDesktopPane();
        jInternalFrame2 = new JInternalFrame();
        Font stlFond = new Font("Tahoma", 1, 12);
        Font stlBFond = new Font("Tahoma", 1, 10);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Panel de Pruebas", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, stlBFond)); // NOI18N
        jPanel2.setOpaque(false);

        jScrollPane1.setOpaque(false);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(stlFond); // NOI18N
        impresion.setRows(5);
        impresion.setBorder(BorderFactory.createTitledBorder("Resultados de operaciones:"));
        impresion.setOpaque(false);
        jScrollPane1.setViewportView(impresion);

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Operaciones", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, stlBFond)); // NOI18N
        jPanel3.setOpaque(false);

        botonInsertar.setBackground(new Color(255, 255, 255));
        botonInsertar.setFont(stlFond); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener((ActionEvent evt) -> {
            botonInsertarActionPerformed(evt);
        });

        botonBorrar.setBackground(new Color(255, 255, 255));
        botonBorrar.setFont(stlFond); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener((ActionEvent evt) -> {
            botonBorrarActionPerformed(evt);
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(botonInsertar)
                                .addGap(36, 36, 36)
                                .addComponent(botonBorrar)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonInsertar)
                                        .addComponent(botonBorrar))
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        GroupLayout jInternalFrame2Layout = new GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
                jInternalFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 424, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
                jInternalFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 440, 340);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jDesktopPane1, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(128, 128, 128)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                        .addComponent(jDesktopPane1))
                                .addGap(17, 17, 17)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void botonInsertarActionPerformed(ActionEvent evt) {
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para insertar:"));
            if (this.simulador.insertar(dato)) {
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);
                this.impresion.setText("Dato Insertado Correctamente: " + dato);
                complementos();
            }
        } catch (HeadlessException | NumberFormatException e) {
            this.impresion.setText("No se puede insertar el Dato. :( ");
            JOptionPane.showMessageDialog(null, "No se puede insertar el Dato", "Intenta de nuevo...", 0);

        }
    }

    private void botonBorrarActionPerformed(ActionEvent evt) {
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para borrar: "));
            this.impresion.setText(this.simulador.borrar(dato));

            complementos();
        } catch (HeadlessException | NumberFormatException e) {
            this.impresion.setText("No se puede borrar ese Dato.");
        }
    }

    public void complementos() {
        this.repintarArbol();
    }

    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamanio = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamanio);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Componentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            new Componentes().setVisible(true);
        });
    }
}
