package Queues;

/**
 * Created by cody.mellon on 4/15/16.
 */
public interface iQueue<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
    int size();
}
