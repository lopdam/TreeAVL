package Vistas;

/*
 * Esta clase agrega las funcionalidades necesarias al grafico del arbol
 * Posteriormente va a ser agregado a los componentes del arbol
 */
import Controlador.TreeAVL;
import java.util.Comparator;
import javax.swing.JPanel;

/**
 *
 * @author lopdam
 */
public class ControlGrafica {

    Comparator<Integer> g = (n1, n2) -> n1.compareTo(n2);

    TreeAVL miArbol = new TreeAVL(g);

    public ControlGrafica() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.add(dato));
    }

    public String borrar(Integer dato) {
        boolean x = this.miArbol.remove(dato);
        if (!x) {
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: " + dato.toString());
    }

    public JPanel getDibujo() {
        return new GraficoArbol(this.miArbol);
    }
}
