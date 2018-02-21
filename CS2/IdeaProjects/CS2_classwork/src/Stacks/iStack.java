package Stacks;

/**
 * Created by cody.mellon on 4/12/16.
 */
public interface iStack<T> {
    void push(T item);
    T pop();
    boolean isEmpty();
    int size();
}
