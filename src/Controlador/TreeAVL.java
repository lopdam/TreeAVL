/*
 * 
 */
package Controlador;

import java.util.Comparator;
/**
 *
 * @author lopdam
 */
public class TreeAVL<E> {

    private Comparator<E> f;
    private Node<E> root;

    public TreeAVL(Comparator<E> g) {
        this.f = g;
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private int height(Node<E> p) {
        if (p == null) {
            return 0;
        }
        return 1 + Math.max(height(p.getLeft()), height(p.getRight()));
    }

    public int diferencia(Node<E> p) {
        return height(p.getRight()) - height(p.getLeft());
    }

    public Node<E> comprobar(Node<E> p) {
        if (p == null) {
            return null;
        }
        if (Math.abs(diferencia(p)) > 1) {
            return p;
        }
        comprobar(searchParent(p.getData()));
        return null;
    }

    private Node<E> searchNode(E data) {
        return searchNode(data, root);//empiezo a buscar desde el root, porque es lo unico que conoce el arbol
    }

    private Node<E> searchNode(E data, Node<E> nodo) {
        //caso base
        if (nodo == null) {//aqui se debe preguntar por el nodo, no por la raiz, es decir cuando llega al final
            return null;
        } //si al menos tiene un elemento, debo comprobar si la data del nodo es la data que estoy buscando
        else if (nodo.getData().equals(data)) {
            return nodo;
        }
        //debo bajar por las dos ramas, aqui viene la recursividad

        //podar el arbol, si ya encuentro el elemento en el lado izquierdo ya no busco en el lado derecho
        //en el codigo que se esta buscando en todo el arbol recursivamente y luego se decide que hacer
        Node<E> nodeLeft = searchNode(data, nodo.getLeft());
        if (nodeLeft != null) {
            return nodeLeft;
        }
        return searchNode(data, nodo.getRight());

    }

    public Node<E> searchParent(E data) {
        return searchParent(data, root);
    }

    public Node<E> searchParent(E data, Node<E> nodo) {
        if (nodo == null) {
            return null;
        } else if ((nodo.getLeft() != null && nodo.getLeft().getData().equals(data)) || (nodo.getRight() != null && nodo.getRight().getData().equals(data))) {
            return nodo;
        }
        Node<E> l = searchParent(data, nodo.getLeft());
        if (l != null) {
            return l;
        }
        return searchParent(data, nodo.getRight());
    }

    public boolean contains(E element) {
        if (element == null || isEmpty()) {
            return false;
        }
        return contains(element, root);

    }

    private boolean contains(E element, Node<E> p) {
        if (p == null) {
            return false;
        }
        if (p.getData().equals(element)) {
            return true;
        }
        if (f.compare(element, p.getData()) > 0) {
            return contains(element, p.getRight());
        }
        return contains(element, p.getLeft());
    }

    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        if (contains(e)) {
            return false;
        }
        this.root = add(e, this.root);
        return true;
    }

    private Node<E> add(E element, Node<E> p) {
        if (p == null) {
            p = new Node<>(element);
        } else if (f.compare(element, p.getData()) > 0) {
            p.setRight(add(element, p.getRight()));
        } else if (f.compare(element, p.getData()) < 0) {
            p.setLeft(add(element, p.getLeft()));
        }
        actualizar(p);
        return balancear(p);

    }

    private Node<E> balancear(Node<E> n) {
        if (n.getFactor() == -2) {
            if (n.getLeft().getFactor() <= 0) {
                return LeftLeftCaso(n);
            } else {
                return LeftRightCaso(n);
            }
        } else if (n.getFactor() == +2) {
            if (n.getRight().getFactor() >= 0) {
                return RightRightCaso(n);
            } else {
                return RightLeftCaso(n);
            }
        }
        return n;
    }

    private Node<E> LeftLeftCaso(Node<E> n) {
        return RightRotation(n);
    }

