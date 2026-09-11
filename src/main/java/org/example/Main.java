package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String prithee = "Shall I compare thee to a summer’s day?\n" +
                "Thou art more lovely and more temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date;\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm’d;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature’s changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow’st;\n" +
                "Nor shall death brag thou wander’st in his shade,\n" +
                "When in eternal lines to time thou grow’st:\n" +
                "   So long as men can breathe or eyes can see,\n" +
                "   So long lives this, and this gives life to thee.\n";
        
        // Useful variables, split prithee into an array
        String[] pritheeTokens = prithee.split(" ");
        String guess = "";
        int correctGuesses = 0;
        int wrongGuesses = 0;
        Random rand = new Random();

        // Keep track of guesses, each loop will eventually trigger the conditional check,
        while (correctGuesses < 3 && wrongGuesses < 3)
        {
            for (int i = 0; i < pritheeTokens.length; i++)
            {
                if (rand.nextInt(0, 20) == 19 || i == pritheeTokens.length - 1)
                {
                    for (int k = 0; k < pritheeTokens[i].length(); k++)
                    {
                        IO.print("_");
                    }
                    IO.println("\nGuess: ");
                    guess = IO.readln();
                    
                    if (guess.equals(pritheeTokens[i])) correctGuesses++;
                    else wrongGuesses++;

                    IO.println("Correct Guesses: " + correctGuesses + ", Incorrect Guesses: " + wrongGuesses);
                    break;
                }
                else
                {
                    IO.print(pritheeTokens[i] + " ");
                }
            }
        }
    }
}







