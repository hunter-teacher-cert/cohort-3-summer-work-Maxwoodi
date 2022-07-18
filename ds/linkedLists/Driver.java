/**
* Maxwell Yearwood
*collaborators: Will, Thea, and Jerusha
*
*/

import java.io.*;
import java.util.*;


public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("single");
    l.add("bachelor");
    l.add("roster");
    l.add("sammy");
    l.add("John");
    l.add("Chris");
    l.add("Huang");
    System.out.println(l);
    System.out.println();

   System.out.println(l.get(1));
   System.out.println();

    System.out.println(l.size());
    System.out.println();

    l.add(2,"sheema");
    System.out.println(l);
    System.out.println();


   
    System.out.println(l.indexOf("roster"));
    System.out.println();

 //Testing toArray()
   String [] nodeArray = l.toArray();
    for(int index = 0; index < nodeArray.length ; index++)
      {
        System.out.print(nodeArray[index] + " ");
      }
    System.out.println();
    

    l.remove(3);
    System.out.println(l);
    System.out.println();
    
  }
}