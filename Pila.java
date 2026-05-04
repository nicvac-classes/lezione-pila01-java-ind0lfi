import java.util.NoSuchElementException;



class Pila<T> {
    private Nodo<T> top;

    public Pila() {
        this.top = null;
    }

    public boolean isEmpty() {
        if(top.dato==null){
            return true;
        }
        return false;
    }

    public void push(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);
        nodo.next = top;
        top = nodo;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pila vuota");
        }
        T dato = top.dato;
        top = top.next;
        return dato;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pila vuota");
        }
        return top.dato;
    }

    public int size() {
        int count = 0;
        Nodo<T> current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> current = top;
        while (current != null) {
            sb.append(current.dato).append(" --> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
