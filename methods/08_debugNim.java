/**
 * Game of Nim by Team BossCoders
 * Team 5
 * collaborators: Maxwell Yearwood, Amanda Lee, QianHui Vanessa Zou
 */

import java.io.*;
import java.util.*;

public class Nim {

  public static void main(String[] args){
    //setup the number of stones

    int stones = 12;
    int stonesTaken;
    boolean playing = true;
    Scanner input = new Scanner(System.in);
    //print msg to start the game
    //while there are still stones...
    System.out.println("Lets play the game of Nim. There is bag with 12 stones. Your goal is to take the last one.");

    while(playing == true){
      System.out.println(stones + " stones remaining");
      //ask user for input, how many shells do you want to take
      System.out.println("How many stones do you wish to take? Take 1-3");
      stonesTaken = input.nextInt; // ERROR
      System.out.println(stoneTaken + " stones taken"); // ERROR SYNTAX
      input.nextLine();

      //if the user selects anything other than 1 2 or 3, prompt again
      if(stonesTaken >= 0 && stonesTaken <= 3 && stonesTaken <= stones){   // ERROR >= 0
        stones - stonesTaken;  // ERROR
      } else {
        System.out.print("Invalid move, try again");
        continue; //not break! continue goes to the next loop
      }
      //check for a win, if stones = 0, last stone was taken.
      if(stones == 0){
        System.out.println("You win!");
        playing == false; // ERROR LOGICAL
        // break; ERROR LOGICAL 
      }

      System.out.println(stones " stones remaining");  // ERROR syntax

      //ai time...
      //goal is for the stones in bag to be a multile of 4
      if(stones % 4 == 1) {
        //take 1 away, you are in a winning position
        stonesTaken = 1;
      } else if(stones % 4 == 2) {
        stonesTaken = 2;
      } else if(stones % 4 == 3) {
        stonesTaken = 3;
      } else if {  // ERROR
        stonesTaken = 1; //you are in a losing position, hope the user screws up
      }
    
      stones -= stonesTaken; //update the stones
      System.out.println("AI took " + stonesTaken + " stones");

      //check for a win
      if(stones == 0)  // ERROR
        System.out.println("Computer wins!");
        playing == false; // ERROR
        // break; // ERROR
      }
    }
  } // ERROR

    System.out.println("Game Over!")  // ERROR
  }
}
