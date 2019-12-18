package io.brain.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<TOPICS>topics;

    public TopicService() {

        topics = new ArrayList<>(Arrays.asList(new TOPICS(1, "kunal"), new TOPICS(2, "jatin")));
    }

    public List<TOPICS>getall(){
        return topics;
    }
    public TOPICS getdata(String value){
        int n=topics.size();
        TOPICS t=null;
        for(int i=0;i<n;i++){
            if(topics.get(i).getName().equals(value)){
                t=topics.get(i);
                break;
            }
        }
        return t;
    }
    public  void addvalue(TOPICS to){
        topics.add(to);
    }

    public void update(String id, TOPICS top) {
        for(int i=0;i<topics.size();i++){
            if(topics.get(i).getName().equals(id)){
                topics.set(i,top);
            }
        }
    }

    public void delete(String id) {
        for(int i=0;i<topics.size();i++){
            if(topics.get(i).getName().equals(id)){
                topics.remove(i);
            }
        }
    }
}
