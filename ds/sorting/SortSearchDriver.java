import java.io.*;
import java.util.*;

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

    ArrayList<Integer> a= ss.buildIncreasingList(20);
	System.out.println(a);

	// build a second Arralist here
	

	// test your merge routine here
  
      
    }
}