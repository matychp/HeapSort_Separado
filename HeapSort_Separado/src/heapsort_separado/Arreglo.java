package heapsortseparado;

/**
 *
 * @author matychp
 */
public class Arreglo {

    private Integer unArreglo[];

    public Arreglo() {
    }

    public Arreglo(int unaCantidad) {
        unArreglo = new Integer[unaCantidad];
    }

    public void cargar() {
        for (int i = 0; i < unArreglo.length; i++) {
            unArreglo[i] = (int) (Math.random() * unArreglo.length);
        }
    }

    /**
     * Crea un Heap. Luego inserta todos los elementos del arreglo en el Heap.
     * Por ultimo remueve cada elemento del Heap y lo almacena de nuevo en el arreglo.
     * Asi el arreglo queda ordenado, de acuerdo al parametro boolean.
     * @param ascendencia true: ordena de menor a mayor, false: lo contrario.
     */
    public void ordenar(boolean ascendencia) {
        Heap aux = new Heap(unArreglo.length, ascendencia);
        for (Integer i: unArreglo) {
            aux.add(i);
        }
        for (int i = 0; i < unArreglo.length; i++) {
            unArreglo[i] = (int) aux.remove();
        }
    }

    public String toString() {
        StringBuilder sr = new StringBuilder("");
        for (Integer cadaT : unArreglo) {
            sr.append(cadaT.toString()).append(", ");
        }
        sr.append("]");
        return sr.toString();
    }
}
