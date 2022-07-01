// Game of Nim personally redone after class

import java.io.*;
import java.util.*;

public class NimRedo
{
  public static void main(String [] args)
  {
 int stones = 12;
int stonesTaken;
String playerStatus = "Human Wins!";

    // Read User Input

    Scanner keyboard = new Scanner(System.in);

    // Loop until game ends

    while(stones > 0)
    {
      // Human withdrawls
     System.out.println("Human ! Select the number of stones from the bag( 1, 2 , or 3)");

      stonesTaken = keyboard.nextInt();
      
     
      
    // Calculate and print the number of stones remaining
      stones -= stonesTaken;
      System.out.println("There are: " + " " + stones + " "+    "stone(s) remaining"); 

      
    // Check if human wins
      if( stones <= 0)
      {
       playerStatus = "Human wins!";
        
      }

      
    // AI's turn to select
      if(stones > 0 )
      {
    System.out.println("Computer randomly withdraws stones from the bag( 1, 2 , or 3)");
     
      stonesTaken = (int)(Math.random()*3) + 1;
       System.out.println(" AI selected:" + "" +  stonesTaken + " " + "stone(s)");
      
    // Calculate and pring the number of stones remaining

     stones -= stonesTaken;
      
     System.out.println("There are: " + " " + stones + " "+    "stone(s) remaining"); 
      
    // check if AI wins
      if(stones <= 0)
      { 
        playerStatus = "Computer Wins!";
        
      }
      }
    }
    
    keyboard.nextLine();
    System.out.print("Who wins?" +  playerStatus);
  }
}