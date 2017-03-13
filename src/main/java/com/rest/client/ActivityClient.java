package com.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.rest.model.Activity;

public class ActivityClient {
	
	private Client client;
	
	public ActivityClient() {
		client = ClientBuilder.newClient();
	}
	
	public Activity get(String id){
		
		// http://localhost:8080/exercise-services/webapi/activities/1234
		System.out.println("id is :"+ id);
		WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");
		
		Activity response = target.path("activities/"+ id).request().get(Activity.class);
		
		return response;
	}
	
}
