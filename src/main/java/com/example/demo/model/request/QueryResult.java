package com.example.demo.model.request;

import java.util.List;
import java.util.Map;

public class QueryResult {
	private String queryText;

	private Map<String, String> parameters;

	private boolean allRequiredParamsPresent;

	private String fulfillmentText;

	private List<FulfillmentMessages> fulfillmentMessages;

	private List<OutputContexts> outputContexts;

	private Intent intent;

	private int intentDetectionConfidence;

	private DiagnosticInfo diagnosticInfo;

	private String languageCode;

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getQueryText() {
		return this.queryText;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Map<String, String> getParameters() {
		return this.parameters;
	}

	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	public boolean getAllRequiredParamsPresent() {
		return this.allRequiredParamsPresent;
	}

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

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public List<OutputContexts> getOutputContexts() {
		return this.outputContexts;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public Intent getIntent() {
		return this.intent;
	}

	public void setIntentDetectionConfidence(int intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	public int getIntentDetectionConfidence() {
		return this.intentDetectionConfidence;
	}

	public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	public DiagnosticInfo getDiagnosticInfo() {
		return this.diagnosticInfo;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	@Override
	public String toString() {
		return "QueryResult [queryText=" + queryText + ", parameters=" + parameters + ", allRequiredParamsPresent="
				+ allRequiredParamsPresent + ", fulfillmentText=" + fulfillmentText + ", fulfillmentMessages="
				+ fulfillmentMessages + ", outputContexts=" + outputContexts + ", intent=" + intent
				+ ", intentDetectionConfidence=" + intentDetectionConfidence + ", diagnosticInfo=" + diagnosticInfo
				+ ", languageCode=" + languageCode + "]";
	}

}