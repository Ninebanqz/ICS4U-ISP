package com.mycompany.game;

public class Game {

    public static void main(String[] args) {
        
        //prints out the whole deck for error purposes
        deck myDeck = new deck();
        myDeck.printDeck(36);
        
        // creates players from the player class ( can add as many as i want or remove as many as I want)
        Player me = new Player("kwok");
        Player dealer = new Player("Alexandru");
        
        //deals 6 cards to each player as in durak
        for (int i = 0; i<6; i++){
        me.addCard(myDeck.dealNextCard());
        dealer.addCard(myDeck.dealNextCard());
        }
        
        // prints out dealt cards
        System.out.println("cards dealt\n");
        dealer.printHand(true);
        me.printHand(true);
        
    }
}
