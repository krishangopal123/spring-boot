package io.brain.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;



    public List<TOPICS>getall(){

        List<TOPICS>topics=new ArrayList<>();
        topics.addAll((Collection<? extends TOPICS>) topicRepository.findAll());
        return topics;



    }
    public TOPICS getdata(int value){
        return topicRepository.findById(value);
    }
    public  void addvalue(TOPICS to){
        topicRepository.save(to);
    }

    public void updateit(int topicId, TOPICS top) {
       TOPICS top1=topicRepository.findById(topicId);
       top1.setName(top.getName());
       top1.setId(top.getId());
       topicRepository.save(top1);




    }
}
