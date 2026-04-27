import java.util.NoSuchElementException;

class Nodo<T> {
    T dato;
    Nodo<T> next;

    public Nodo(T dato) {
        this.dato = dato;
        this.next = null;
    }
}

class Pila<T> {
    private Nodo<T> top;

    public Pila() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
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

    @Override
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