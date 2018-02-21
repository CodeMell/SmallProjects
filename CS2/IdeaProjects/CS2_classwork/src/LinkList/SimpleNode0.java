package LinkList;

import com.sedgewick.stdlib.StdOut;

/**
 * Created by sirin on 10/5/15.
 */
public class SimpleNode0
   {

      int value;
      SimpleNode0 previosNode;

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

            //traverse the list dumb way
            while (latestNode != null)
               {
                  SimpleNode0 n = latestNode;
                  StdOut.println("value = " + n.value);
                  StdOut.println("previos = " + n.previosNode);
                  StdOut.println("----------");
                  latestNode = n.previosNode;
               }


         }
   }