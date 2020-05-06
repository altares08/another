package com.example.demo.model.request;

public class WebhookRequest {
	private String responseId;

	private String session;

	private QueryResult queryResult;

	private OriginalDetectIntentRequest originalDetectIntentRequest;

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getResponseId() {
		return this.responseId;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSession() {
		return this.session;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public QueryResult getQueryResult() {
		return this.queryResult;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return this.originalDetectIntentRequest;
	}

	@Override
	public String toString() {
		return "WebhookRequest [responseId=" + responseId + ", session=" + session + ", queryResult=" + queryResult
				+ ", originalDetectIntentRequest=" + originalDetectIntentRequest + "]";
	}
	
}