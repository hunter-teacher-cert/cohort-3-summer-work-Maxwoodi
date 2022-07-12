import java.util.*;

public class Max
{
// Section 8.12 Part 4
/* Cannot use a for each loop because I do not have access to the indecies*/

public static int indexOfMax(int [] numRay)
{
  int maxInt = numRay[0];
  int indexOfMax = Integer.MIN_VALUE;

  for(int index = 1; index < numRay.length; index++)
  {
     if(numRay[index] > maxInt)
     {
       maxInt = numRay[index];
       indexOfMax = index;
     }

  }
  return indexOfMax;
}

public static void main(String [] args)
{
 
int [] a = {3,4,1,5,10,0,2};
int maxInteger = indexOfMax(a);
  
    System.out.print("The maximum index is:" + maxInteger);
   
}

}