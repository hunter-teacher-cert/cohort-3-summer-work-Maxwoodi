import java.util.*;

public class Guess
{
   public static void main(String [] args)
   {

    System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Type a number:");
     int number = keyboard.nextInt();

    System.out.println("Your guess is:" + number);

    int myNumber = (int)(Math.random()* 100) + 1;

    System.out.println("The number I was thinking of is :" + myNumber);

    System.out.print("You were off by: "+ Math.abs(number - myNumber)); 

   }




}