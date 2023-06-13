/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author alext
 */
public class Player {
    
    private String name;
    private Card[] hand = new Card[36];
    private int numCards;
    
    //initiates players name
    public Player(String name){
        this.name = name;
    }  

    //adds card to hand
    public void addCard(Card card){
        this.hand[this.numCards] = card;
        this.numCards++;
    }
    
    //some guy used this for black jack and it prints deck so I stole it off him
    public void printHand(boolean showFirstCard){
        System.out.println(this.name);
        for(int i = 0; i < this.numCards; i++){
            if(i == 0 && !showFirstCard){
              System.out.println("hidden");
            } else{
                System.out.printf("%s\n", this.hand[i].toString());
            }
        }
    }
}
