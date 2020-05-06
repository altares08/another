package com.example.demo.model.response;

import java.util.List;

public class RichResponse {
	private List<Item> items;

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return this.items;
	}

	@Override
	public String toString() {
		return "RichResponse [items=" + items + "]";
	}
	
}