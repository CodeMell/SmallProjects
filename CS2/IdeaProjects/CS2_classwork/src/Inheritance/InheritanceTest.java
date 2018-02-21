package Inheritance;

import com.sedgewick.stdlib.StdOut;

/**
 * Created by cody.mellon on 4/1/16.
 */
public class InheritanceTest {
    public static void main(String[] args){
        //create people objects
        Person p0 = new Person("John", "66 olde ct", "517-542-6323", "adid@gmail");
        Student st0 = new Student("Steve", "53 newbridge rd", "514-642-5642","fsasfgj@gmail", "freshman");
        Employee e0 = new Employee("Frank", "723 lakeview rd", "532-643-2345", "aehans@gmail", "NS5234", 34134, "10/15/02");
        Faculty f0 = new Faculty("Sally", "254 ocean ave", "234-543-6543", "wiadjs@gmail", "NS3146", 63145, "08/06/12", "MH 2-4", "Professor");
        Staff s0 = new Staff("Alyssa", "4321 albaqurque rd", "654-532-6421", "awjdj@gmail", "CSS315", 21005, "04/13/13", "Janitor");
        //invoke ToString method for each
        StdOut.println(p0.ToString());
        StdOut.println(st0.ToString());
        StdOut.println(e0.ToString());
        StdOut.println(f0.ToString());
        StdOut.println(s0.ToString());
    }
}
