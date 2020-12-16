package pr11;

public interface Queue<E> {

    void enqueue(E e);

    E element();

    E dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
