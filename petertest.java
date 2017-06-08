import java.util.Scanner;

public class petertest{
    public static void main(String[] args) {
    playGame();
    }
   public static boolean prompt() {
      Scanner in = new Scanner(System.in);
      System.out.println("Whats your name?");
      String choice = in.nextLine();
      System.out.println("Oh, your name is "+ choice +"!");
    }
