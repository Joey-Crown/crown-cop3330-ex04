/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Crown
 */
package base;

import java.util.Scanner;

/*Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then
construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into
a story that you create.

Example Output

Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints

Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges

Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner noun = new Scanner(System.in);
        Scanner verb = new Scanner(System.in);
        Scanner adjective = new Scanner(System.in);
        Scanner adverb = new Scanner(System.in);

        // input noun
        System.out.print("Enter a noun: ");
        String outputNoun =  noun.nextLine();

        // input verb
        System.out.print("Enter a verb: ");
        String outputVerb =  verb.nextLine();

        // input adjective
        System.out.print("Enter a adjective: ");
        String outputAdjective =  adjective.nextLine();

        // input adverb
        System.out.print("Enter a adverb: ");
        String outputAdverb =  adverb.nextLine();

        // output
        System.out.println("The " + outputAdjective + " " + outputNoun + " will be " + outputAdverb + " " + outputVerb + " after all of this!");
    }
}
