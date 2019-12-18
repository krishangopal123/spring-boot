package io.brain.topic;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Id;

import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.lang.annotation.Documented;

@Entity

public class TOPICS {

    @Id
    private int  id;

    public TOPICS() {
    }

    private String name;


    public int getId() {
        return id;
    }

    public TOPICS(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
