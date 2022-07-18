import java.io.*;
import java.util.*;

/**
* Maxwell Yearwood
*collaborators: Will, Thea, and Jerusha
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){

    Node walker = new Node();
    walker.setData(value) ;
    walker.setNext(null);
    walker.setNext(head);
    head = walker;

  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker;
    walker = head;
 for(int i = 0; i <=index; i++)
   {
     if(i == index)
     {
       return walker.getData(); // walker
     }
      walker = walker.getNext();

   }
    return "";
  }

  
 //Return a string representation of the list
  
   public String toString(){
    Node walker = head;
    String temp = " ";

    while( walker!= null)
      {
       temp = temp + walker;
       walker= walker.getNext();
      }
     temp = temp + "null";
    return temp ;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    int count = 0;
    Node walker = head;
    while(walker != null)
      {
        
        count++;
        walker = walker.getNext();
      }
    return count;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
     
  public void add(int index, String value){
    Node node = new Node();
    node.setData(value) ;
    node.setNext(null);
    

    if(index == 0)
    {
      add(value);
    }
    else
    { 
      Node walker = head;
      
   for( int i= 0; i < index-1 ; i++)
     {
       
       walker = walker.getNext();
       
     }
     node.setNext(walker.getNext());
      
      walker.setNext(node);

          
    }
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
    
  public int indexOf(String value){

    Node walker = head;
    int index = 0;

    while( walker.getNext()!= null)
      {
        if(walker.getData().equals(value))
        {
          return index;
        }
        index++;
        walker = walker.getNext();
      }

    
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.
*/
  
  public String[] toArray(){
    Node walker = new Node();
      walker = head;
  String[] nodeRay = new String[size()];
     int count = 0;
    while(walker.getNext()!=null)
      { 
        //System.out.println(count);
        nodeRay[count] = walker.getData();
       // System.out.println(walker.getData());
        walker = walker.getNext();
        count++;
        
      }
      nodeRay[count]= walker.getData();

   /** for(int index = 0; index <= nodeRay.length; index++)
      {
        nodeRay[index] = walker.getData();
        walker= walker.getNext();
      }*/
    return nodeRay;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
 public void remove(int index){
   
  if(index ==0)
  {
    head = head.getNext();
  }
   else
  {
   Node walker = head;
   Node n1 = head ;
  for(int i = 0; i < index-1; i++)
  {
    walker = walker.getNext();
  }
    System.out.println(n1);
    System.out.println(walker);
    System.out.println("I am here");
   n1 = walker.getNext();
    System.out.println(n1);
   walker.setNext(n1.getNext());
    System.out.println(walker);
    n1 = null;
    System.out.println(n1);
  } 
 } 
}