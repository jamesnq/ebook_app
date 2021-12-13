package com.lttbdd.ebook_app;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String id;
    public Book(String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

