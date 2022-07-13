import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
   ArrayList<Integer> rand = new ArrayList<Integer>();
    Random random = new Random();

    for( int index = 0; index < size; index++)
      {
                    rand.add(random.nextInt(maxval));                  
             
      }
    
    
    return rand;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
   int sum = 0;

    for(int index = 0; index < dataList.size(); index++)
      {
        sum +=dataList.get(index);
      }
    
    
    return sum;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){

    int temp = dataList.get(index1);
    dataList.set(index1, dataList.get(index2));
    dataList.set(index2, temp);

  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){

    for(int index = dataList.size()-1; index >= 0 ; index--)
      {
        if(dataList.get(index).equals(valueToRemove))
        {
         dataList.remove(index);
        }
      }

  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){

    ArrayList<Integer> totalList = new ArrayList<Integer>();
    for(int index = 0; index < ListA.size(); index++)
      {
        totalList.add( ListA.get(index) + ListB.get(index));
      }
    
    return totalList;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
/**  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    
    ArrayList<Integer> zipper = new ArrayList<Integer>(ListA.size() + ListB.size());
    
     int index = 0;
    while( index < zipper.size())
      {
        if(index < ListA.size())
        {
          Integer num1 = ListA.get(index);
        zipper.add(index,num1);
        }
         index++;
        
        if(index < ListB.size())
        {
          Integer num2 = ListB.get(index);
        zipper.add(index,num2);
        }
        index++;
      }*/

   /** ArrayList<Integer> zipper = new ArrayList<Integer>(30);
   for(int index= 0; index < 30 ; index++)
      {
        if( index %2!= 0)
        {
        zipper.add(ListA.get(index));
        }
         
        
        if(index % 2 ==0)
        {
        zipper.add(ListB.get(index));
        }
      }
    return zipper;//placeholder to compile.
  }*/

public static ArrayList<Integer> zipLists(ArrayList<Integer> ListA, ArrayList<Integer> ListB) {
    int index1 = 0, index2 = 0;
    ArrayList<Integer> zipper = new ArrayList<Integer>();

    while(index1 < ListA.size() || index2 < ListB.size()) {
        if(index1 < ListA.size())
        {
            zipper.add(ListA.get(index1));
            index1++;
        }
        if(index2 < ListB.size())
        {
            zipper.add(ListB.get(index2));
            index2++;
        }  
    }
    return zipper;
}



  public static void main(String[] args) {

    ArrayList<Integer> al;

    // Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);
    System.out.println();
    

    System.out.println("Sum list method");
    System.out.println(sumOfList(al));
    System.out.println();

    // Uncomment these to test swapElements
    System.out.println("Swap Elements.");
     swapElements(al,2,6);
    System.out.println(al);
    System.out.println();

    // Uncomment these to test removeValue
    System.out.println("Add and set methods");
     al.add(5);
     al.add(10);
     al.add(5);
     al.add(13);
     al.set(2,5);
     al.set(3,5);
     System.out.println(al);
     System.out.println();

    System.out.println("The remove method");
     removeValue(al,5);
     System.out.println(al);
     System.out.println();
    
    //Testing SumLists
    System.out.println(" Sum of List ");
   ArrayList<Integer> al2 = buildRandomList(10,100);
    al = buildRandomList(10,100);
    System.out.println(al);
    System.out.println(al2);
    System.out.println(sumLists(al,al2));
    System.out.println();


    //Testing Zip Lists
    
    System.out.println("zipLists");
    al = buildRandomList(10,100);
    al2 = buildRandomList(10,100);
    System.out.println(al);
    System.out.println(al2);
   ArrayList<Integer> al3 = zipLists(al,al2);
    System.out.println(al3);
  }

}