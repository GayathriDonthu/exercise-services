package com.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rest.model.Activity;
import com.rest.repository.ActivityRepository;
import com.rest.repository.ActivityRepositoryStub;

@Path("search/activities")
public class ActivitySearchResource {

	private ActivityRepository activityRepository = new ActivityRepositoryStub();

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response searchForActivities(@QueryParam(value = "description") List<String> descriptions,
			@QueryParam(value = "durationFrom") int durationFrom, @QueryParam(value = "durationTo") int durationTo) {

		System.out.println(descriptions +", " + durationFrom + ", " + durationTo );

		List<Activity> activities = activityRepository.findByDescription(descriptions, durationFrom, durationTo);

		if (activities == null | activities.size() <= 0) {
			return Response.status(Status.NOT_FOUND).build();
		}

		return Response.ok().entity(new GenericEntity<List<Activity>>(activities) {
		}).build();
	}

}
