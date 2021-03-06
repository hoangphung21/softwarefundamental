/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author HoangPhung
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card value: ");
        int uservalue = sc.nextInt();
        System.out.println("Enter the card suit: " );
        String usersuit = sc.next();
        
        boolean endgame = false;
        int counter = 0;
        
        do{
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
           
            
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUIT[(int)(Math.random()*4)]);
        
            
            if ((c.getValue() == uservalue) && (c.getSuit().equals(usersuit))){
                endgame = true;
            }
            else {
                System.out.println(c.getValue()+ " "+ c.getSuit());
                counter++;
            }
       
       
        
        
        // and search magicHand here
        //Then report the result here
    }
        }while(counter <7);
        
        if (endgame == false){
            System.out.println("Game over");
        }
        else if(endgame){
            System.out.println("match!");
        }
        
    }
}
