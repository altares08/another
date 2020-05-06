package com.example.demo.controller;

import com.example.demo.model.request.WebhookRequest;
import com.example.demo.model.response.WebhookResponse;
import com.example.demo.services.Stores;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/chatbot")
public class WebhookController {

	@PostMapping(path = "/webhook" , produces = "application/json", consumes = "application/json")
	public WebhookResponse webhook(@RequestBody WebhookRequest request) {
		WebhookResponse response = new WebhookResponse();
		
		System.out.println("Request ==="+request);
		
		String intent = request.getQueryResult().getIntent().getDisplayName().toLowerCase();
		
		switch (intent) {
		case "order_tracking":
			response.setFulfillmentText("Order Tracking");
			break;

		case "faq":
			getFAQResponse(request);
			break;
			
		case "store_locator":	
			response.setFulfillmentText(getStoreLocatorResponse(request));
			break;
			
		default:
			response.setFulfillmentText("Sample text from webhook");
			break;
		}
		
		System.out.println("Response ==="+response);
		return response;
	}

	@Autowired
	private Stores stores;

	private String getStoreLocatorResponse(WebhookRequest request) {
		Map<String, String> params = request.getQueryResult().getOutputContexts().get(0).getParameters();
		String zipcode = null;

		System.out.println("request params ::: "+params);

		if(!CollectionUtils.isEmpty(params)) {
			zipcode = params.get("zipcode");
		}
		System.out.println("zip code ::: "+zipcode);
		String storesList = null;
		try {
			storesList =  stores.getStoresByZipCode(zipcode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return storesList;
	}

	private void getFAQResponse(WebhookRequest request) {
		// TODO Auto-generated method stub
		
	}
}
