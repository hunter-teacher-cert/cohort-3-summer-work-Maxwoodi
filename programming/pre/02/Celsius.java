import java.util.*;
import java.io.*;

public class Celsius
{
  public static void main( String [] args)
  {
  

   System.out.println(" Enter the temperature in degrees celsius to be converted:");

  Scanner keyboard = new Scanner(System.in);

   final double FRACTION = 9.0/5;
    double celsius = keyboard.nextDouble();
    double farenheit =  celsius * FRACTION + 32; 

    System.out.printf("%.1f C = %.1f F", celsius, farenheit);

  }



}