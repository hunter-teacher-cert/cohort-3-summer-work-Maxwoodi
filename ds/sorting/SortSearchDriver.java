import java.io.*;
import java.util.*;

/** Maxwell Yearwood, Amanda Lee, Qianhui Vanessa*/
public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	System.out.println();
		
	// Uncomment these to test part 2

	int i;
	 i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  System.out.println();

	i = ss.findSmallestIndex(3);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
   System.out.println();  
   System.out.println();  
	
	// Uncomment these to test part 3

      
	System.out.println(ss);
  System.out.println();
      
  System.out.println("Selection sort");
	ss.sort();
  System.out.println();    
	System.out.println(ss);
  System.out.println(); 
	System.out.println();
      
    //Testing Linear Search
    
      
  System.out.println(" Linear Search:value located at index:" + ss.linearSearch(12));
  
  System.out.println();

    // Testing Binary Search
    
      
   int binaryIndex = ss.binarySearch(12);
  System.out.println(" Binary Search result:" + binaryIndex);
  
  System.out.println();


     
    // Testing Binary Recursive Search
  System.out.println("Recursive Binary Search:"+ ss.binarySearchRecursive(12,0, 20));
  System.out.println();

  // // Testing Collections Sort
  // SortSearch ss1 = new SortSearch(20);
  // System.out.println(ss1);
  // System.out.println(" Built in Sort");
  // ss1.builtinSort();
  // System.out.println();

    ArrayList<Integer> list1a= ss.buildIncreasingList(20);
	System.out.println(list1a);
   System.out.println();

	// build a second Arralist here
	ArrayList<Integer> list2a= ss.buildIncreasingList(9);
	System.out.println(list2a);
  System.out.println();
      
	// test your merge routine here
  System.out.println(ss.merge(list1a, list2a));

  //MergeSort:
        
  	ArrayList<Integer> list1 = ss.buildIncreasingList(20);
    System.out.println("\nList1:");
    System.out.println(list1);
  
  	// build a second Arralist here
  	ArrayList<Integer> list2= ss.buildIncreasingList(15);
    System.out.println("\nList2:");
	  System.out.println(list2);
  
  	// test your merge routine here
    ArrayList<Integer> result = ss.merge(list1,list2);
    System.out.println("\nResult (merge of list1 and list2):");
	  System.out.println(result);


    // mergeSort
    // public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
    //        (returns an arrayList)
    ArrayList<Integer> list3= ss.buildIncreasingList(10);
    list3.add(5);
    list3.add(99);
    System.out.println("\nList3:");
	  System.out.println(list3);
    
    ArrayList<Integer> newlist = ss.mergeSort(list3);
    System.out.println("\nTesting mergeSort on arraylist list3:");
    System.out.println(newlist);

   
      
    }
}