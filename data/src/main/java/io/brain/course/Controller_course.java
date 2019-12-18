package io.brain.course;

import io.brain.topic.TOPICS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller_course {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topic/{topicId}/course")
    public List<Course> course(@PathVariable int topicId){
        return courseService.getallbyTopicid(topicId);

    }
    @RequestMapping("/topic/{topicId}/course/{courseId}")
    public Course getid(@PathVariable int courseId){
       return courseService.getdata(courseId);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topic/{topicId}/course")
    public void putvalue(@RequestBody Course course,@PathVariable int topicId){
        course.setTopics(new TOPICS(topicId," "));
        courseService.addvalue(course);

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{topicId}/course/{courseId}")
    public void updatevalue(@RequestBody Course course, @PathVariable int topicId,@PathVariable int courseId){
        //course.setTopics(new TOPICS(topicId," "));
        courseService.update(course);


    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{topicId}/course/{courseId}")
    public void deletevalue(@PathVariable int courseId){
       courseService.delete(courseId);
    }
}
