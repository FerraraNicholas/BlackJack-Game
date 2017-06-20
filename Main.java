package com.ualbany.blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Singleton design pattern
		Casino.getInstance();
		Casino.getInstance().deck.shuffle();
		boolean p1Done = false;
		boolean p2Done = false;		
		boolean p1Busted = false;
		Casino.getInstance().p1.addCard(Casino.getInstance().deck.dealNextCard());
		Casino.getInstance().p2.addCard(Casino.getInstance().deck.dealNextCard());
		Casino.getInstance().p1.addCard(Casino.getInstance().deck.dealNextCard());
		Casino.getInstance().p2.addCard(Casino.getInstance().deck.dealNextCard());
		while(p1Done != true && p1Done != true){
			if (Casino.getInstance().p1.getHandSum() < 14){
				Casino.getInstance().p1.addCard(Casino.getInstance().deck.dealNextCard());
				p1Done = false;
				if(Casino.getInstance().p1.getHandSum() > 21){
					p1Busted = true;
				}
			} else {
				p1Done = true;
			}
			if(p1Busted == true){
				p2Done = true;
			} else if(Casino.getInstance().p2.getHandSum() < 14){
				Casino.getInstance().p2.addCard(Casino.getInstance().deck.dealNextCard());
				p2Done = false;
			} else {
				p2Done = true;
			}
		}
		if(Casino.getInstance().p1.getHandSum() > Casino.instance.p2.getHandSum() && Casino.getInstance().p1.getHandSum() <=21){
			System.out.println("Player 1 wins with " + Casino.getInstance().p1.getHandSum());
		}else if (Casino.getInstance().p2.getHandSum() > Casino.getInstance().p1.getHandSum() && Casino.getInstance().p2.getHandSum() <=21){
			System.out.println("Player 2 wins with " + Casino.getInstance().p1.getHandSum());
			
		} else {
			System.out.print("Both players busted");	
			}
		}		
	}