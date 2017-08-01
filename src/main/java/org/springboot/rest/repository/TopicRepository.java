package org.springboot.rest.repository;

import org.springboot.rest.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
