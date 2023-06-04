package homework;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Program8_Hashset
{
    public static void main(String[] args)
    {
        m1();
    }

    public static void m1()
    {
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++)
        {
            if(numbers.contains(i))
            {
                System.out.println(i + " was found in the set.");
            }
            else
            {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
