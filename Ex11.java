/* Ex10RandomPointsStarter
   CS 111B Starter Program for Exercise for Chapter 10

   Written by Aung Nanda Oo
   Your job is to write the loop condition and
   function body to complete the program below.

   The function should generate random (x,y)
   coordinates between 1-10, and return a Point object 
   with those coordinates.
   This program randomly generates locations for 
   two players, repeating until one of their 
   coordinates are the same for both players.
*/

import java.awt.Point;
import java.util.Random;

class Main
{
   static Random random = new Random();
  public static void main(String[] args) 
  {
    Point player1_location, player2_location;

    System.out.println("This program randomly generates (x,y) locations");
    System.out.println("between 1-10 for two players, repeating until");
    System.out.println("one of their coordinates are the same for both players.");
    do
    {
      player1_location = randomNewPlayerLocation();
      player2_location = randomNewPlayerLocation(); 
      
      System.out.println("Player1 location: (" + player1_location.x 
                         +"," + player1_location.y + ")");
      System.out.println("Player2 location: (" + player2_location.x
                         +"," + player2_location.y + ")");
      System.out.println();

      // DON'T CHANGE ANY OF THE ABOVE CODE
    }while(player1_location.x != player2_location.x && player1_location.y != player2_location.y);
    //while(!(player1_location.equals(player2_location)));

  }

  // Generates random (x,y) coordinates between 1-10, then
  // returns a Point object with those coordinates.
  static Point randomNewPlayerLocation()
  {
    // WRITE YOUR FUNCTION BODY HERE
    //Point randomNewPlayerLocation = new Point();
    int x = 1+random.nextInt(10);
    int y = 1+random.nextInt(10);
    return new Point(x,y);

    
  }
}

/* Here is the Sample Output your completed program should produce:
#1
This program randomly generates (x,y) locations
between 1-10 for two players, repeating until
one of their coordinates are the same for both players.
Player1 location: (5,3)
Player2 location: (10,6)

Player1 location: (8,8)
Player2 location: (10,2)

Player1 location: (3,2)
Player2 location: (5,3)

Player1 location: (3,4)
Player2 location: (2,6)

Player1 location: (7,2)
Player2 location: (2,6)

Player1 location: (10,6)
Player2 location: (5,3)

Player1 location: (2,4)
Player2 location: (3,7)

Player1 location: (4,5)
Player2 location: (6,6)

Player1 location: (8,5)
Player2 location: (5,10)

Player1 location: (4,7)
Player2 location: (4,8)

#2
This program randomly generates (x,y) locations
between 1-10 for two players, repeating until
one of their coordinates are the same for both players.
Player1 location: (6,3)
Player2 location: (2,1)

Player1 location: (7,3)
Player2 location: (10,4)

Player1 location: (6,5)
Player2 location: (7,9)

Player1 location: (8,9)
Player2 location: (2,6)

Player1 location: (10,10)
Player2 location: (3,10)
*/