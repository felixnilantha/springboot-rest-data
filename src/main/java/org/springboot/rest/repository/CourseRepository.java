package org.springboot.rest.repository;

import java.util.List;

import org.springboot.rest.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByName(String name);
	public List<Course> findByTopicId(String topicId);

}
