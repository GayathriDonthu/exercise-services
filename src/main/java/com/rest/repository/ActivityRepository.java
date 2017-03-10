package com.rest.repository;

import java.util.List;

import com.rest.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

}