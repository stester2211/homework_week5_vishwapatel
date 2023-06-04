package homework;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program9_KeysValue
{
    public static void main(String[] args)
    {
        arrayKeysValue();
    }
    public static void arrayKeysValue()
    {
        Map<Integer,String> people=new HashMap<>();
        people.put(1,"Vishwa");
        people.put(2,"Poonam");
        people.put(3,"Ekta");
        for (Map.Entry<Integer,String> name :people.entrySet() )
        {
            System.out.println(name.getKey()+" "+ name.getValue());
        }
    }
}
