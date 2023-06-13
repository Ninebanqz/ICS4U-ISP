package com.mycompany.game;

import java.util.Random;

/**
 *
 * @author alext
 */
public class deck {
    private Card[] cards;
    private int numbCards;
    
    public deck(){
        this.numbCards = 36;
        this.cards = new Card[this.numbCards];
        int c = 0;
        
        //for each suit
        for(int i = 0; i < 4; i++){
        
            //for each card number
            for(int n = 1; n <=9; n++){
                
                this.cards[c] = new Card(Suit.values()[i],n);
                c++;
            }
        }
        //this shuffles the deck and i dont have it on now for testing purposes
        //this.shuffle();
    }  
    
    //hey look we learned this stuff this year
    public void shuffle(){
            Random ran = new Random();
            Card temp;
            int ctr;
            for(int i = 0; i < this.numbCards; i++){
                ctr = ran.nextInt(this. numbCards);
            
                //swap 
                temp = this.cards[i];
                this.cards[i] = this.cards[ctr];
                this.cards[ctr] = temp;
            }
        }
    
    // deals cards to each player
    public Card dealNextCard(){        
        Card top = this.cards[0];
        
        for(int ctr = 1; ctr < this.numbCards; ctr++ ){
            this.cards[ctr-1] = this.cards[ctr];
        }
        this.cards[this.numbCards-1] = null;
        this.numbCards--;
        return top;
    }    
    
    public void printDeck(int numToPrint){
        for(int i = 0; i <numToPrint; i++){
            
            //some guys code to print out the deck of cards 
            //its really cool cause you can format it however you want
            System.out.printf("% 3d/%d %s\n", 
                    i +1, 
                    this.numbCards,
                    this.cards[i].toString());
            System.out.printf("\t\t[%d other]\n",
                    this.numbCards-numToPrint); 
        }
    }
}
