import java.util.*;

public class Seive
{
 public static boolean [] seive(int [] prime)
 {
   boolean [] primeRay = new boolean[prime.length];

   for(int index = 2; index < prime.length ; index++)
   {
      primeRay[index] = true;
   
   }

   for(int p = 2; p < prime.length; p++)
     {
       if(primeRay[p])
       {
         for( int i = 2*p; i < prime.length; i +=p)
           {
             primeRay[i] = false;
           }
       }
       
     }
   return primeRay;

 }

public static void main(String [] args)
{
int [] bool = {1,2,3,4,6,7,};
boolean [] result = seive(bool);

  for(boolean e : result)
    {
      System.out.print( e + " ");
    }

}


}