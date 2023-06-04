package homework;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Program3_ReverseNumber
{
    public static void main(String[] args)
    {
        reverse();
    }
    public static void reverse()
    {
        int[] my_array1 = {1,5,7,8,2,3};
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
}
