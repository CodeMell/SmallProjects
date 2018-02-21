package LinkList;

import com.sedgewick.stdlib.StdOut;

/**
 * Created by sirin on 10/15/15.
 */
public class SimpleNode1
{
    char value;
    SimpleNode1 previosNode;

    public static void main(String[] args)
    {
        final int maxLinks = 5;
        SimpleNode1 latestNode = null;
        //create linked list
        for (int i = 0; i < maxLinks; i++)
        {
            SimpleNode1 node = new SimpleNode1();
            node.previosNode = latestNode;
            node.value = (char)(97+i);
            latestNode = node;

        }
        SimpleNode1 n = latestNode;
        StdOut.println("Value = " + n.value);
        while (n != null)
        {
            StdOut.println("Value = " + n.value);
            n = n.previosNode;
        }
        StdOut.println("---------------");
       SimpleNode1 temp=new SimpleNode1();
        temp.value='x';
       latestNode.previosNode=temp;

    }
}
