import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set_Demo 
{
    public static void main(String[] args) 
    {
        // Decelaration of Hash set in Java
       HashSet  my_set = new HashSet();
        // Set my_set = new HashSet();
        //HashSet <String> my_set = new HashSet<String>();
       my_set.add(100);
       my_set.add("welcome");
       my_set.add(10.5);
       my_set.add('c');
       my_set.add(100);
       my_set.add(500);
       my_set.add(null);
       my_set.add(true);
       my_set.add(null);
       
       // System.out.println(my_set);


       // Size of set collection

       System.out.println(my_set.size());


       // Removing an element from hash set
       my_set.remove(500);
       // System.out.println(my_set);


       // Inserting an  element is not possible in Hash set because indexing will not work in Hash set

       // Accessing an element directly is not posiible in Hash set

       // For Acessing an element in Hash set we are converting Hash set Array List

       // Converting Hash set to Array List

       ArrayList al = new ArrayList(my_set);
       //System.out.println(al);

       // For Loop can be accessed after converting Set to list but we can for each loop for Hash set
       
       
       // Reading all elements using normal for
       /*for(int i=0; i<al.size();i++)
       {
        System.out.println(al.get(i));
       }
      */

       // We read all elemennt through for each loop using hash set
       // Using for each
       /*for(Object x:my_set)
       {
        System.out.println(x);
       }
        */


       // using iterator

       Iterator <Object> it = my_set.iterator();

       while (it.hasNext()) 
       {
            System.out.println(it.next());
        
       }
       

       // Removing Multiple value is not possible in Hash Set


       // Removing all the elements is possible in Hash Set

       my_set.clear();
       System.out.println(my_set);

        
    }
    
}
