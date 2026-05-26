
package javaapplication5;
import java.util.Random;
import java.util.Scanner;


public class JavaApplication5 {
static void capture(){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String moves[]= {"rock", "paper", "scissors"};
    String playerMove;
    String playAgain = "yes";
    int cpuScore=0;
    int playerScore=0;
    String computerMove;
    
    do{
    System.out.println("===================================================");
    System.out.println("Welcome to the rock, paper, scissors simulator");
    System.out.println("====================================================");
    
    //Prompt the player to enter their move.
    System.out.print("Enter your move (rock, paper or scissors): ");
    playerMove = sc.nextLine().toLowerCase();
    
    if(!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")){
        System.out.println(playerMove+ "is not a valid input");
    }
    //Computer logic
    //Generate the computer's move randomly.
    computerMove = moves[rand.nextInt(3)];
    System.out.println("Computer choice: "+ computerMove);
    
    //Win/lose/draw conditions
    if(playerMove.equals(computerMove)){
        System.out.println("Draw!");
        System.out.println("Player: "+ playerScore +" "+ "Computer: "+ cpuScore);
    }
    
    else if(playerMove.equals("paper") && computerMove.equals("rock") || 
            playerMove.equals("scissors") && computerMove.equals("paper") ||
            playerMove.equals("rock") && computerMove.equals("scissors")){
            System.out.println("You win!");
            playerScore++;
            System.out.println("Player: "+ playerScore +" "+ "Computer: "+ cpuScore);
    }
    
        else if(computerMove.equals("paper") && playerMove.equals("rock") || 
            computerMove.equals("scissors") && playerMove.equals("paper") ||
            computerMove.equals("rock") && playerMove.equals("scissors")){
            System.out.println("You lose!");
            cpuScore++;
            System.out.println("Player: "+ playerScore +" "+ "Computer: "+ cpuScore);
    }
    
    else{
        System.out.println("Invalid Input!");
    }
    
  
        System.out.println("Play again?");
        playAgain = sc.nextLine().toLowerCase();
    }while(playAgain.equals("yes"));
    System.out.println("Thanks for playing!");
    System.out.println("Final score: ");
    System.out.println("You: "+ playerScore + " " +"Computer: "+ cpuScore);
    }
 
    public static void main(String[] args) {
     capture(); /*

• Display both moves and announce the round result.
• Update and display the current score.*/

       
    }
}
    
