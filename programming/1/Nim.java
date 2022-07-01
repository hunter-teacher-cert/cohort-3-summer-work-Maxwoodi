/** Group Members: Greg Sciame, Alana Robinson, Sam Lojacono, Jessica Novillo Argudo, and Maxwell Yearwood */


import java.io.*;
import java.util.*;
import java.lang.Math;

public class Nim
  {
    public static void main(String [] args)
    {
     int stones = 12;
     int stonesTaken;
     String player = "user";


      Scanner input = new Scanner(System.in);
    // loop until game ends
      while(stones > 0)
        {
          if(player == "user")
          {
                 // prompt user for inout(user turn)
          System.out.println("How many stones would you like to remove from the bag?(1,2,3)");
          stonesTaken = input.nextInt();

         // Calculate the number of stones remaining
          stones = stones - stonesTaken;

          System.out.println("There are now" +" "
                             + stones + " stones remaining");  
            if(stones < 1)
            {
              break;
            }
            player = "computer";
          }else if(player == "computer")
          {
            // Check for win
          
         player = "computer";
        stonesTaken = (int)(Math.random()*3) + 1;

          System.out.println("Now the computer selects:" + stonesTaken);
          //Machine turn
          stones = stones-stonesTaken;

          // Check win
            if(stones < 3)
            {
              break;
            }
            player = "user";
          }
            
           
        }
      System.out.println("You win!" + player);
    }
    
  }




     
