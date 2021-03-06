import java.io.*;
import java.util.*;

/** Maxwell Yearwood
*Collaborators: Sam Lojacono, Harisson Fung,
** Maxwell Yearwood, Amanda Lee, Qianhui Vanessa*/
/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

   /** Instantiates an ArrayList and a Random object, r. Uses a for loop to initialize the ArrayList with 15 random Integer objects */ 
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
   /** Accepts parameter, size, to denote the number of random objects to store in data, ArrayList object. Instantiates and stores an ArrayList object in data.*/ 
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

  
    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end

    */
    public int findSmallestIndex(int start){
	int smallIndex = 0;
  Integer minValue = data.get(0);
	     for(int index = start; index < data.size(); index++)
         {
           if(data.get(index) < minValue)
           {
             minValue = data.get(index);
             smallIndex = index;
           }
         }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList data in place.
       

    */
    public void sort(){
     for(int outer = 0; outer < data.size() - 1; outer++)
       {
          int minIndex=outer;
        
         for( int inner =outer + 1 ; inner < data.size(); inner++)
           {
             if( data.get(inner) < data.get(minIndex))
             { 
               
               minIndex = inner;
             }
           }
            //swap
             Integer temp = data.get(minIndex);
             data.set(minIndex,data.get(outer));
             data.set(outer,temp);
         
       }

    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value)
     {
	    for( int index = 0; index < data.size(); index++)
        {
          if(data.get(index) == value)
          {
            return index;
          }
        }
		return -1; // replace this return
    }
   
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
   public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
     int low = 0;
     int high = data.size();
     int mid = (low + high)/2;
     
	// while we're not done:
     for(int index = 0; index < data.size(); index++)
       {
	//   if the item is at data.get(middle), return middle
         if(data.get(mid)== value)
         {
           return mid;
         }
	//   otherwise, update high, low, and middle
         else if( data.get(mid) < value)
         {
            low = mid + 1;
            mid = (low + high)/2;
         }
         else
         {
           if(data.get(mid) > value)
           {
             high = mid - 1;
             mid = (low + high)/2;
           }
         }
       }
	return -1;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

   public int binarySearchRecursive(int value, int lowIndex, int highIndex)
  {

	// refer to class discussion
	    int mid = (lowIndex + highIndex)/2;
      if( lowIndex > highIndex)
        {    
          return -1;
        }
     
         if(data.get(mid)== value)
         {
           return mid;
         }
	//   otherwise, update high, low, and middle
         else if( data.get(mid) < value)
         {
           return binarySearchRecursive(value, mid + 1, highIndex);
            //mid = (lowIndex + highIndex)/2;
         }
         else 
         {
           {
             if(data.get(mid) > value)
             {
             highIndex = mid - 1;
             }
             //mid = (lowIndex + highIndex)/2;
             return binarySearchRecursive(value,lowIndex, mid - 1);
           }
         }
   
  
}
      
       	    
  
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    
 /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){

	// code for merge
      ArrayList<Integer> together = new ArrayList<Integer>(list1.size() + list2.size());
      
     /**
      while( 0 < list1.size() && 0 <list2.size())
        {
          if( list1.get(0) < list2.get(0))
          {
              together.add(list1.get(0));
            
            list1.remove(0);
          }
          else
          {
            together.add(list2.get(0));
            
            list2.remove(0);
                     
          }
        }
	    while(0 < list1.size())
        {
          together.add(list1.get(0));
          
          list1.remove(0);
        }
       while(0 < list2.size())
         {
           together.get(list2.get(0));
           
           list2.remove(0);
         }*/
  int i = 0, k= 0;
while( i < list1.size() && k <list2.size())
        {
          if( list1.get(i) < list2.get(k))
          {
              together.add(list1.get(i));
            
           // list1.remove(i);
             i++;
          }
          else
          {
            together.add(list2.get(k));
           
            //list2.remove(k);
             k++;
                     
          }
        }
	    while(i < list1.size())
        {
          together.add(list1.get(i));
          
          //list1.remove(i);
          i++;
        }
       while(k < list2.size())
         {
           together.add(list2.get(k));
           
          // list2.remove(k);
           k++;
         }

      
	return together; // replace this line
    }
  
   public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
    
    int n = list.size(); 
    
    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> right = new ArrayList<Integer>();
    //System.out.println(n);
  
//     check for base case (if n < 2)
    if (n < 2) {
      return list;
    }
    
//     if not the base case
    else {
      // split in two lists
      for (int i = 0; i < n/2; i++) {
        left.add(list.get(i));
        // System.out.println(left.get(i));
      }
      // System.out.println(left);
      
      for (int i = n/2; i < n; i++) {
        right.add(list.get(i));
      }

      ArrayList<Integer> sortLeft = mergeSort(left);
      ArrayList<Integer> sortRight = mergeSort(right);

      ArrayList<Integer> sorted = merge(sortLeft,sortRight);
  
      return sorted;
    }
//     split in two lists ???
//     meregSort the left half
//     mergeSort the right half
//     merge them together into a new list
//     return that new list 
      
  }


  public void msort(){
    data =  mergeSort(data);
  }
    
}
