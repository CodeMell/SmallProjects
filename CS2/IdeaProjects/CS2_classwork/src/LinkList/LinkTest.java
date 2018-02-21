package LinkList;

/**
 * Created by cody.mellon on 4/19/16.
 */
public class LinkTest {
    public static void main(String[] args)
    {
        final int maxLinks = 5;
        SimpleNode0 latestNode = null;
        //create linked list
        for (int i = 0; i < maxLinks; i++)
        {
            SimpleNode0 node = new SimpleNode0();
            node.previosNode = latestNode;
            node.value = i;
            latestNode = node;

        }
}
