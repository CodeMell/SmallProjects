package datastructures;

import com.sedgewick.stdlib.*;

/**
 * Created by cody.mellon on 4/5/16.
 */
public class Test3Sum {
    public static void main(String[] args){
        In in = new In("/Volumes/NO NAME/Computer Science/CS2/IdeaProjects/CS2_classwork/src/datastructures/8ints.txt");
        int[] input = new StdArrayIO(in);
        Stopwatch time = new Stopwatch();
        int count = ThreeSum.count(input);
        double elapsed = time.elapsedTime();
        StdOut.println("Count: "+count);
        StdOut.println("elapsed time: "+elapsed);

    }
}
