package com.utag.phase1.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class Tag implements Serializable{
//setText("进度：0"+"/"+ getTotal());
    /**
     *
     */
    private int id;


    /**
     *
     */
    private Map<String, ArrayList<Double[][]>> description;


    public Tag() {
    }


    public Tag(int id, Map<String, ArrayList<Double[][]>> description) {
        this.id = id;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, ArrayList<Double[][]>> getDescription() {
        return description;
    }

    public void setDescription(Map<String, ArrayList<Double[][]>> description) {
        this.description = description;
    }

}
