package com.example.demo.model.response;

public class SimpleResponse {
	private String textToSpeech;

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public String getTextToSpeech() {
		return this.textToSpeech;
	}

	@Override
	public String toString() {
		return "SimpleResponse [textToSpeech=" + textToSpeech + "]";
	}
	
}