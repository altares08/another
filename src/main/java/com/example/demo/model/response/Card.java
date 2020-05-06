package com.example.demo.model.response;

import java.util.List;

public class Card {
	private String title;

	private String subtitle;

	private String imageUri;

	private List<Button> buttons;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}

	public List<Button> getButtons() {
		return this.buttons;
	}

	@Override
	public String toString() {
		return "Card [title=" + title + ", subtitle=" + subtitle + ", imageUri=" + imageUri + ", buttons=" + buttons
				+ "]";
	}

}