package io.brain.course;

import io.brain.topic.TOPICS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Course {

    @Id
    private int id;
    private String name;

    @ManyToOne
    private TOPICS topics;

    public TOPICS getTopics() {
        return topics;
    }

    public void setTopics(TOPICS topics) {
        this.topics = topics;
    }

    public Course() {
    }



    public int getId() {
        return id;
    }


    public Course(int id, String name,int topicId) {
        super();
        this.id = id;
        this.name = name;
        this.topics=new TOPICS(topicId," ");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
