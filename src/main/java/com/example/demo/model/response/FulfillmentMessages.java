package com.example.demo.model.response;

public class FulfillmentMessages {
	
	private Card card;

	public void setCard(Card card) {
		this.card = card;
	}

	public Card getCard() {
		return this.card;
	}

	@Override
	public String toString() {
		return "FulfillmentMessages [card=" + card + "]";
	}
	
}