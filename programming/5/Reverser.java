/**
 * Recursive String Reverser by Team Palindromotosis
 * Maxwell Yearwood
 * collaborators: Mike Randazzo, Ben Eckley, Qianhui Vanessa Zou
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  { 
    int n = s.length();
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    if(n == 1)
    {
      return s;
    }
    else{ 
      return reverseR(s.substring(1)) + s.charAt(0);
    } 
      //System.out.print(charAt(i)); 
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}