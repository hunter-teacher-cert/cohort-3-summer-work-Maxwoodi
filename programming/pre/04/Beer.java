import java.util.*;

public class Beer
{

public static String firstLine()
  {
    return "bottles of beer on the wall";
  }
public static String secondLine()
  {
    return "bottles of beer";
  }

public static String thirdLine()
  {
    return " ya\' take one down, ya pass it around,";
  }

  public static String fourthLine()
  {
    return " bottles of beer on the wall";
  }

  public static void song(int n)
  {
    System.out.println(n + "" + firstLine());
    System.out.println(n + "" + secondLine());
    System.out.println(thirdLine());
    System.out.println(n-1 + "" + fourthLine());
    System.out.println();
    System.out.println();
  }
public static void lastVerse()
{
  System.out.println("No bottles of beer on the wall,");
 System.out.println("no bottles of beer,");
 System.out.println("ya\' can't take one down, ya\' can't pass it around,");
 System.out.println("\'cause there are no more bottles of beer on the wall!");
 System.out.println();
 System.out.println();
}

  public static void recurseBeer(int n)
  {
    if(n == 0)
    {
      lastVerse();
    }
    else
    {
       song(n);
      recurseBeer(n-1);
     
    }
  }
/*
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
}

public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}*/
public static void main(String [] args)
{

int n = 99;
  recurseBeer(n);



}


}