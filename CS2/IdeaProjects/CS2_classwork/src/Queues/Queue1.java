package Queues;

/**
 * Created by sirin on 4/14/16.
 */
public class Queue1<T> implements iQueue<T>
{
    public Queue1()
    {
        queueContents = (T[]) new Object[maxQueueSize]; // Make room for a predetermined number of objects
    }

    private Object [] queueContents; // Our items will be stored in this array
    private int head = 0;  // Items get removed starting here
    private int tail = 0;   // Items get added starting here
    private final int maxQueueSize = 10;

    private int currentQueueSize = 0;

    public void enqueue(T item)
    {
        assert currentQueueSize < maxQueueSize; // Why?

        queueContents[tail] = item;
        tail = (tail + 1) % maxQueueSize;
        currentQueueSize++;
    }

    public T dequeue()
    {
        assert currentQueueSize > 0;

        T result = (T) queueContents[head];
        queueContents[head] = null; // Why?
        head = (head + 1) % maxQueueSize;
        currentQueueSize--;

        assert currentQueueSize >= 0;
        return result;
    }

    public boolean isEmpty()
    {
        boolean result = size() == 0;
        return result;
    }

    public int size()
    {
        return currentQueueSize;
    }
}

