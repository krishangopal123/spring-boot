package io.brain.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>
{

     Optional<Course> findById(int id);
     List<Course> findByTopicsId(int topicId);
     void deleteById(int id);
     Course findByTopicId(int id);

}
