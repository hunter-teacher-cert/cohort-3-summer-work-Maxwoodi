/**
 * Recursion Practice with Strings by Team SweatEquity
 * Maxwell Yearwood
 * collaborators: Mike Randazzo, Ben Eckley, Qianhui Vanessa Zou
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
     fenceR(3) -> "|--|--|"
  */
  public static String fenceR( int n )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    if(n == 1)
    {
      return "|";
    }
    else if ( n==0)
    {
      return " ";
    }
    else return fenceR(n-1) + "--|";
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}