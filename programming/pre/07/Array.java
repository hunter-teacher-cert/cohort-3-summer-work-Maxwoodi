import java.util.*;

public class Array
{
 // Exercise 8.12.1 Part 1
 public static double [] powArray(double [] ray)
 {
   double [] squareRay = new double[ray.length];
   for( int index = 0; index < ray.length; index++)
   {
     squareRay[index] = Math.pow(ray[index], 2.0);
   }

   return squareRay;
 }


  
// Exercise 8.12.1 Part 2
  
  public static double [] powArray(double [] ray, double n)
 {
   double [] squareRay = new double[ray.length];
   for( int index = 0; index < ray.length; index++)
   {
     squareRay[index] = Math.pow(ray[index], n);
   }

   return squareRay;
 }


  
// Exercise 8.12.1 Part 2 A
  public static int [] randomArray(int size)
  {
    Random random = new Random();
    int [] a = new int[size];
    for(int i = 0; i < a.length; i++)
      {
        a[i] = random.nextInt(100);
      }
    return a;
  }
  
  public static int [] histogram( int [] scores)
  {
   int [] counts = new int[scores.length];

    for(int score : scores)
      {
        counts[score]++;
      }
    return counts;
  }

  
 // Exercise 8.12.1 Part 2 B
 public static int [] histogram(int [] scores, int numCounter)
 {
    int [] counts = new int[numCounter];

   for(int score: scores)
   {
     counts[score]++;
   }
  return counts;

 }

  public static void main(String [] args)
  {
    // Exercise 8.12.1 Part 1 A
  double [] ray = {2.5,3.0,7.5, 4.0,1.5};

    double [] doubleRay = powArray(ray);
    for(int i = 0; i< ray.length; i++)
      {
        System.out.print(doubleRay[i] + " ");
      }


    // Exercise 8.12.1 Part 1 B
    int num = 3;
    double [] doubleRay1 = powArray(ray,num);
    for(int j = 0; j < ray.length; j++)
      {
        System.out.print(doubleRay1[j] + " ");
      }


    
     // Exercise 8.12.1 Part 2 A

     int size = 100; 
  
     int [] scores = randomArray(size);

    int [] counter1 = histogram(scores);
    
    System.out.println("Counter for histogram(scores):");
    for(int e:counter1)
      {
        System.out.println(e + " ");
      }

    
    

     // Exercise 8.12.1 Part 2 B
    int n = 100;
    int [] counter2 = histogram(scores,n);
    System.out.println(" Counter for histogram(scores,n):");
    for(int y: counter2)
      {
        System.out.println(y + " ");
      }

      
  }
}