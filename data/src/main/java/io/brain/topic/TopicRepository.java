package io.brain.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.brain.course.Course;
import java.util.Optional;

@Repository
public interface TopicRepository extends CrudRepository<TOPICS, Integer>
{
 //    Optional<TOPICS> findById(String id);

     //void save(TOPICS top,String id);
     //sTOPICS findBytopicId(String topicId);
     TOPICS findById(int id);

}
