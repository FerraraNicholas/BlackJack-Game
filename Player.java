package com.ualbany.blackjack;

//The player class inherits from the Person class
public class Player extends Person {
	//Instance variables
	//Composition
	public Card[] hand = new Card[10];
	private int numCards;
	
	//Constructor
	public Player(String name){
		super(name);
		this.emptyHand();
	}
	
	//Method to empty the hand of all cards
	public void emptyHand(){
		for (int i = 0; i < 10; i++){
			this.hand[i] = null;
		}
		this.numCards = 0;
	}
	
	//Method to add a card to the Players hand
	public boolean addCard(Card card){
		if (this.numCards == 10){
			System.out.println("Too many cards");
		}
		this.hand[this.numCards] = card;
		this.numCards++;
		return (this.getHandSum() <= 21);
		
	}
	
	//Method to get the sum of all the cards in the hand
	public int getHandSum() {
		int handSum = 0;
		int cardNum;
		int numAces = 0;
		for (int i = 0; i < this.numCards; i++){
			cardNum = this.hand[i].getValue();
			if (cardNum == 1){
				numAces++;
				handSum += 11;
			}else if (cardNum > 10){
				handSum += 10;	
			}else{
				handSum += cardNum;
			}			
		}
		while(handSum > 21 && numAces > 0){
			handSum -= 10;
			numAces--;
		}
		return handSum;
	}
	
	//Print all the cards in the hand - dealer option to not show cards
	public void print(boolean showFirst){
		System.out.println(super.getName());
		for (int i = 0; i < numCards; i++){
			if( i == 0 && !showFirst){
				System.out.print("[Hidden]");
			} else {
				System.out.print(this.hand[i].toString());
			}
		}
	}
	
	//Overridden toString method
	public String toString(){
		return "Name: " + super.getName();
	}
}
