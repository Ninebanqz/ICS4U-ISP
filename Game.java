package com.mycompany.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        //prints out the whole deck for error purposes
        deck myDeck = new deck();
        
        int cardUsed = 1;
        
        myDeck.printDeck(36);
        
        // creates players from the player class ( can add as many as i want or remove as many as I want)
        Player me = new Player("kwok");
        Player dealer = new Player("Alexandru");
        
        Player suitOfGame = new Player("Game");
        Player mePlay = new Player("Game");
        
        // the starting card of the game
        //suitOfGame.FirstCard(myDeck.dealNextCard());
        //System.out.println("\nthe starting card of the game is ");
        //suitOfGame.printGameCard();
        
        //deals 6 cards to each player as in durak
        for (int i = 0; i<6; i++){
        me.addCard(myDeck.dealNextCard());
        dealer.addCard(myDeck.dealNextCard());
        }
        
        // prints out dealt cards
        System.out.println("cards dealt\n");
        dealer.printHand(true);
        me.printHand(true);
 
        // scanner for the which card youd like to play input 
        System.out.println("please input which card you would like to play");
        Scanner scan = new Scanner(System.in);
        cardUsed = scan.nextInt();
        
        //How the user uses his cards
        //mePlay.playCard(myDeck.dealNextCard(), cardUsed);       
        //System.out.println("card the first user added");
        //mePlay.printGameCard();
        
        
    }
}
