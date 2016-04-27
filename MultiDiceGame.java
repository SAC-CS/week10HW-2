package ScrapProjects;

import java.util.Scanner;

public class MultiDiceGame {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Variables
      boolean playagain = true;
      int count = 0;
      int win = 0;
      int loss = 0;
      String again = null;

      //set default
      Gamer diceroll = new Gamer("Angie", 0);
      P2 player = new P2("Angie", 0, 0);

      System.out.printf("%s\n%d\n%d\n%d", player.getName()
              , player.getlossCount(), player.getwinCount()
              , diceroll.getNumDice());

      //set name
      System.out.print("\nEnter name: ");
      String name = input.nextLine();
      player.setName(name);

      System.out.print("Hi " + player.getName());
      //game loop

      while (playagain) 
      {
         count++;
         
         System.out.print("\nEnter number of dice: ");
         int diceNum = input.nextInt();
         diceroll.setnumOfDice(diceNum);
         int dice = diceroll.getDice();
         
         if (dice %2 == 0)
         {
            dice = 2;
         }
         else
         {
            dice = 1;
         }
         
         //System.out.printf("Dice = %d", dice);
         
         System.out.print("\nEnter your guess(odd = 1; even = 2): ");
         int guess = input.nextInt();
         
         if(guess == dice)
         {
          win++;
          System.out.println("Your guess is correct!");
         }
         else{
            loss++;
            System.out.println("Incorrect!");   
         }
         System.out.printf("Dice = %d", dice);
         System.out.print("\nPlay again?(y/n): ");
         input.nextLine();
         again=input.nextLine();
         
         if (again.equals("n") || again.equals("N"))
         {
         playagain = false;
         }
      }
      System.out.printf("Total game played: %d\nTotal win: %d\nTotal loss: %d", count,win,loss);
   }
}

// Good.  Please see if you can track the game stats in the Gamer object
