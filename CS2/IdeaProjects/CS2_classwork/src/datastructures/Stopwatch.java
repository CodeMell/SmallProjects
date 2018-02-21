package datastructures;

/**
 * Created by iSirin on 4/5/16.
 *
 */
// Simple stopwatch taken from Sedgewick
public class Stopwatch
{
    //private final long start;
    private long start;
    // Stopwatch gets initial time as soon as instance is created
    public Stopwatch()
    { resetStopwatch();

    }

    // At any point we can ask how much time has passed since stopwatch was created
    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
    public void resetStopwatch()
    {
        start = System.currentTimeMillis();
    }

}