    private Node<E> RightRightCaso(Node<E> n) {
        return LeftRotation(n);
    }

    private Node<E> LeftRightCaso(Node<E> n) {
        n.setLeft(LeftRotation(n.getLeft()));
        return LeftLeftCaso(n);
    }

    private Node<E> RightLeftCaso(Node<E> n) {
        n.setRight(RightRotation(n.getRight()));
        return RightRightCaso(n);
    }

    private void actualizar(Node<E> n) {
        int alturaLeft = (n.getLeft() == null) ? -1 : n.getLeft().getAltura();
        int alturaRight = (n.getRight() == null) ? -1 : n.getRight().getAltura();
        n.setAltura(1 + Math.max(alturaLeft, alturaRight));
        n.setFactor(alturaRight - alturaLeft);
    }

    private Node<E> RightRotation(Node<E> nodo) {
        Node<E> nuevoPadre = nodo.getLeft();
        nodo.setLeft(nuevoPadre.getRight());
        nuevoPadre.setRight(nodo);
        actualizar(nodo);
        actualizar(nuevoPadre);
        return nuevoPadre;
    }

    private Node<E> LeftRotation(Node<E> nodo) {
        Node<E> nuevoPadre = nodo.getRight();
        nodo.setRight(nuevoPadre.getLeft());
        nuevoPadre.setLeft(nodo);
        actualizar(nodo);
        actualizar(nuevoPadre);
        return nuevoPadre;
    }

    public void preorden() {
        System.out.println("");
        preorden(root);

    }

    private void preorden(Node<E> nodo) {

        if (nodo != null) {
            System.out.print(nodo.getData() + " ");
            preorden(nodo.getLeft());
            preorden(nodo.getRight());
        }

    }

    public void postorden() {
        System.out.println("");
        postorden(root);
    }

    private void postorden(Node<E> nodo) {
        if (nodo != null) {
            postorden(nodo.getLeft());
            postorden(nodo.getRight());
            System.out.print(nodo.getData() + " ");
        }
    }

    public void inorden() {
        System.out.println("");
        inorden(root);
    }

    private void inorden(Node<E> nodo) {
        if (nodo != null) {
            inorden(nodo.getLeft());
            System.out.print(nodo.getData() + " ");
            inorden(nodo.getRight());

        }
    }

    public boolean remove(E data) {
        if (data == null || !contains(data)) {
            return false;
        }
        this.root = remove(data, this.root);
        return true;
    }

    private Node<E> remove(E data, Node<E> nodo) {
        if (nodo == null) {
            return null;
        }
        if (f.compare(data, nodo.getData()) > 0) {
            nodo.setRight(remove(data, nodo.getRight()));
        } else if (f.compare(data, nodo.getData()) < 0) {
            nodo.setLeft(remove(data, nodo.getLeft()));
        } else {
            if (nodo.getLeft() == null) {
                return nodo.getRight();
            } else if (nodo.getRight() == null) {
                return nodo.getLeft();
            } else {
                if (nodo.getLeft().getAltura() < nodo.getRight().getAltura()) {
                    E valor = max(nodo.getLeft());
                    nodo.setData(valor);
                    nodo.setLeft(remove(valor, nodo.getLeft()));
                } else {
                    E valor = min(nodo.getRight());
                    nodo.setData(valor);
                    nodo.setRight(remove(valor, nodo.getRight()));
                }
            }
        }
        actualizar(nodo);
        return balancear(nodo);

    }

    public E max() {
        if (isEmpty()) {
            return null;
        }
        return max(root);

    }

    private E max(Node<E> p) {
        if (p.getRight() == null) {
            return p.getData();
        }
        return max(p.getRight());
    }

    public E min() {
        if (isEmpty()) {
            return null;
        }
        return min(root);

    }

    private E min(Node<E> p) {
        if (p.getLeft() == null) {
            return p.getData();
        }
        return min(p.getLeft());
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

}
