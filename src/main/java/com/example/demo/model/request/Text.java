package com.example.demo.model.request;

import java.util.List;

public class Text {
	private List<String> text;

	public void setText(List<String> text) {
		this.text = text;
	}

	public List<String> getText() {
		return this.text;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + "]";
	}
	
}