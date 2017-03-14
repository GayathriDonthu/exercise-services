package com.rest.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.rest.model.Activity;

public class ActivityClientTest {

	// Test for PUT
	@Test
	public void testPut() {
		Activity activity = new Activity();

		activity.setId("683");
		activity.setDescription("Yoga");
		activity.setDuration(30);

		ActivityClient client = new ActivityClient();

		activity = client.update(activity);

		assertNotNull(activity);
	}

	// Test for post
	@Test
	public void testCreate() {

		ActivityClient client = new ActivityClient();
		Activity activity = new Activity();
		activity.setDescription("Walking");
		activity.setDuration(85);

		client.create(activity);

		assertNotNull(activity);
	}

	// Test for retrieving an activity
	@Test
	public void testGet() {

		ActivityClient client = new ActivityClient();

		Activity activity = client.get("1234");

		System.out.println(activity);

		assertNotNull(activity);

	}

	// Test for retrieving list of activities
	@Test
	public void testGetList() {

		ActivityClient client = new ActivityClient();

		List<Activity> activities = client.get();

		System.out.println(activities);

		assertNotNull(activities);

	}

	@Test(expected = RuntimeException.class)
	public void testGetWithBadRequest() {
		ActivityClient client = new ActivityClient();

		client.get("123");
	}

	// Test for 404
	@Test // (expected=RuntimeException.class)
	public void testGetWithNotFound() {
		ActivityClient client = new ActivityClient();

		client.get("7777");
	}

}
