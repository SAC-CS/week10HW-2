package ScrapProjects;

public class Gamer {

   private String name;
   private int numOfDice;

   public Gamer(String name, int numOfDice) {
      this.name = name;
      this.numOfDice = numOfDice;
   }

   public void setnumOfDice(int numOfDice) {
      this.numOfDice = numOfDice;
   }
   public int getNumDice()
   {
      return numOfDice;
   }

   public int getDice() 
   {
      int random = numOfDice * (1 + (int) (Math.random()) * 6);
      return random;
   }
}
