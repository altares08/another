package com.example.demo.model.response;

import java.util.List;

public class WebhookResponse {
	
	private String fulfillmentText;

	private List<FulfillmentMessages> fulfillmentMessages;

	private String source;

	private Payload payload;

	private List<OutputContexts> outputContexts;

	private FollowupEventInput followupEventInput;

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public String getFulfillmentText() {
		return this.fulfillmentText;
	}

	public void setFulfillmentMessages(List<FulfillmentMessages> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public List<FulfillmentMessages> getFulfillmentMessages() {
		return this.fulfillmentMessages;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public Payload getPayload() {
		return this.payload;
	}

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public List<OutputContexts> getOutputContexts() {
		return this.outputContexts;
	}

	public void setFollowupEventInput(FollowupEventInput followupEventInput) {
		this.followupEventInput = followupEventInput;
	}

	public FollowupEventInput getFollowupEventInput() {
		return this.followupEventInput;
	}

	@Override
	public String toString() {
		return "WebhookResponse [fulfillmentText=" + fulfillmentText + ", fulfillmentMessages=" + fulfillmentMessages
				+ ", source=" + source + ", payload=" + payload + ", outputContexts=" + outputContexts
				+ ", followupEventInput=" + followupEventInput + "]";
	}

}