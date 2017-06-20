package com.ualbany.blackjack;

public class Casino {
	//Instance variables
	//Composition
	Player p1;
	Player p2;
	Deck deck;
	//Singleton Design Pattern
	public static Casino instance = null;
	
	//Facade design pattern
	public Casino(){
		p1 = new Player("Nick");
		p2 = new Player("Amanda");
		deck = new Deck<Card>();			
	}
	
	//Create one and only one instance of a casino
	private synchronized static void createInstance(){
		if (instance == null){
			instance = new Casino();
		}
	}
	
	//Method to return the running instance of the casino
	public static Casino getInstance(){
		if (instance == null){
			createInstance();
		}
		return instance;
	}
}
