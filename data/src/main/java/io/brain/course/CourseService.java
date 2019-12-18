package io.brain.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course>topics;
//
//    @Autowired
//    public TopicService() {
//s
//        topics = new ArrayList<>(Arrays.asList(new Course(1, "kunal"), new Course(2, "jatin")));
//    }

    public List<Course>getallbyTopicid(int topicId){

        List<Course>courses=new ArrayList<>();

        courses.addAll(courseRepository.findByTopicsId(topicId));
        return courses;



    }
   public Course getdata(int id){
        return courseRepository.findByTopicId(id);
    }
    public  void addvalue(Course course){
        courseRepository.save(course);
    }

    public void update(Course course) {
        courseRepository.save(course);
    }

    public void delete(int id) {
      courseRepository.deleteById(id);
   }
}
