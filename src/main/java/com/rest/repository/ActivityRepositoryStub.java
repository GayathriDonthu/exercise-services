package com.rest.repository;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

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
}
