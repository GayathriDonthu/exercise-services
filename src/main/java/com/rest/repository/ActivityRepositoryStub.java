package com.rest.repository;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Activity;
import com.rest.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	
	@Override
	public void create(Activity activity) {
		//should issue an insert statement to the db
	}
	
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();

		Activity activity1 = new Activity();

		activity1.setDescription("Walking");
		activity1.setDuration(85);

		activities.add(activity1);

		Activity activity2 = new Activity();

		activity2.setDescription("Cycling");
		activity2.setDuration(20);

		activities.add(activity2);

		return activities;

	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		// We can pull the activities from database here 
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Walking");
		activity1.setDuration(85);
		
		User user = new User();
		
		user.setId("5678");
		user.setName("Gayathri");
		
		activity1.setUser(user);
		
		return activity1;
	}
	
	
}
