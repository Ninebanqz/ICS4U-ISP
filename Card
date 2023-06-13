package com.mycompany.game;


public class Card {
    
    //declared suit and card number, set as private so you cant call the suits and cardNum in other classes
    private Suit Suits;
    private int cardNum;
    
    //setters
    public Card(Suit aSuits, int aCardNum){
        this.Suits = aSuits;
        
        if(aCardNum >= 0 && aCardNum<= 8){
        this.cardNum = aCardNum;    
        }         
    }
    
    //sets card Values so I can code the actaul game where the cards have to be higher then one another
    public int cardValue(){
        
        int tempCardSuitValue = 0;
        int tempCardNumValue = 0;
        int cardSumValue;
        
        //this seperates my cards into seperate catagories so I can sort with them on my own
        if(Suits.toString().equals("Clubs")){
            tempCardSuitValue = 0;
        }
        else if(Suits.toString().equals("Diamonds")){
            tempCardSuitValue = 10;
        }
        else if(Suits.toString().equals("Spades")){
            tempCardSuitValue = 20; 
        }
        else if(Suits.toString().equals("Hearts")){
            tempCardSuitValue = 30;  
        } else{
            System.out.println("error in cardValue method, in Card class");
        }
        
        // tryna fix the ace cause it acts as 0
        if(this.cardNum == 0){
            tempCardNumValue = this.cardNum + 9;
        } else{
            
        tempCardNumValue = this.cardNum;
        }
        
        cardSumValue = tempCardSuitValue + tempCardNumValue;
        
        return cardSumValue;
    }
    
    
    //returns cardNumber in printed form
    public int getNumber(){
    return cardNum;       
    }   
    
    public String toString(){
        String numStr = "problem in Card file";
        
        if (this.cardNum == 1){
            numStr = "Six";
        }
        else if (this.cardNum == 2){
            numStr = "Seven";
        }
        else if (this.cardNum == 3){
            numStr = "Eight";
        }
        else if (this.cardNum == 4){
            numStr = "Nine";
        }
        else if (this.cardNum == 5){
            numStr = "Ten";
        }
        else if (this.cardNum == 6){
            numStr = "Jack";
        }
        else if (this.cardNum == 7){
            numStr = "Queen";
        }
        else if (this.cardNum == 8){
            numStr = "King";
        }
        else if(this.cardNum == 0){
            numStr = "Ace";
        }
        return numStr + " of " + Suits.toString() + " value of cards: " + cardValue();    
    }
}
