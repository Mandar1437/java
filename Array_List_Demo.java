import java.util.ArrayList;
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


        
    }
    
}
