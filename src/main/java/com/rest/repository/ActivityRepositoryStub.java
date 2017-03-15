package com.rest.repository;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Activity;
import com.rest.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		
		//	select * from activities where description in (?, ?, ?) and duration > ? and duration < ?
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		
		activity.setId("724");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}
	
	@Override
	public void create(Activity activity) {
		// should issue an insert statement to the db
	}
	
	
	@Override
	public void delete(String activityId) {

		//delete from activity where activityId = ?
		
	}
	
	@Override
	public Activity update(Activity activity) {
		
		// idempotent functionality
		// search database to see if we have an activity with that id  already
		//select * from Activity where id=?
		// if rs size == 0
		// insert activity into Activity table
		//else
		//update the Activity
		
		return activity;
		
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

		if (activityId.equals("7777")) { // 7777 is just hard coded value
											// instead of database
			return null;
		}
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
