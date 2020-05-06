package com.example.demo.model.request;

public class FulfillmentMessages {
	private Text text;

	public void setText(Text text) {
		this.text = text;
	}

	public Text getText() {
		return this.text;
	}

	@Override
	public String toString() {
		return "FulfillmentMessages [text=" + text + "]";
	}
	
}