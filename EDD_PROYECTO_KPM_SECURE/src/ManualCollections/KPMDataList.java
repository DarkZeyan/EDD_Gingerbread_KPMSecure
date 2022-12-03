/*
 * 
 * 
 */
package ManualCollections;
import java.io.Serializable;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 * @param <Type>
 */
public class KPMDataList<Type> implements Serializable {

    private Node start;
    private Node last;
    private int cont;

    public KPMDataList() {
        this.start = null;
        this.last = null;
        this.cont = 0;
    }

    public void add(Type value) {

        Node newNode = new Node(value);
        cont++;
        if (start == null) {
            start = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }
    }

    public void print() {
        Node temp = start;
        // Se evalua si el nodo es distinto de null para imprimir, si es null no se
        // imprime ningun nodo y se recurre a imprimir el mensaje de lista vacia.
        while (temp != null) {
            if (temp.getNext() != null) {
                System.out.print(temp.getValue() + " - ");
            } else {
                System.out.print(temp.getValue() + " ");
            }
            temp = temp.getNext();
        }
        if (size() == 0) {
            System.out.println("La lista esta vacia");
        }
    }

    public void reversePrint() {
        Node temp = last;
        if (size() == 0)
            System.out.println("Lista vacia");
        else {
            while (temp != null) {
                if (temp.getPrevious() != null) {
                    System.out.print(temp.getValue() + " - ");
                } else {
                    System.out.print(temp.getValue() + " ");
                }
                temp = temp.getPrevious();
            }
        }
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void clear() {
        start = null;
        last = null;
        cont = 0;
    }

    public int size() {
        return cont;
    }

    public Object getValueAt(int pos) throws Exception {
        Node temp = start;
        if (pos == 0) {
            return start.getValue();
        } else {
            for (int i = 1; i <= pos ; i++) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
    }

    // public void printIn(int position) throws Exception{
    //     if(position<0 || position>listSize){
    //         throw new Exception("Fuera de los limites de la lista");
    //     }
    //     else{
    //         Node temp = init;
    //         for (int i = 0; i <= position; i++) {
    //             if(i==position){
    //                 System.out.println(temp.getValue());
    //             }
    //             temp = temp.getNext();
    //         }
    //     }
    // }


    public void insertAt(int value, int pos) throws Exception {
        // Insertar en una posicion no valida
        // Posiciones negativas o mayores a la cantidad de elementos;
        if (pos < 0) {
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        } else if (pos >= size()) {
            throw new Exception(pos + " No es una posicion valida en la lista");
        } else {

            Node newNode = new Node(value);
            cont++; // El contador se aumenta en uno debido a la creacion del nuevo nodo, este
                    // asegura un incremento en el numero de elementos de la lista.
            // Insertar al inicio de la lista
            if (pos == 0) {
                newNode.setNext(start);
                start.setPrevious(newNode);
                start = newNode;
            } // Insertar en cualquier otra posicion
            else {
                Node temp = start;
                for (int i = 1; i < pos; i++) {
                    temp = temp.getNext();
                }
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.getPrevious().setNext(newNode);
                temp.setPrevious(newNode);
            }
        }
    }

    public void deleteAt(int pos) throws Exception {
        // Se evalua si hay elementos o no en la lista, en caso de haberlos, se eliminan
        // de acuerdo si son posicion valida o no, si no hay elementos, lanzar
        // excepcion.
        if (start == null) {
            throw new Exception("No existen elementos en la lista, es imposible eliminar elementos");
        } else {
            // No pueden eliminarse elementos en posiciones negativas, pues estas no
            // existen.
            if (pos < 0) {
                throw new Exception("No existen posiciones negativas en la lista");
            } else if (pos > size()) { // Se quieren eliminar elementos en posiciones que no existen debido a que estan
                                       // fuera del numero de elementos, no se pueden eliminar.
                throw new Exception("No hay un elemento en la posicion asignada");
            } else { // Se pueden eliminar elementos debido a que el usuario ingreso una posicion
                     // valida.
                cont--;
                Node temp = start;
                if (pos == 0) {
                    // Se desconecta el primer elemento y se transfiere al siguiente para eliminar
                    // el elemento de la posicion 0.
                    start = temp.getNext();
                } else {
                    // Se eliminan elementos de cualquier otra posicion.
                    for (int i = 1; i < pos; i++) {
                        // Se obtiene cada elemento hasta llegar a la posicion deseada.
                        temp = temp.getNext();
                    }
                    // Se asigna como siguiente al siguiente nodo del nodo actual.
                       
                    Node nextNode = temp.getNext();
                    Node previousNode = temp.getPrevious();
                    previousNode.setNext(nextNode);
                    
                    if (nextNode == null) { // Reconectar al final de la lista.
                        last = previousNode;
                    }else{
                       nextNode.setPrevious(previousNode);
                    }
                }
            }
        }
    }

}
