import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;

public class Hash_Map_Demo 
{
    public static void main(String[] args) 
    {
        // Methods to Decelaration for Hash Map

       // HashMap hm = new HashMap();
       // Map hm = new HashMap();
       HashMap <Integer,String> hm = new HashMap<Integer,String>();
       
       hm.put(101, "John");
       hm.put(102, "Scott");
       hm.put(103, "John");  // key cannot be duplicate value may be duplicate
       hm.put(104, "David");
       hm.put(105, "Sachin");
       hm.put(103, "Raina"); // if key is duplicated the old value will be replaced with new value

       System.out.println(hm);


       // Size of Hash Map
       System.out.println(hm.size());

       // Removing an element from Hash map
       System.out.println(hm.remove(102));

       // Access the value of element through key
       System.out.println(hm.get(103));

       // Acess all the keys and values from the Hash map
       System.out.println(hm.keySet());   // to get all keys and values
       System.out.println(hm.values());   // to get all values

       // Methods to get keys and Values
       System.out.println(hm);        // It will print in form of dict
       System.out.println(hm.entrySet()); // It will print in set format


       // Read all the values from Hash map

       // using for each

       for(int k:hm.keySet())
       {
            System.out.println( k + "   "+ hm.get(k));

       }


       // using Iterator

       /*Iterator    it= hm.entrySet().iterator();

       while (it.hasNext()) 
       {
            System.out.println(it.next());
        
       }
            */


       Iterator <Entry<Integer,String>> it= hm.entrySet().iterator();

       while (it.hasNext()) 
       {
            System.out.println(it.next());
        
       }






        
    }
    
}
