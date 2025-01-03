import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List_Demo 
{
    public static void main(String[] args) 
    {
        // Decelaration
        ArrayList my_list = new ArrayList();
        // Decelaration type 2
        // List my_list = new ArrayList<>();

        // type
        // ArrayList <Integer>my_list = new ArrayList<Integer>();


        // Adding data into array_list

        my_list.add(100);
        my_list.add("Welcome");
        my_list.add(true);
        my_list.add(10.5);
        my_list.add(100);
        my_list.add(null);
        my_list.add(null);


        // tofind size of array list

        System.out.println(my_list.size());
        
        // to print elements of array
        System.out.println(my_list);

        // To remove an element from array list

        // Method  by Indexing
        my_list.remove(4);
        System.out.println("After Removing an element from array list :" + my_list);

        // Inserting an element in array list
        my_list.add(2, 500);
        System.out.println("Array List after inseting" + my_list);

        // Replacing an array element in array list
        my_list.set(1, "java");
        System.out.println("After modifing array list" + my_list);

        // Accessing an array element from the list

        System.out.println(my_list.get(3));


        //  Accessing  all the array element from the list

            // Method-1 Using For loop

        /*for(int i =0; i<my_list.size(); i++)
        {
            System.out.println(my_list.get(i));
        }
        */
         // Method -2 Using Enhanced For loop

         /*for(Object  x:my_list )
         {
            System.out.println(x);
         }
        */
         // Method -3 Iterator

         Iterator it = my_list.iterator();

         while(it.hasNext())    // this method will check the weather the element at specific index is present or not
         {
            System.out.println(it.next()); // this method will store an element if presesnt
         }

        // Checking an array element in Array list

        System.out.println(my_list.isEmpty());


        // Removing multiple elements from an array list

        ArrayList my_list2 = new ArrayList();
        my_list2.add(100);
        my_list2.add(null);
        my_list2.add(null);

        my_list.removeAll(my_list2);

        System.out.println(my_list);


        // Removing all the elements from the array list

        my_list.clear();
        System.out.println(my_list);
        System.out.println(my_list.isEmpty());


        
    }
    
}
