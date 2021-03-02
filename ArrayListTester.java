import java.util.ArrayList;

/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListTester
{
    public static void main(String [] args)
    {
        ArrayList <Integer> myList = new ArrayList <Integer>();
        Integer num = new Integer(5);
        
        System.out.println(myList.size());
        
        
        
        /*
        myList.add(num);
        list.length// length of an array
        word.length() //length of a string
        list.size() // length of an Arraylist
        */
        
       
       //Write code that adds 25 random Integer objects to myList.
       //Random number between 1 and 100 inclusive.
       
       
       for(int i = 0; i<25; i++)
       {
           
           int rand = (int)(Math.random()*100)+1;
           Integer temp = new Integer(rand);
           myList.add(temp);
           
           
       }
       System.out.println(myList.size());
       
        /**
         * 1) output the original arraylist filled with objects
         * 2) Traverse the arrayList and remove any object that is a multiple of 10
         * 3) output the new arrayList without any multiples of 10
         */
       
       Integer test = myList.get(0);
        
        //System.out.println(myList.get(0));
    }
}
