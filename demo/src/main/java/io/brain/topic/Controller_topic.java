package io.brain.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller_topic {
    @Autowired
    private TopicService topic;

    @RequestMapping("/topic")
    public List<TOPICS> topic(){
        return topic.getall();

    }
    @RequestMapping("/topic/{id}")
    public TOPICS getid(@PathVariable String id){
        return topic.getdata(id);
    }
    /*@RequestMapping(method = RequestMethod.POST,value = "/topic")
    public void putvalue(@RequestBody TOPICS top){
        topic.addvalue(top);

    }

     */
    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{id}")
    public void updatevalue(@RequestBody TOPICS top, @PathVariable String id){
        topic.update(id,top);


    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public void deletevalue(@PathVariable String id){
        topic.delete(id);
    }
}
