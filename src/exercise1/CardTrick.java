package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Ana Patel 26th May 2022
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(new Random().nextInt(13));
            
            card.setSuit(Card.SUITS[new Random().nextInt(4)]);
            hand[i] = card;
        }
        
        System.out.println("Please enter card value from 1-10 and 11,12,13 for jack,queen and king");
        int cardValue = input.nextInt();
        
        System.out.println("Please enter suit value from 1-4 for Hearts, Diamonds, Spades and Clubs");
        int cardSuit = input.nextInt();

        for(int i = 0; i < hand.length; i++) {
            if(hand[i].getValue() == cardValue && hand[i].getSuit() == Card.SUITS[cardSuit-1]){
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Ana Patel 26th May 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ana, but you can call me Ana");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To explore in dancing");
        System.out.println("-- Learn new things in software development");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Dancing");
        System.out.println("-- Cooking");
        System.out.println("-- Playing sports like badminton");

        System.out.println();
        
    
    }

}
