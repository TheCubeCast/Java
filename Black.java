import java.util.Scanner;

public class Black{
    static int score;
    public static void main(String[] args) {
    playGame();
    }
   public static boolean prompt() {
      Scanner in = new Scanner(System.in);
      System.out.println("Would you like to draw? enter y if yes");
      String choice = in.nextLine();   
      if (choice.equals("y")) {
         return true;
      }
      return false;
   }
   public static void playGame() {
      Scanner in = new Scanner(System.in);
      score = 0;
      
      do {
         int card = (int)(Math.random()*13) + 1;
         System.out.println("your drew a " + card + "!");
         
         if(card == 1)
         {
            System.out.println("Would you like your ace to be worth an 11?");
            if(in.nextLine().equals("y")) card = 11;
         }
         else if(card > 9) card = 10;
         
         score +=card;
         System.out.println("your score is " + score + "!");
         
         if(score > 21)break;
      }while(prompt());
      
      if(score > 21){
         System.out.println("Sorry, you lose!");
      }
      else if(score <= 17){
         System.out.println("you lose, your score was too low");
      }
      else{
         System.out.println("You win!");
      }
   }
}