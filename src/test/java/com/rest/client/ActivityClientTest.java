package com.rest.client;

import org.junit.Test;

import com.rest.model.Activity;

import static org.junit.Assert.*;

public class ActivityClientTest {

	@Test
	public void testGet() {
		
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("1234");
		
		System.out.println(activity);
		
		assertNotNull(activity);
		
	}

}
