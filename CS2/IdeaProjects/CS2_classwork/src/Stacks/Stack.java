package Stacks;

/**
 * Created by cody.mellon on 4/12/16.
 */

public class Stack<T> implements iStack<T> {
    protected Object [] stackContents;
    protected int stackIndex;
    protected static int maxStackSize = 10;
    @Override
    public void push(T item){
        assert stackIndex < maxStackSize - 1;
        stackIndex++;
        stackContents[stackIndex] = item;
    }

    @Override
    public T pop(){
        assert stackIndex >= 0;

        T result = (T) stackContents[stackIndex];

        stackIndex--;
        assert stackIndex >= -1;

        return result;
    }

    @Override
    public boolean isEmpty(){
        return stackIndex < 0;
    }

    @Override
    public int size(){
        return stackIndex;
    }
}
