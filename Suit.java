package com.ualbany.blackjack;

public enum Suit {
	Club (0),
	Diamond (1),
	Heart (2),
	Spade (3);
	
	//Instance variable
	private int value;
	//Constructor
	private Suit (int v){
		value = v;
	} 
	
	//Accessor to get the value
	public int getValue() {
		return this.value;
	}
	
	//Accessor to get the value of the suit
	public static Suit getSuitValue(int value){
		switch (value) {
		case 0:
			return Suit.Club;
		case 1:
			return Suit.Diamond;
		case 2:
			return Suit.Heart;
		case 3:
			return Suit.Spade;
		default:
			return null;
		}
	}
}
