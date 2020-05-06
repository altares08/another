package com.example.demo.model.response;

public class Button {
	private String text;

	private String postback;

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setPostback(String postback) {
		this.postback = postback;
	}

	public String getPostback() {
		return this.postback;
	}

	@Override
	public String toString() {
		return "Button [text=" + text + ", postback=" + postback + "]";
	}
	
}