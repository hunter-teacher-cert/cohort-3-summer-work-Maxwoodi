import java.util.*;
import java.io.*;
/** Maxwell Yearwood and Joel Bianchi*/

public class 06_scaffold_arrays{

  public static void main(String[] ants ){

    /* Test code to be provided */
    //1. Printing
    String word = " Strong";
    printLetters(word); 
    System.out.println();

    
    int [] aRay = { 2, 10, 4, 11, 0, 9};
    printArray(int[] arr);
    System.out.println();
    
    //2. Searching & Replacing
    
    searchReplaceString(word, "S", "A");
     System.out.println();
    
    //3. 
    searchReplaceArray(arr, 0, -1);
     System.out.println();
    
    //4. Testing Equality
    String word1 = "Lapel";
    String word2 = " Lapiz";
    int [] arr1 = { 9, 2, 5, 7, 10};
    int [] arr2 = {10, - 2, 5, 7, 90};
    System.out.print(isSameString(word1, word2));
    System.out.print(isSame(arr1, arr2));
   
    //5. String Traversal

    System.out.print(reverseString(word));
    System.out.println(reverseArray(arr));

    
    
  }


  //1a. Print all the characters in a String
  public static void printLetters(String word){

    //loop through each letter in the String
    for(int index = 0, index < word.length() - 1; index++)
      {
         //get each letter
       String letter = word.substring(index, index+1);
        //print each letter
        System.out.print( letter + " ");
      }
      
  }
  
  //1b. Print all the elements of the array
  public static void printArray(int[] arr)
  {
    for(int index = 0; index < arr.length; index++)
      {
        // get each element
        int elem = arr[index];
        System.out.print( elem + " ");
      }
    
    
  }

  //2a. Search a String for a letter and replace
  public static void searchReplaceString(String word, String searchLetter, String replaceLetter){
  for(int index = 0; index < word.length() - 1; index++)
      { String word1 = " ";
         //get each letter
       if(word.substring(index,index+1).equals(searchLetter))
          {
             word.substring(index, index + 1) = replaceLetter; 
          }
       
      }
  
    
  }
  
  //2b. Searching & Replacing
  public static void searchReplaceArray(int[] arr, int searchNum, int replaceNum){
    for(int index = 0; index < arr.length; index++)
      {
        if(arr[index] = searchNum)
        {
          arr[index]= replaceNum;
        }
        
      }

    
  }

  //3a. Check if 2 Strings have the same letters
  public static boolean isSameString(String word1, String word2){
    boolean flag = true;

    //check if the words have the same length
   if(word1.length()== word2.length())
   {      //if so, loop through each index
     for( int index = 0; index < word1.length(); index++)
       {
           //compare the letters from each word
         if( word.substring(index, index +1) != word2.substring(index, index + 1))
         {  //return false if letters aren't the same
           return false;
         }
           
       }

     
   }
      //return true if the whole words have the same letters
   return flag; 

  }

  
  //3b. Test if 2 arrays have the same values
  public static boolean isSame(int[] arr1, int[] arr2){

   boolean flag = true;
    if(arr1.length == arr2.length)
    {
      for(int index =0; index< arr1.length; arr1)
        {
          if( arr1[index] != arr2[index])
          {
            return false;
          }
        }
    }
    return flag;
  }

  //4a. Reverse a word
  public static String reverseString(String word){
  String revWord = " ";
    for(int index = word.length()-1; index > 0; index--)
      {
        revWord += word.substring()
      }
   return revWord;
    
  } 
  
  //4b. Reverse the given Array
  public static int[] reverseArray(int[] arr)
  {
    for(int index = 0; index < arr.length/2; index++)
      {
         int temp = arr[index];
         arr[index] = arr[arr.length - 1 - index];
         arr[arr.length-1 - index] = temp;
      }

    return arr; 
  }
  

  
  
}