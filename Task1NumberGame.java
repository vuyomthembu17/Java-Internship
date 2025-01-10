/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1.number.game;

//include imports
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Vuyo
 */
public class Task1NumberGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException 
    {
        //Scanner for user input
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\nWelcome gamer to the Number Game.\nThe game will generate random numbers b/w 1-100.");
        System.out.println("What to do you have to guess a random number.\nYour score will be the number of attempts you took to guess the number.\n");
        System.out.print("Enter the Number of Rounds (between 1-5) you want to play the Game : ");
        int rounds = obj.nextInt();

        for (int i = 1; i <= rounds; i++) 
        {
            System.out.println();
            System.out.println("Round " + i + " begins ...\n");

            System.out.println("Please Enter the Difficulty Level:\n1 --> Easy [There is No Limit for number of attempts]\n2 --> Hard [There is Limit for number of attempts]");
            int limits = obj.nextInt();

            //Swtich statement for different cases
            switch (limits) 
            {
                case 1: 
                {
                    System.out.println("Opted for Easy Difficulty.\nHence, there is No Limit to number of attempts\n");

                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (true) 
                    {
                        System.out.print("Enter a number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) 
                        {
                            System.out.println("The number " + guess + " is HIGHER than Generated Number. You have to Guess again...");
                        }
                        else if (guess < randomNumber) 
                        {
                            System.out.println("The number " + guess
                                    + " is LOWER than Generated Number. You have to Guess again...");
                        }
                        else 
                        {
                            System.out.println("The number " + guess + " is EQUAL to the Generated Number.\nCongrats it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    break;
                }
                case 2: 
                {
                    System.out.println("Opted for Hard Difficulty.\nHence, there is a Limit to number of attempts");
                    System.out.println(
                            "The limit is just 5.\nIf you have guessed the number in 5 or less attempts you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (count <= 5) 
                    {
                        System.out.println("\nNo of guesses remaining : " + (6 - count) + " ...\n");
                        System.out.print("Enter your guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) 
                        {
                            System.out.println("The number " + guess
                                    + " is HIGHER than Generated Number. You have to Guess again...");
                        } 
                        else if (guess < randomNumber) 
                        {
                            System.out.println("The number " + guess
                                    + " is LOWER than Generated Number. You have to Guess again...");
                        } 
                        else 
                        {
                            System.out.println("The number " + guess + " is EQUAL to than Generated Number.\nCongrats it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    if (count > 5) 
                    {
                        System.out.println("OOPS!!! You were not able to guess the number in 5 attempts.\nThe Generated Number was "
                                        + randomNumber + "\nBETTER LUCK NEXT TIME\n");
                    }
                    break;
                }
                default: 
                {
                    System.out.println("--- WRONG INPUT ---\n Sorry!!! But this round has been wasted.");
                    break;
                }
            }

            System.out.println("ROUND " + i + " is OVER.");
        }
        System.out.println("\nAll the Rounds are over.\nGame Over.\nThank You for Playing the Game.\nSee you next time.");
        obj.close();
    }
}
