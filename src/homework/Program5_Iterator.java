package homework;
/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.HashSet;
import java.util.Iterator;

public class Program5_Iterator
{
    public static void main(String[] args)
    {
        arrayIterator();
    }
    public static void arrayIterator()
    { //hashset declaration
        HashSet<String> set=new HashSet<>();
        set.add("Java");
        set.add("Selenium");
        set.add("API");
        set.add("SQL");

        // it will iterate the object and output will not come in sequence
        Iterator<String> list= set.iterator();
        while (list.hasNext())
        {
            System.out.println(list.next());
        }

    }
}
