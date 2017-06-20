package com.ualbany.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck <T extends Card> {
	//Instance variables
	//Composition
	private Card[] cards;
	private int numCards;
	
	//Default constructor
	public Deck(){
		this(1, false);
	}
	//Overloaded constructor
	public Deck(int numOfDeck, boolean shuffle){
		this.numCards = numOfDeck * 52;
		this.cards = new Card[this.numCards];
		int c = 0;
		//for each deck
		for (int i = 0; i < numOfDeck; i++){
			//for each suit
			for (int j = 0; j < 4; j++){
				//for each value
				for (int k = 1; k <= 13; k++){
					this.cards[c] = new Card(Suit.values()[j], k);
					c++;
				}	
			}
		}
		if (shuffle) {
			this.shuffle();
		}	
	}
	//Method to shuffle the cards in the deck
	public void shuffle() {
		Random rand = new Random();
		Card temp;
		int j;
		for(int i = 0; i < this.numCards; i++){
			j = rand.nextInt(this.numCards);
			temp = this.cards[i];
			this.cards[i] = this.cards[j];
			this.cards[j] = temp;		
		}	
	}
	
	//Method to deal the top card
	public Card dealNextCard(){
		Card top = this.cards[0];
		for (int i = 1; i < numCards; i++){
			this.cards[i - 1] = this.cards[i];
		}
		this.cards[this.numCards - 1] = null;
		this.numCards--;
		return top;	
	}
	
	//Print the cards in the deck
	public void print(){
		for (int i = 0; i < numCards; i++){
			System.out.println(this.cards[i].toString());
		}	
	}
}
