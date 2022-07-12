import java.util.*;

public class Craps
{
  public static int roll(int maxDiceValue)
  {
    int random = (int)(Math.random() * maxDiceValue) + 1;

    return random;

  }

  public static int shoot(int numOfDice, int maxDiceValue)
  {
    int total = 0;
    for(int i = 1; i <= numOfDice; i++)
      {
        total +=roll(maxDiceValue);
      }
  return total;
  }

  public static String round()
  { 
    //int firstShoot = shoot(numOfDice, maxDiceValue);
    int firstShoot = shoot(2, 6);
    
   if(firstShoot == 2 || firstShoot==3|| firstShoot == 12  )
   {
     return "Crap - you lost";
   }
   else if ( firstShoot==7 || firstShoot ==11)
   {
     return "Natural - you won";
   }
  else
   {
    //int nextShoot = shoot(numOfDice, maxDiceValue);
    int nextShoot = shoot(2,6);

    while( nextShoot != 7)
      {
       if(nextShoot == firstShoot)
       {
         return " You win";
       }
          //nextShoot =  shoot(numOfDice, maxDiceValue);
           nextShoot = shoot(2,6);
      }
     return "Craps you lose";
     }
  }
  
  public static void main(String [] args)
 {
   

    /*Command line arguments
   int maxDiceValue =Integer.parseInt(args[2]) = 6;
   int numOfDice = Integer.parseInt(args[1]) = 2;
   int numRounds = Integer.parseInt(args[0]) = 4;
   **/
    
   
  
   for(int i = 1; i <= Integer.parseInt(args[0]); i++)
     {
       System.out.println("Round:" + " " + i  +  " " + "status: win or lose:" + round());
     }
        
      }
  }
