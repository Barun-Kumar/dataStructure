package array;

import java.util.Iterator;

public interface List<E> {

    int size();

    boolean isEmpty();

    boolean contains(E element);

    Iterator<E> iterator();

    boolean add(E element);

    boolean remove(E element);

    void clear();

    E get(int index);

    E set(int index, E element);

    void add(int index, E element);

}
