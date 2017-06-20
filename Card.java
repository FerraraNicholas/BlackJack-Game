package com.ualbany.blackjack;


public class Card implements ICard<Integer> {
	//Instance variables
	protected int faceValue;
	protected Suit suit;
	
	//Constructor
	public Card(Suit suit, int value){
		this.faceValue = value;
		this.suit = suit;
	}

	//Accesor to get the suit
	public Suit getSuit(){
		return this.suit;
	}
	
	//Accesor to get the value of the card
	public Integer getValue(){
		return this.faceValue;
	}
	
	//Overrided toString method
	public String toString(){
		return "Suit: " + suit + "\t Value: " + faceValue + "\t";
	}	
}
