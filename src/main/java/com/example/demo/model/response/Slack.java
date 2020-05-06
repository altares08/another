package com.example.demo.model.response;

public class Slack {
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	@Override
	public String toString() {
		return "Slack [text=" + text + "]";
	}
	
}