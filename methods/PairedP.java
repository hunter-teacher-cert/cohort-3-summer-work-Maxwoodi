/** Paired Programming with 
  * Kate Maschmeyer
  */


public class PairedP
  {
   public static void barGraphify(int [] nums)
    {

      for( int i = 0; i< nums.length; i++)
        {
          System.out.print( i + ": " );
          for( int j = 0; j < nums[i]; j++)
            {
             System.out.print("=");
              
            }
            System.out.println();
          
        }
      
    }

    public static void vBarGraphify( int [] nums)
    { 
      int max =nums[0];
      
      for( int i = 0; i < nums.length; i++)
        {
          if(nums[i] > max)
          {
            max = nums[i];
          }
        }

      for(int i = 0; i < max; i++)
        {
           for(int j = 0; j< nums.length; j++)
             {
               if(max - j <= nums[j])
               {
                 System.out.print("* ");
               }
               else
               {
                 System.out.print("  ");
               }
               
             }
            System.out.println();
        }
       for(int l = 0; l< nums.length; l++)
         {
           System.out.print(l + " ");
         }
    }
    
   public static void main(String [] args)
    {
      int[] nums = {5,7,2};
       barGraphify(nums);
       vBarGraphify(nums);
    }
    
  }