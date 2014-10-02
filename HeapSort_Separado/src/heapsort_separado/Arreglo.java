package heapsort_separado;

/**
 *
 * @author matychp
 */
public class Arreglo {

    private Integer unArreglo[];

    /**
     * Crea un arreglo de 100 elementos por defecto, usando la sobrecarga del mismo.
     */
    public Arreglo() {
        this(100);
    }

    /**
     * Crea un arreglo unidimensional de un tamaño recibido por parámetro.
     * @param unaCantidad: el tamaño del arreglo a crear.
     */
    public Arreglo(int unaCantidad) {
        unArreglo = new Integer[unaCantidad];
    }

    /**
     * Genera un numero aleatorio entre 0 y el tamaño del vector,
     * para cada una de las posiciones del arreglo ylos almacena.
     */
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

    /**
     * Muestra el contenido del arreglo.
     * Empiezando por [ ], y cada objeto separado de una coma.
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sr = new StringBuilder("[ ");
        for (int i = 0; i < unArreglo.length; i++) {
            sr.append(unArreglo[i].toString());
            if(i != unArreglo.length - 1){
                sr.append(", ");
            }
        }
        sr.append(" ]");
        return sr.toString();
    }
}
