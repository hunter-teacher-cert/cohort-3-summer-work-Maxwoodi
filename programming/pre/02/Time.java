import java.util.*;

public class Time
{
 public static void main(String [] args)
  {
    // Exercise 2.12.3.1
    System.out.println("Hello World!");

   // Exercise 2.12.3.2
   int hour = 14;

   int minute = 30;

   int second = 45;


   // Exercise 2.12.3.3
   int secondSinceMidnight = hour * 3600 + minute * 60 + second;
   System.out.println("Number of seconds from midnight:" + secondSinceMidnight);

   // Exercise 2.12.3.4
   int totalSecondsPerDay = 24 * 3600;

   System.out.println("Number of seconds remaining in a day:" + (totalSecondsPerDay - secondSinceMidnight));

  // Exercise 2.12.3.5
  double percentOfDayPassed = 100* (double)secondSinceMidnight/totalSecondsPerDay;

  System.out.println("Percentage of day passed : " + percentOfDayPassed + "%");
  
  // Exercise 2.12.3.6

  int currentHour = 15;

  int currentMinute = 50;

  int currentSecond = 30;

  int timeElapsedInSeconds = (currentHour - hour)* 3600 + (currentMinute - minute)*60 + (currentSecond - second)* 60;

System.out.print(" Time elapsed since working on this assignment in seconds : " + timeElapsedInSeconds + " " + "seconds");


   
  }



}