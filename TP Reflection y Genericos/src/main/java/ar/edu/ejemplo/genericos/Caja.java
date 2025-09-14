package ar.edu.ejemplo.genericos; // <-- Nota: corregir package en caso de copiar (el resto usa ar.edu.ejemplo)


/**
 * Clase genérica Caja<T> que almacena un objeto de tipo T.
 */
public class Caja<T> {
    private T contenido;

    public Caja() { }

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "contenido=" + contenido +
                '}';
    }
}
